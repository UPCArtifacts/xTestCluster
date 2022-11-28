import os
import fnmatch
import json

def fusionResults(dir):

	existRandoop = 0
	notExistRandoop = 0
	for iResultFile in os.listdir(dir):
		print(iResultFile)
		if fnmatch.fnmatch(iResultFile, "result_test_exec_*json"):

			dataEvo, isExistRandoop = mergeFromTwo(dir, iResultFile)

			if isExistRandoop:
				existRandoop+=1
			else:
				notExistRandoop+=1

			mergedFile = iResultFile.replace("result_test", "result_merged_test")
			fe = open(os.path.join(dir, mergedFile ), "w")
			json.dump(dataEvo, fe, indent=4)
			fe.close()

	print("Existing randoop {}, Not exist randoop {}".format(existRandoop, notExistRandoop))


def mergeFromTwo(dir, iResultFile):
	randoopFile = iResultFile.replace("result_test", "result_randoop_test")
	pathEvoFile = os.path.join(dir, iResultFile)
	pathRandoopFile = os.path.join(dir, randoopFile)
	print(pathEvoFile, pathRandoopFile)
	dataMerged = None
	if os.path.exists(pathRandoopFile):
		print("Existing randoop")
		dataMerged = merge(pathEvoFile, pathRandoopFile)
		return dataMerged, True
	else:
		## We return evosuite result
		ff = open(pathEvoFile, "r")
		dataMerged = json.load(ff)
		ff.close()
		return dataMerged, False


def merge(fileEvo, fileRandoop):

	fe = open(fileEvo, 'r')
	fr = open(fileRandoop, 'r')

	dataEvo = json.load(fe)
	dataRandoop = json.load(fr)

	dataEvo =  clean(dataEvo)

	print("\nAnalyzing {} {} ".format(fileEvo,fileRandoop ))

	print("evo-->{}".format(dataEvo))
	print("randoop-->{}".format(dataRandoop))
	for resultOfPatchEvosuite in dataEvo['results']:
		patchId = str(resultOfPatchEvosuite["patch"]).split("Patches")[1]
		print(resultOfPatchEvosuite["patch"])
		print("-Patch id->{}".format(patchId))

		resultOfPatchRandoop = findDataFromPath(dataRandoop, patchId)
		print("Equivalent: {}".format(resultOfPatchRandoop))

		## in case Evo fails but not Randdop
		if "test_execution" not in resultOfPatchEvosuite and  "test_execution"  in resultOfPatchRandoop :
			resultOfPatchEvosuite["test_execution"] = resultOfPatchRandoop["test_execution"]

		## in case any of them fails, no need to merge

		if "test_execution" not in resultOfPatchEvosuite and "test_execution" not in resultOfPatchRandoop:
			continue

		if "test_execution" in resultOfPatchEvosuite  and "test_execution"  in resultOfPatchRandoop:
			print("Merging {} {}".format(fe, fr))
			resultOfPatchEvosuite["test_execution"].extend(resultOfPatchRandoop["test_execution"])

	fe.close()
	fr.close()

	return dataEvo

def findDataFromPath(dataRandoop, patchid):

	for resultOfPatch in dataRandoop['results']:
		randooppatchId = str(resultOfPatch["patch"]).split("Patches")[1]
		if patchid == randooppatchId:
			return resultOfPatch

	return None


def clean(data):
	return data

