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

	foldersWithPatches = patchesFolder.split("@")

	testGenApproaches = str(sys.argv[6]).upper().split("-")

	seed = sys.argv[7]

	## We add the seed to the output
	destinationTestGenerated = os.path.join(destinationTestGenerated, "seed_"+str(seed))
	logFolder = os.path.join(os.path.realpath(logFolder), "seed_"+str(seed))

	if not os.path.exists(destinationTestGenerated):
		os.makedirs(destinationTestGenerated)

	if not os.path.exists(logFolder):
		os.makedirs(logFolder)

	runStep1TestGeneration(patchesFolderPaths=foldersWithPatches,
						   singleCheckout=False, summaryResultsFolder=logFolder, destinationCheckOut=destinationCheckOut, destinationTestGenerated=destinationTestGenerated, testGenApproaches = testGenApproaches, seed=seed)

if "testgenerationsingle" == mode:

	patchesFolder = sys.argv[2]
	logFolder = sys.argv[3]
	destinationCheckOut = sys.argv[4]
	destinationTestGenerated = sys.argv[5]
	foldersWithPatches = patchesFolder.split("@")
	testApproaches =  str(sys.argv[6]).upper().split("-")
	iBug = sys.argv[7]
	seed = sys.argv[8]

	## We add the seed to the output
	destinationTestGenerated = os.path.join(destinationTestGenerated, "seed_" + str(seed))
	logFolder = os.path.join(os.path.realpath(logFolder), "seed_" + str(seed))

	if not os.path.exists(destinationTestGenerated):
		os.makedirs(destinationTestGenerated)

	if not os.path.exists(logFolder):
		os.makedirs(logFolder)
	print("Generating with {}".format(testApproaches))
	runTestGenerationForBugId(iBug, patchPath=foldersWithPatches, singleCheckout=False, summaryResultsFolder=logFolder,
							  destinationCheckOut=destinationCheckOut,
							  destinationTestGenerated=destinationTestGenerated, testGenApproaches = testApproaches, seed=seed)


elif "testexecution" == mode:

	patchesFolder = sys.argv[2]

	foldersWithPatches = patchesFolder.split("@")

	generatedTest = sys.argv[3]

	resultpath = sys.argv[4]

	#modeEvosuite = True if sys.argv[5] == "True" else False

	runJacoco = False
	if len(sys.argv) > 5:
		runJacoco = True if sys.argv[5] == "True" else False

	print("Running jacoco {}".format(runJacoco))
	runStep2TestExecution(patchesFolderPaths=foldersWithPatches, destinationTestGenerated = generatedTest, result=resultpath, runJacoco = runJacoco)


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

#It executes all tests every patch of a bug.
elif "testexecutionsingle" == mode:

	patchesFolder = sys.argv[2]

	foldersWithPatches = patchesFolder.split("@")

	generatedTest = sys.argv[3]

	resultpath = sys.argv[4]

	modeEvosuite = True if sys.argv[5] == "True" else False

	bugid = sys.argv[6]

	runJacoco = False

	if len(sys.argv) > 7:
		runJacoco = True if sys.argv[7] == "True" else False


	runTestExecutionForBugId(bugid=bugid, pathsToPatches=foldersWithPatches, destinationTestGenerated=generatedTest, outResults=resultpath, isEvosuite= modeEvosuite, runJacoco = runJacoco)

## It executes all tests on a patch passed as parameter

elif "testexecutionsinglepatch" == mode:

	iPatch = sys.argv[2]

	generatedTest = sys.argv[3]

	resultpath = sys.argv[4]

	modeEvosuite = True if sys.argv[5] == "True" else False

	resultPatch = runExecuteTestsForPatch(patchPath=iPatch, destinationTestGenerated=generatedTest, resultOutput=resultpath, isEvosuite=modeEvosuite, zipFile = False, OVERWRITERESULTS=True)

elif "clustering" == mode:
	resultDir = sys.argv[2]
	out =  sys.argv[3]
	# Evosuite, Randoop or Both
	toolTestGeneration =  sys.argv[4]
	# feature == "failingTests" or "failingLines":
	feature = sys.argv[5]
	runStep3Clustering(resultDir = resultDir, outResults= out, toolTestGeneration = toolTestGeneration, feature = feature)

elif "reportingclusteringhistogram" == mode:
	resultDir = sys.argv[2]
	toolGenerationTest = sys.argv[3]
	runClusteringReport(pathResultsExecutionFolder = resultDir, toolTestGeneration= toolGenerationTest) 

elif "summariseresults" == mode:
	patchesFolder = sys.argv[2]
	foldersWithPatches = patchesFolder.split("@")
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
