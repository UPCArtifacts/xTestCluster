import csv

from src.FindDuplicatePatches import find_duplicate_patches
from src.GenerateTestCases import  *
from src.ExecutorOfTest import  *
from src.Clustering import  *

import logging


logging.basicConfig(format='%(levelname)-8s [%(filename)s:%(lineno)d] %(message)s',
    datefmt='%Y-%m-%d:%H:%M:%S',level=logging.DEBUG)

def runStep1TestGeneration(patchesFolderPaths, singleCheckout, summaryResultsFolder, destinationCheckOut = os.path.realpath("../dataTemp/"),
						   destinationTestGenerated =  os.path.realpath("../dataTempTestGenerated/"), testGenApproaches = [EVOSUITE, RANDOOP], duplicatePatches = None):

	allBugs = retrieveAllBugs(patchesDirs=patchesFolderPaths)
	logging.debug("Mode test generation evosuite?: {}.".format(testGenApproaches))
	logging.debug("bugs to analyze {} :{}".format(patchesFolderPaths, allBugs))
	errors = []

	if duplicatePatches is None or len(duplicatePatches) == 0:
		logging.debug("Init: Search for the duplicated patches")
		duplicatePatches = find_duplicate_patches(patchesFolderPaths, destinationTestGenerated, considerUnassessed=False)

	logging.debug("Running {}".format(patchesFolderPaths))

	for iBug in allBugs:
		try:
			runTestGenerationForBugId(iBug, patchPath=patchesFolderPaths,
									  singleCheckout = singleCheckout,
									  summaryResultsFolder=summaryResultsFolder,
									  destinationCheckOut=destinationCheckOut,
									  destinationTestGenerated=destinationTestGenerated,
									  testGenApproaches = testGenApproaches,
									  duplicatePatches = duplicatePatches)

		except Exception as error:
			logging.error('Error: ' + str(error))
			errors.append(iBug)

	logging.debug("END. errors {}".format(errors))

def getSummaryFileName(dataset, patchPath, logFolder, evosuite = True):
	return "{}/summary_generation_{}{}_{}.json".format(logFolder, "" if evosuite else "randoop_", dataset, os.path.basename(patchPath).replace(".patch", ""))

def saveResults(result, dataset, patchPath, logFolder, evosuite = True ):

	if not os.path.isdir(logFolder):
		logging.debug("Creating dir for log: {}.".format(logFolder))
		os.makedirs(logFolder)

	json_object = json.dumps(result, indent=4)
	filenamelog = getSummaryFileName(dataset, patchPath, logFolder, evosuite= evosuite)
	result["date"] = datetime.datetime.now()

	logging.debug("Save log at {}".format(filenamelog))

	f = open(filenamelog, "w")
	f.write(json_object)
	f.flush()
	f.close()
	return filenamelog

def runStep2TestExecution(patchesFolderPaths, destinationTestGenerated, result,duplicatePatches = None):
	allBugs = retrieveAllBugs(patchesDirs=patchesFolderPaths)
	failingPatches = []
	logging.debug("all bugs to analyze {}".format(allBugs))
	errors = []

	if duplicatePatches == None:
		logging.debug("Init: Search for the duplicated patches")
		duplicatePatches = find_duplicate_patches(patchesFolderPaths, destinationTestGenerated, considerUnassessed=False)


	logging.debug("Running test execution {}".format(patchesFolderPaths))

	for iBug in allBugs:
		try:
			runTestExecutionForBugId(bugid=iBug, pathsToPatches=patchesFolderPaths, destinationTestGenerated=destinationTestGenerated, outResults = result, duplicatePatches = duplicatePatches)

		except Exception as error:
			logging.debug('Error: ' + str(error))
			errors.append(iBug)

	logging.debug("Failing patches {}".format(failingPatches))
	logging.debug("END. errors {}".format(errors))


def alreadyAnalyzed(dataset, patchPath, summaryFolder, evosuite = True):
	p = getSummaryFileName(dataset, patchPath, summaryFolder, evosuite= evosuite)
	logging.debug("checking existence of log file {}".format(p))
	if not os.path.exists(p):
		return False
	else:
		logging.debug("Yes, exists log file {}".format(p))
		f =open(p, "r")
		data = json.load(f)
		f.close()
		if ARRIVE_END in data and data[ARRIVE_END] == OK:
			logging.debug("Previously analyzed complete {}".format(p))
			return True
		else:
			logging.debug("Previously was failing, recomputing {}".format(p))
			return False

def runTestGenerationForBugId(bugid, patchPath, summaryResultsFolder, singleCheckout = False, destinationCheckOut = os.path.realpath("../dataTemp/"),
							  destinationTestGenerated =  os.path.realpath("../dataTempTestGenerated/"), testGenApproaches = [EVOSUITE, RANDOOP], duplicatePatches = None, OVERWRITERESULTS=False):

	logging.debug("\n****Running analysis for bugs {}".format(bugid))
	patches = []
	if duplicatePatches is None or len(duplicatePatches) == 0:
		patches = retrieveAllPatchesFromBugid(bugid, patchPath, considerDunassessed= False)
		logging.debug("Given bugid: {}, at location: {}, ALL Retrieved patches ({}): {} ".format(bugid, patchPath, len(patches), patches))
	else:
		patches = retriveNotDuplicatePatches(bugid, duplicatePatches)
		logging.debug("Given bugid: {}, at location: {}, Retrieved Not Duplicated patches ({}): {} ".format(bugid, patchPath, len(patches),
																						 patches))
	results = []

	if len(patches) < 2:
		logging.debug("Stop execution test generation: {} has less than 2 bugs".format(bugid))
		return None

	for iPatch in patches:
		patchSource = determineSource(iPatch)
		logging.debug("---generating for {}, from source {}".format(iPatch, patchSource))
		if not OVERWRITERESULTS and alreadyAnalyzed(patchSource, iPatch, summaryResultsFolder, evosuite=True) and alreadyAnalyzed(patchSource, iPatch, summaryResultsFolder, evosuite=False):
			logging.debug("Already analyzed {}".format(iPatch))
			results.append((iPatch, None, None))
			continue
		else:
			logging.debug("To analyze {}".format(iPatch))


		#result = runTestGenerationForPatch(iPatch, patchSource= patchSource, singleCheckout= singleCheckout, destinationCheckOut=destinationCheckOut, destinationTestGenerated=destinationTestGenerated, evosuite=evosuite)
		resultAll = runTestGenerationForPatchAllTGApproaches(iPatch, patchSource=patchSource, singleCheckout=singleCheckout,
										   destinationCheckOut=destinationCheckOut,
										   destinationTestGenerated=destinationTestGenerated,
											TGApproach = testGenApproaches)

		for key in testGenApproaches:

			if key in resultAll:
				result = resultAll[key]

				filenamelog = saveResults(result, patchSource, iPatch, logFolder=summaryResultsFolder, evosuite= (key == EVOSUITE))

				results.append((iPatch, result, filenamelog))

	return results

def determineSource(filePatchPath):
	if "/patchesEffectivenessICSE20/NFL" in filePatchPath:
		return "NFL"
	if "/patchesEffectivenessICSE20/PFL" in filePatchPath:
		return "PFL"
	if "patchesAPI" in filePatchPath:
		return "API"
	if "patchesDRR" in filePatchPath:
		return "DRR"

	if "Patches_ICSE" in filePatchPath:
		return "WangICSE"

	if "Patches_others" in filePatchPath:
		return "WangDRR"

	return "Unknown"


def runStep3Clustering(resultDir, outResults, toolTestGeneration ="evosuite", feature="failingTests", saveMergedResults = False, resultDirExecuted = os.path.realpath("./Patches/patchesDRR/") ):

	filter = ""
	if toolTestGeneration.lower() == "evosuite":
		filter = ""
	elif toolTestGeneration.lower() == "randoop":
		filter = "randoop_"
	elif toolTestGeneration.lower() == "both":
		filter = ""#"merged_"
	else:
		logging.debug("Unknow filter {}.".format(toolTestGeneration))
		filter = "{}_".format(toolTestGeneration.lower())

	for iResultFile in os.listdir(resultDir):
		logging.debug(iResultFile)
		if fnmatch.fnmatch(iResultFile, "result_{}test_exec_*json".format(filter)):
			clusterWithMerge(resultDir, iResultFile, outResults, toolTestGeneration, filter, feature=feature,
							 saveMergedResults = saveMergedResults, resultDirExecuted=resultDirExecuted)

def runSummariseClusteringResults(patchesFolderPaths, clustering_results_dir, testGenerationMethod):
	all_bugs = retrieveAllBugs(patchesDirs=patchesFolderPaths)
	all_results = dict()
	logging.debug("All bugs retrieved {}".format(all_bugs))
	max_num_clusters = 0
	for bug_id in all_bugs:
		result_summary_bug_id_fp = os.path.join(clustering_results_dir, 'result_summary_' + testGenerationMethod + '_'
												+ bug_id + '.json')
		if not os.path.exists(result_summary_bug_id_fp):
			logging.debug('Error! Clustering results not available for %s' % bug_id)
			continue

		all_results[bug_id] = dict()
		result_summary_bug_id_file = open(result_summary_bug_id_fp,)
		result_summary_bug_id = json.load(result_summary_bug_id_file)

		num_clusters = result_summary_bug_id['nr_clusters']
		if num_clusters > max_num_clusters:
			max_num_clusters = num_clusters

		clusters = result_summary_bug_id['clusters']
		for cluster_index in range(0, num_clusters):
			cluster = clusters[cluster_index]
			num_patches = cluster['nr_patches']
			num_correct_patches = 0
			num_overfitting_patches = 0
			patches = cluster['patchesFromCluster']

			for patch_index in range(0, num_patches):
				patch = patches[patch_index]
				if 'Dcorrect' in patch:
					num_correct_patches += 1
				elif 'Doverfitting'in patch:
					num_overfitting_patches += 1

			all_results[bug_id][cluster_index + 1] = [num_correct_patches, num_overfitting_patches]

		result_summary_bug_id_file.close()

	clustering_summary_out_fp = os.path.join(clustering_results_dir, 'results_summary_' + testGenerationMethod + '.csv')

	header = list()
	header.append('bugid')
	for cluster_id in range(1, max_num_clusters + 1):
		header.append('cid ' + str(cluster_id))

	with open(clustering_summary_out_fp, 'w', newline='') as clustering_summary_out_csv:
		csv.writer(clustering_summary_out_csv).writerow(header)

	for bug_id in all_results:
		out_row = list()
		out_row.append(bug_id)
		num_clusters = len(all_results[bug_id])
		for cluster_id in range(1, num_clusters + 1):
			if all_results[bug_id][cluster_id][0] == 0 and all_results[bug_id][cluster_id][1] == 0:
				out_row.append('-')
			else:
				out_row.append(str(all_results[bug_id][cluster_id][0]) + ' / ' + str(all_results[bug_id][cluster_id][1]))

		with open(clustering_summary_out_fp, 'a', newline='') as clustering_summary_out_csv:
			csv.writer(clustering_summary_out_csv).writerow(out_row)
