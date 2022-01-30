from src.xTestClusterCore import *
from src.AnalyzeClusters import *
from src.FindDuplicatePatches import *


mode = sys.argv[1]
print("arguments {} ".format(sys.argv))
print("\n******\nMODE {}\n******".format(mode))

if "testgeneration" == mode:

	patchesFolder = sys.argv[2]
	logFolder = sys.argv[3]
	destinationCheckOut = sys.argv[4]
	destinationTestGenerated = sys.argv[5]

	isEvosuite = True

	if len(sys.argv) > 6:
		isEvosuite = True if str(sys.argv[6]).lower() == "evosuite" else False
		print("Is evosuite mode: {}.".format(isEvosuite))

	runStep1TestGeneration(patchesFolderPaths=[os.path.realpath(patchesFolder)],
						   singleCheckout=False, summaryResultsFolder=os.path.realpath(logFolder), destinationCheckOut=destinationCheckOut, destinationTestGenerated=destinationTestGenerated, evosuite=isEvosuite)

if "testgenerationsingle" == mode:

	patchesFolder = sys.argv[2]
	logFolder = sys.argv[3]
	destinationCheckOut = sys.argv[4]
	destinationTestGenerated = sys.argv[5]

	testApproaches =  str(sys.argv[6]).upper().split("-")

	iBug = sys.argv[7]

	foldersWithPatches = patchesFolder.split("-")

	runTestGenerationForBugId(iBug, patchPath=foldersWithPatches, singleCheckout=False, summaryResultsFolder=logFolder,
							  destinationCheckOut=destinationCheckOut,
							  destinationTestGenerated=destinationTestGenerated, testGenApproaches = testApproaches)


elif "testexecution" == mode:

	patchesFolder = sys.argv[2]

	foldersWithPatches = patchesFolder.split("-")

	generatedTest = sys.argv[3]

	resultpath = sys.argv[4]
	runStep2TestExecution(patchesFolderPaths=foldersWithPatches, destinationTestGenerated = generatedTest, result=resultpath)


elif "testexecutionperproject" == mode:

	patchesFolder = sys.argv[2]

	foldersWithPatches = patchesFolder.split("-")

	generatedTest = sys.argv[3]

	resultpath = sys.argv[4]

	modeEvosuite = True if sys.argv[5] == "True" else False

	print("Is evo? {}".format(modeEvosuite))
	projectId =  str(sys.argv[6]).lower()

	allBugs = retrieveAllBugs(patchesDirs=foldersWithPatches)
	failingPatches = []
	print("all bugs to analyze {}".format(allBugs))
	errors = []

	print("Project to analyze {}.".format(projectId))

	print("Running test execution {}".format(foldersWithPatches))

	for iBug in allBugs:

		if iBug.lower().startswith(projectId):
			print("running {}".format(iBug))
			try:

				runTestExecutionForBugId(bugid=iBug, pathsToPatches=foldersWithPatches,
										 destinationTestGenerated=generatedTest, outResults=resultpath, isEvosuite=modeEvosuite)

			except Exception as error:
				print('Error: ' + str(error))
				errors.append(iBug)

	print("Failing patches {}".format(failingPatches))
	print("END. errors {}".format(errors))


elif "testexecutionsingle" == mode:

	patchesFolder = sys.argv[2]

	foldersWithPatches = patchesFolder.split("-")

	generatedTest = sys.argv[3]

	resultpath = sys.argv[4]

	modeEvosuite = True if sys.argv[5] == "True" else False

	if len(sys.argv) > 7:
		bugid = sys.argv[7]
	else:
		bugid = sys.argv[6]

	runTestExecutionForBugId(bugid=bugid, pathsToPatches=foldersWithPatches, destinationTestGenerated=generatedTest, outResults=resultpath, isEvosuite= modeEvosuite)


elif "clustering" == mode:
	resultDir = sys.argv[2]
	out =  sys.argv[3]
	toolTestGeneration =  sys.argv[4]
	feature = sys.argv[5]
	runStep3Clustering(resultDir = resultDir, outResults= out, toolTestGeneration = toolTestGeneration, feature = feature)

elif "reportingclusteringhistogram" == mode:
	resultDir = sys.argv[2]
	toolGenerationTest = sys.argv[3]
	runClusteringReport(pathResultsExecutionFolder = resultDir, toolTestGeneration= toolGenerationTest) 

elif "summariseresults" == mode:
	patchesFolder = sys.argv[2]
	foldersWithPatches = patchesFolder.split("-")
	resultpath = sys.argv[3]
	testGenerationMethod = sys.argv[4].lower()

	runSummariseClusteringResults(patchesFolderPaths=foldersWithPatches, clustering_results_dir=resultpath, testGenerationMethod=testGenerationMethod)

elif "findduplicatepatches" == mode:
	patchesFolder = sys.argv[2]
	resultpath = sys.argv[3]
	foldersWithPatches = patchesFolder.split("-")
	find_duplicate_patches(patchesFolderPaths=foldersWithPatches, results_dir=resultpath)

elif "allsingle" == mode:

	###########
	patchesFolder = sys.argv[2]
	logFolder = sys.argv[3]
	destinationCheckOut = sys.argv[4]
	destinationTestGenerated = sys.argv[5]
	resultpath = sys.argv[6]
	iBug = sys.argv[7]

	foldersWithPatches = []

	testGenApproaches = [EVOSUITE, RANDOOP]

	allFoldersWithPatch = ["/Patches/patchesAPI/",
					"/Patches/patchesDRR/",
					"/Patches/patchesEffectivenessICSE20/NFL/",
					"/Patches/patchesEffectivenessICSE20/PFL/"]

	for relativeFolder  in allFoldersWithPatch:
		foldersWithPatches.append("{}{}".format(patchesFolder, relativeFolder))

	print("Folder with Patches {}".format(foldersWithPatches))

	duplicatePatches = find_duplicate_patches(foldersWithPatches, resultpath, considerUnassessed=False)

	groupsFromBug = duplicatePatches[iBug]

	nrPatchesFromBug = 0
	for aGroup in groupsFromBug:
		nrPatchesFromBug += len(aGroup)

	print(" bug {} : Number of groups {}, total patches {}".format(iBug, len(groupsFromBug), nrPatchesFromBug))
	print(" patches from bug {} : {} ".format(iBug, groupsFromBug))
	result = runTestGenerationForBugId(iBug, patchPath=foldersWithPatches, singleCheckout=False, summaryResultsFolder=logFolder,
							  destinationCheckOut=destinationCheckOut,
							  destinationTestGenerated=destinationTestGenerated, testGenApproaches=testGenApproaches, duplicatePatches = duplicatePatches)

	if result is None:
		logging.debug("Stop execution before test execution")

	runTestExecutionForBugIdAllTestGeneration(bugid=iBug, pathsToPatches=foldersWithPatches, destinationTestGenerated=destinationTestGenerated,
											  outResults=resultpath, testGeneration = testGenApproaches, duplicatePatches=duplicatePatches)


else:
	print("No mode ")
