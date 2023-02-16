import json
import datetime
import os
import fnmatch

from src.FusionResultsExecution import *
from src.ProjectSupport import *

NOFAILING = "no-failing"
## a simple clustering: cluster together if same failing tests
def clusterPatches(resultOfPatches, resultDir = os.path.realpath("./Patches/patchesDRR/")):
	clusters = {}
	for resultOfPatch in resultOfPatches['results']:
		patchId = str(resultOfPatch["patch"]).replace(resultDir, "")
		allFailings = []

		if "test_execution" not in resultOfPatch:
			continue

		for testExecuted in resultOfPatch["test_execution"] :
			if "failing" not in testExecuted:
				continue

			if int(testExecuted["failing"]) > 0:
				testId = testExecuted["test"]
				failings =  testExecuted["failings"]
				for failing in failings:
					allFailings.append("{}-{}".format(testId, failing))

		sorted(allFailings)
		if len(allFailings) > 0:
			key = str(",".join(allFailings))
		else:
			key= NOFAILING
		if key not in clusters:
			clusters[key] = [patchId]
		else:
			clusters[key].append(patchId)

	return clusters


# cluster together if patched programs fail at the same line
def clusterPatchesFailingLines(resultOfPatches, resultDir = os.path.realpath("./Patches/patchesDRR/")):
	clusters = {}
	for resultOfPatch in resultOfPatches['results']:
		patchId = str(resultOfPatch["patch"]).replace(resultDir, "")
		patch_id_offset = patchId.find("/Patches/")
		if patch_id_offset != -1:
			patchId = patchId[patch_id_offset + len("/Patches/"):]

		allFailings = []

		#print("-->{}".format(resultOfPatch))

		if "test_execution" not in resultOfPatch:
			continue

		for testExecuted in resultOfPatch["test_execution"] :
			if "failing" not in testExecuted:
				continue

			if int(testExecuted["failing"]) > 0:
				testId = testExecuted["test"]
				failingLines = testExecuted["failing_lines"]
				failingAssertions = testExecuted["failing_assertions"]
				for failing_line_index in range(0, len(failingLines)):
					if len(failingLines[failing_line_index]) == 0:
						continue

					allFailings.append("{}-{}".format(failingLines[failing_line_index][0],
													  failingAssertions[failing_line_index]))

		sorted(allFailings)
		if len(allFailings) > 0:
			key = str(",".join(allFailings))
		else:
			key= NOFAILING
		if key not in clusters:
			clusters[key] = [patchId]
		else:
			clusters[key].append(patchId)

	return clusters


def clusterWithMerge(resultDir, iResultFile, outResults, toolTestGeneration, filter, feature="failingTests",
					 saveMergedResults = False, resultDirExecuted = os.path.realpath("./Patches/patchesDRR/")):
	data = None
	if toolTestGeneration.lower() == "both":
		data, existingEvo = mergeFromTwo(resultDir, iResultFile)
		print("merged for {}:\n{}".format(iResultFile, data))

		if saveMergedResults:

			mergedFile = iResultFile.replace("result_test", "result_both_test")
			pathFileMerged = os.path.join(resultDir, mergedFile)
			print("Path new file execution result merged {}".format(pathFileMerged))
			fe = open(pathFileMerged, "w")
			json.dump(data, fe, indent=4)
			fe.close()
	else:
		print("Clustering in Mode single {}".format(toolTestGeneration.lower()))
		# executeClusteringForBugId(iResultFile, outResults, resultDir, filter, toolTestGeneration)
		with open(os.path.join(resultDir, iResultFile)) as fileResults:

			print("\n****Analyzing {} ".format(iResultFile))
			data = json.load(fileResults)

			fileResults.close()

	print("Data for analyzing: {}".format(data))
	outputName = executeClusteringFromData(data, filter, iResultFile, outResults, toolTestGeneration,
										   feature=feature, resultDir=resultDirExecuted)
	print("Storing clusters at {}".format(outputName))


def executeClusteringForBugId(iResultFile, outResults, resultDir, filter, toolTestGeneration):
	with open(os.path.join(resultDir, iResultFile)) as fileResults:

		print("\n****Analyzing {} ".format(iResultFile))
		data = json.load(fileResults)

		outputName = executeClusteringFromData(data, filter, iResultFile, outResults, toolTestGeneration)

		fileResults.close()

		print("Storing clusters at {}".format(outputName))


def executeClusteringFromData(data, filter, iResultFile, outResults, toolTestGeneration, feature="failingTests",
							  resultDir = os.path.realpath("./Patches/patchesDRR/")):
	resultBug = {}
	if feature == "failingTests":
		clusters = clusterPatches(data, resultDir)
	elif feature == "failingLines":
		clusters = clusterPatchesFailingLines(data, resultDir)
	else:
		print("Error! Unsupported feature for clustering - %s" % feature)
		return ""

	bugid, json_string = expandClusterJson(clusters, filter, iResultFile, resultBug)

	if feature == "failingTests":
		parDir = "{}/{}/{}".format(outResults, "resultsSimpleClustering", toolTestGeneration.lower())
	elif feature == "failingLines":
		parDir = "{}/{}/{}".format(outResults, "resultsClusteringFailingLines", toolTestGeneration.lower())
	else:
		print("Error! Unsupported feature for clustering - %s" % feature)
		return ""

	if not os.path.exists(parDir):
		os.makedirs(parDir)

	outputName = "{}/result_summary_{}_{}.json".format(parDir, toolTestGeneration, bugid)
	filesummary = open(outputName, "w")
	filesummary.write(json_string)
	filesummary.close()
	return outputName


def expandClusterJson(clusters, filter, iResultFile, resultBug):
	print("clusters {} ".format(clusters))
	nrcluster = 0
	clustersOfBugs = []
	for aCluster in clusters:
		nrcluster += 1
		patchesFromCluster = clusters[aCluster]
		print("c{} nr patches {} key: {} {}".format(nrcluster, len(patchesFromCluster), aCluster,
													patchesFromCluster))
		nrFailing = 0 if aCluster == NOFAILING else len(aCluster.split(","))
		clustersOfBugs.append({'cid': nrcluster, 'nr_patches': len(patchesFromCluster), "nrFailing": nrFailing,
							   "failings": aCluster, "patchesFromCluster": patchesFromCluster})
	bugid = iResultFile.replace("result_{}test_exec_".format(filter), "").replace(".json", "")
	resultBug["bugid"] = bugid
	resultBug["nr_clusters"] = nrcluster
	resultBug["clusters"] = clustersOfBugs
	a_datetime = datetime.datetime.now()
	formatted_datetime = a_datetime.isoformat()
	resultBug["date"] = formatted_datetime
	json_string = json.dumps(resultBug, indent=4)
	return bugid, json_string


def mergeResultsSeeds(listResults):

	if len(listResults) is 0:
		return None

	mergedExecutions = readJson(listResults[0])

	print("All to analyze ", len(listResults))
	for otherExecution in listResults[1:]:
		otherExecJson = readJson(otherExecution)

		for onePatchResult in otherExecJson["results"]:
				# find the patch in the merged
				foundPatch = False
				for onePatchInMerged in mergedExecutions["results"]:
					if onePatchResult["patch"] == onePatchInMerged["patch"]:
						print("analyzing ",onePatchResult["patch"])
						foundPatch = True
						newOnes = []

						if "test_execution" not in onePatchResult:
							print("Missing test execution ", onePatchResult)
							continue

						for executionOfTest in onePatchResult["test_execution"]:

							if  executionOfTest in onePatchInMerged["test_execution"]:
								#print("Existing")
								pass
							else:
								#print("adding at the end ", executionOfTest["test"])
								newOnes.append(executionOfTest)
						onePatchInMerged["test_execution"].extend(newOnes)

				if not foundPatch:
					#print("Adding a patch that was not found")
					mergedExecutions["results"].append(onePatchResult)

	return mergedExecutions







def readJson(file):
	data = None
	with open(os.path.join(file)) as fileResults:
		data = json.load(fileResults)
		fileResults.close()
	return data

