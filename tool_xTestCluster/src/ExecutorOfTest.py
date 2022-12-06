import json
import datetime
from src.CompileTest import *
from src.Config import *
import traceback
import time
import zipfile
import logging
import time

def runTestExecutionForBugIdAllTestGeneration(bugid,
							 destinationTestGenerated,
							 pathsToPatches=[],
							 outResults = os.path.realpath("./results/"),
							 testGeneration = [EVOSUITE, RANDOOP],
							 OVERWRITERESULTS = False,
							 zipResult = True,
							 duplicatePatches = None
							 ):
	rresults = {}
	for tg in testGeneration:
		logging.debug("Running test from {}".format(tg))
		r =  runTestExecutionForBugId(bugid = bugid,
								 destinationTestGenerated = "{}{}".format(destinationTestGenerated, tg.title() ),
								 pathsToPatches=pathsToPatches,
								 outResults = outResults,
								 isEvosuite = tg.upper() == EVOSUITE,
								 OVERWRITERESULTS = OVERWRITERESULTS,
								 zipResult = zipResult,
								 duplicatePatches = duplicatePatches)
		rresults[tg] = r

	return rresults


def runTestExecutionForBugId(bugid,
							 destinationTestGenerated,
							 pathsToPatches=[],
							 outResults = os.path.realpath("./results/"),
							 isEvosuite = True,
							 OVERWRITERESULTS = True,
							 zipResult = True,
							 duplicatePatches = None
							 ):

	print("\n****Running analysis for bugs {}".format(bugid))

	print("Test generator: {}".format("Evosuite" if isEvosuite else "Randoop"))

	timeEnd = time.time()
	a_datetime = datetime.datetime.now()
	formatted_datetime = a_datetime.isoformat()

	### Create the path to find the test cases generated
	fname = fileNameResultBug.format("" if isEvosuite else "randoop_", bugid)
	cpath = os.path.join(outResults, folderNameResultsBugs)
	if not os.path.exists(cpath):
		os.makedirs(cpath)

	pathCompleteOutFile = "{}/{}".format(cpath, fname)

	## Check if the result exists
	if not OVERWRITERESULTS:
		if  os.path.exists(pathCompleteOutFile) or  os.path.exists(pathCompleteOutFile.replace(".json", ".zip")) :
			print("OVERWRITERESULTS? {}.  Existing results at {}. Finish analysis of {} ".format(OVERWRITERESULTS, pathCompleteOutFile, bugid ))
			return {'bugid':bugid, "results":[], "date":None, "duration": None, 'status': "Already analyzed"}
		else:
			print("OVERWRITERESULTS? {}. Not Existing results at {}, continue analysis of {}".format(OVERWRITERESULTS, pathCompleteOutFile, bugid))

	###
	## Instead of retrieving all patches, we focus on those not duplicate
	patches = []
	if duplicatePatches is None or len(duplicatePatches) == 0:
		patches = retrieveAllPatchesFromBugid(bugid, pathsToPatches)
		logging.debug(
			"Given bugid: {}, at location: {}, ALL Retrieved patches ({}): {} ".format(bugid, pathsToPatches, len(patches),
																					   patches))
	else:
		patches = retriveNotDuplicatePatches(bugid, duplicatePatches)
		logging.debug(
			"Given bugid: {}, at location: {}, Retrieved Not Duplicated patches ({}): {} ".format(bugid, pathsToPatches,
																								  len(patches),
																					  patches))
	if len(patches) < 2:
		logging.debug("Stop execution test execution: {} has less than 2 bugs".format(bugid))
		return None

	print("Retrieved patches  for bug {}: ({}) {} ".format(bugid, len(patches), patches))
	timeInit = time.time()
	results = []
	## Navitage all the patches
	for iPatch in patches:
		print("---running for {}".format(iPatch))
		resultPatch = runExecuteTestsForPatch(patchPath=iPatch, destinationTestGenerated=destinationTestGenerated, resultOutput=outResults, isEvosuite=isEvosuite, zipFile = zipResult, OVERWRITERESULTS=OVERWRITERESULTS)
		results.append(resultPatch)


	print("\n****All results for bugid {}:".format(bugid))

	resultsroot = {'bugid':bugid, "results":results, "date":formatted_datetime, "duration": round(timeEnd-timeInit, 2)}
	json_string = json.dumps(resultsroot, indent=4)
	print(json_string)

	##Save the  results
	print("\nGeneral result of {} store at: {}".format(bugid, pathCompleteOutFile))
	if not zipResult:
		f = open(pathCompleteOutFile, "w")
		f.write(json_string)
		f.close()

	else:
		zf = zipfile.ZipFile(pathCompleteOutFile.replace(".json",".zip"), mode="w", compression=zipfile.ZIP_DEFLATED)
		zf.writestr(fname, json_string)
		zf.close()

	return resultsroot


def runExecuteTestsForPatch(patchPath,
							destinationCheckOut=os.path.realpath("./myTempTest"),
							destinationTestGenerated=os.path.realpath("./dataTempTestGenerated/"),
							prefixTestFolder="test_from",
							listOfTestGenerated = [],
							resultOutput = os.path.realpath("./results"),
							isEvosuite = True,
							OVERWRITERESULTS=False,
							zipFile = True,
							avoidApplyPatch = False ,
							singleCheckout = False,
							maxNumberOfExecution = 1,
							maxAttemptsCompilations = 1
							):


	## Retrieve the bug id from the file name
	arraynames = os.path.basename(patchPath).split("-")
	timeInit = time.time()
	if len(arraynames) == 0:
		logging.debug("Cannot analyze patch file with name {}".format(patchPath))
		return

	projectId = arraynames[1]
	bugId = arraynames[2]

	logging.debug("Analyzing buug {}-{} patch path:  {}".format(projectId, bugId, patchPath))

	## we try to capture the name of the dataset of patches
	prever = list(patchPath.split(os.sep))
	prever.reverse()
	datasetName = prever[4]

	### Prepare the name of the output
	parentDir = os.path.join(resultOutput, folderNameResultPatch)
	if not os.path.exists(parentDir):
		os.makedirs(parentDir)

	fileName = "result{}_{}".format( "" if isEvosuite else "_randoop", os.path.basename(
		patchPath.replace(".patch", "_{}.json".format(datasetName))))
	pathjsonsaved = "{}/{}".format(parentDir,fileName)

	### check if the bug was analyzed, if we dont overwrite results, then we return the already computed results
	if not OVERWRITERESULTS:
		if  os.path.exists(pathjsonsaved) or  os.path.exists(pathjsonsaved.replace(".json", ".zip")) :
			logging.debug("OVERWRITERESULTS PATCH? {}.  Existing results at {}. Finish analysis of {} ".format(OVERWRITERESULTS, pathjsonsaved, patchPath ))
			res =  loadPatchFile(pathjsonsaved)
			res["comment"] = "already_analyzed"
			return res
		else:
			logging.debug("OVERWRITERESULTS PATCH? {}. Not Existing results at {}, continue analysis of {}".format(OVERWRITERESULTS, pathjsonsaved, patchPath))


	## Prepare the JSON for the results
	a_datetime = datetime.datetime.now()
	formatted_datetime = a_datetime.isoformat()

	mainResult = {'patch': patchPath, 'project': projectId, 'bugid': bugId, 'dataset': datasetName,
				 'date': formatted_datetime}

	mainResult[PROJECT_CHECKED] = NO
	mainResult[COMPILED_PROJECT_MODIFIED] = NO
	mainResult[PATCH_APPLIED] = NO
	mainResult[ARRIVE_END] = NO
	mainResult[PATCHED_PROJECT_PASS_ALL_TEST] = NO

	logging.debug("\n**********Running set of tests")

	logging.debug("Working directory {}".format(destinationCheckOut))

	attempsCompilations = 0
	success = False


	## Compilation of the project (we do different attempts)
	while attempsCompilations < maxAttemptsCompilations and not success:
		attempsCompilations+=1
		logging.debug("** Step: Checkout project, attempt {} ".format(attempsCompilations))
		destinationCheckOut="{}_{}".format(destinationCheckOut, attempsCompilations)
		## Obtain the buggy project from D4J to be patched
		if APPLY_CHECKOUT_D4J_OPTION:
			## here we checkout the project using D4J command
			checkedoutdir, resultCheckout = checkout_project(filePatchId=patchPath, projectDestination=destinationCheckOut, singleCheckout=singleCheckout)
		else:
			## here we use a copy of an already checkout project
			checkedoutdir, resultCheckout = copy_project(filePatchId=patchPath, projectDestination=destinationCheckOut)

		if checkedoutdir is not None and  len(os.listdir(checkedoutdir)) > 0:
			if resultCheckout:
				mainResult[PROJECT_CHECKED] = OK
			else:
				mainResult[PROJECT_CHECKED] = EXISTING
		else:
			logging.debug("Problems checking out project for {} {} ".format(projectId, bugId))
			return mainResult

		logging.debug("Project located at  {}".format(checkedoutdir))

		logging.debug("**Step: Apply patch on project ")

		##We apply the patch into the buggy project
		if not avoidApplyPatch:
			resultApplyingPatch, statusApplyingPatch, verificationSuccessfulyApplied = apply_patch(patchPath, checkedoutdir)
		else:
			## Only for testing purpose
			resultApplyingPatch, statusApplyingPatch, verificationSuccessfulyApplied = "", 0, 0

		## Check if the patch was correctly applied
		if statusApplyingPatch != 0 or verificationSuccessfulyApplied != 0:
			logging.debug("Error: We could not apply a patch {} ".format(patchPath))
			return mainResult
		else:
			mainResult[PATCH_APPLIED] = OK

		logging.debug("Step: Compile patched project ")
		compiled, message  = compilePatchedProject(checkedoutdir)

		if not compiled:
			logging.debug("Error: Problems compiling project for {} {} ".format(projectId, bugId))
			mainResult[COMPILED_PROJECT_MODIFIED] = NO
			return mainResult

		mainResult[COMPILED_PROJECT_MODIFIED] = OK
		logging.debug("Step: Executed Original test on patched project at attempt {}".format(attempsCompilations))
		success, message = executeOriginalTestPatchedProject(checkedoutdir, mustPass=True)
		logging.debug("Result Execution on test of patched, success {}".format(success))

	if not success:
		logging.debug("Error: We could not succeed with the checkout and compilation")
		mainResult[PATCHED_PROJECT_PASS_ALL_TEST] = NO
		return mainResult

	mainResult[PATCHED_PROJECT_PASS_ALL_TEST] = OK

	## Create the classpath
	currentpath =  os.path.dirname(os.path.dirname(os.path.realpath(__file__))) ## we add a dirname to get the parent of src folderWithTests
	logging.debug("Step: retrieve classpath of project ")
	export_classpath_compile(checkedoutdir)
	classpathOfProject = getClasspathOfProject(checkedoutdir)
	logging.debug("-->Result classpath of project: {} given project at : {} ".format(classpathOfProject, checkedoutdir))


	result = []
	allTestGenerated = []
	folderWithTests = os.path.join(destinationTestGenerated, projectId + "_" + bugId)
	if(len(listOfTestGenerated) == 0):
		## let's retrieve all test generated
		allTestGenerated = os.listdir(folderWithTests)
	else:
		allTestGenerated = listOfTestGenerated

	logging.debug("Step:Run Test ")
	logging.debug("--> All tests to run {}".format(allTestGenerated))
	## For each generated test
	for iTest in allTestGenerated:
		if ".DS_Store" == iTest:
			continue

		logging.debug("Test to run {}".format(iTest))
		if fnmatch.fnmatch(iTest, "{}*".format(prefixTestFolder)):
			try:
				nrAllFailingInAllExecution = []
				## WE RUN A TEST CASE maxNumberOfExecution TIMES in order to detect flaky tests
				for iRun in range(1, maxNumberOfExecution + 1):
					destinationOfTestToExecute = os.path.join(folderWithTests, iTest)
					## Execute the test cases:
					failingTestsNo, testrun, allFailings, testExecuted, failing_assertions, failing_lines = \
						executeGeneratedTestCases(dirWithTests=destinationOfTestToExecute, currentpath=currentpath,
												  projectClasspath=classpathOfProject, isEvosuite = isEvosuite)

					## We remove the path to dir with test in other to keep the relative path
					allTesteGeneratedSplittedRelative = []
					for aTest in testExecuted:
						allTesteGeneratedSplittedRelative.append(aTest.replace(destinationTestGenerated, ""))
					nrAllFailingInAllExecution.append(failingTestsNo)

				## if we have different failure during multiples execution, it means we have flaky tests
				uniqueFailures = len(set(nrAllFailingInAllExecution))

				logging.debug("For test {} result {}".format(iTest, nrAllFailingInAllExecution))

				if uniqueFailures > 1:
					# We report Flaky test cases:
					result.append({"patch": patchPath, "test": iTest, "failing": failingTestsNo, "testrun": testrun,
								   "failings": allFailings, "status": ERROR,
								   "test_executed": allTesteGeneratedSplittedRelative,
								   "failing_assertions": failing_assertions, "failing_lines": failing_lines,
								   "errorLog": "flaky tests"})

				elif testrun !=  0 :
					statusE = OK if testrun > 0 else ERROR
					result.append({"patch": patchPath, "test": iTest, "failing": failingTestsNo, "testrun": testrun,
								   "failings": allFailings, "status": statusE, "test_executed": allTesteGeneratedSplittedRelative,
								   "failing_assertions": failing_assertions, "failing_lines": failing_lines})
				elif testrun == 0:
					## We report no executed test
					result.append({"patch": patchPath, "test": iTest, "failing": failingTestsNo, "testrun": testrun,
								   "failings": allFailings, "status": ERROR, "test_executed": allTesteGeneratedSplittedRelative,
								   "failing_assertions": failing_assertions, "failing_lines": failing_lines, "errorLog": "no test generated"})

			except subprocess.CalledProcessError as ce:				#We report an error
				result.append({"patch": patchPath, "test": iTest, "status": ERROR})
				logging.error("CalledProcessError executing test {}".format(ce))
				logging.error("Status : FAIL", ce.returncode, ce.output)
				logging.error("\n--Process fail output: ")
				for l in  str(ce.output).split("\\n"):
					print(l)
				logging.error("\n--End Process fail output: ")
				traceback.print_exc()
				logging.error("Problems executing  {}".format(iTest))

			except Exception as e:
				## In the results we put an Error as status
				result.append({"patch": patchPath, "test": iTest, "status": ERROR})
				logging.error("Exception executing test {}".format(e))
				traceback.print_exc()
				logging.error("Problems executing  {}".format(iTest))

	logging.debug("Step: revert patch")
	# We undo the patch (to obtain again the buggy version)
	apply_patch(patchPath, checkedoutdir, revert=True)

	logging.debug("Step: Export the results")
	mainResult['test_execution'] = result
	mainResult[ARRIVE_END] = OK
	timeEnd = time.time()
	logging.debug("Computing duration")
	mainResult['duration'] = round(timeEnd - timeInit, 2)

	## We save the results on disk
	if resultOutput is not None:
		json_object = json.dumps(mainResult, indent=4)
		if not zipFile:
			f = open(pathjsonsaved, "w")
			f.write(json_object)
			f.close()
		else:
			zf = zipfile.ZipFile(pathjsonsaved.replace(".json",".zip"), mode="w", compression=zipfile.ZIP_DEFLATED)
			zf.writestr(fileName, json_object)
			zf.close()

		logging.info("Saved at {}".format(pathjsonsaved))
	return mainResult

def loadPatchFile(pathToFile = ""):
	### json not zip
	if  os.path.exists(pathToFile):
		f = open(pathToFile, "r")
		r = None
		if pathToFile.endswith(".json"):
			r = json.load(f)

		f.close()
		return r

	## zipped
	if not os.path.exists(pathToFile) and  os.path.exists(pathToFile.replace(".json", ".zip")):
		pathToFile = pathToFile.replace(".json", ".zip")
		archive = zipfile.ZipFile(pathToFile, 'r')
		for fileInside in archive.filelist:
			if fileInside.filename.endswith(".json"):
				jsonfile = archive.read(fileInside.filename)
				r = json.loads(jsonfile)
				archive.close()
				return r
	else:
		logging.error("Impossible to read the results from {}".format(pathToFile))
		return None




def executeGeneratedTestCases(dirWithTests, projectClasspath, currentpath ,  isEvosuite = True, forceRecompilation = True):

	classpath = projectClasspath

	print("Project classpath {}".format(projectClasspath))

	allTesteGenerated = ""
	retrievedTestNames = ""

	testId = os.path.basename(dirWithTests)
	print("test id {}".format(testId))

	if isEvosuite:

		print("Compile generated test Evosuite for {}".format(dirWithTests))

		evoClasspath = currentpath + '/lib/evosuite-1.1.0.jar' + os.path.pathsep + currentpath + '/lib/junit-4.12.jar' + os.path.pathsep + currentpath + '/lib/hamcrest-core-1.3.jar'
		classpath = "{}{}{}".format(evoClasspath, os.path.pathsep, projectClasspath)

		logging.debug("project classpath {}".format(projectClasspath))
		allTesteGenerated = retrieveTestFromEvosuite(dirWithTests)

		allTesteGeneratedSplitted = allTesteGenerated.strip().split(" ")

		logging.debug("#Tests to compile ({}): {} from:  {}.".format(len(allTesteGeneratedSplitted), allTesteGenerated , dirWithTests))
		## TODO Recompilation
		isCompiled = compileGeneratedTest(outputdir=dirWithTests, classpath = classpath, allTesteGenerated=allTesteGenerated, useJava7=False)

		logging.debug("Is well compiled Evosuite test {}".format(isCompiled))

		retrievedEvoTests = retrieveClassesTestEvosuite(dirWithTests)

		retrievedTestNames = " ".join(retrievedEvoTests)
	else:

		retrievedRandoopTest = retrieveClassesTestRandoop(dirWithTests)

		logging.debug("Compile generated test Randoop at {}".format(dirWithTests))
		randoopClasspath = currentpath + '/lib/junit-4.12.jar' + os.path.pathsep + currentpath + '/lib/hamcrest-core-1.3.jar'
		classpath = "{}{}{}".format(randoopClasspath, os.path.pathsep, projectClasspath)

		if forceRecompilation or len(retrievedRandoopTest) == 0:

			allTesteGenerated = retrieveTestFromRandoop(dirWithTests)

			logging.debug("Tests to compile {} from  {} ".format(allTesteGenerated, dirWithTests))

			isCompiled = compileGeneratedTest(outputdir=dirWithTests, classpath=classpath,
											  allTesteGenerated=allTesteGenerated, useJava7=True)

			logging.debug("Is well compiled Randoop test {}".format(isCompiled))
			retrievedRandoopTest = retrieveClassesTestRandoop(dirWithTests)
		else:
			logging.debug("Already compiled generated test Randoop at {}".format(dirWithTests))

		retrievedTestNames = " ".join(retrievedRandoopTest)

	logging.debug("-->Test class names to execute: {} retrieved from {}".format(retrievedTestNames , dirWithTests))

	if len(retrievedTestNames) == 0:
		logging.error("No generated tests found")
		#failingTestsNo, nrTestExecuted, allFailings = parserOutput(result)
		return 0, 0, [], "", None, None

	if isEvosuite:
		javapath = "{}/bin/".format(pathToJava8())
	else:
		javapath = "{}/bin/".format(pathToJava7())

	logging.debug("Step Running test: Generated Test Classes to run {} ".format(retrievedTestNames))

	try:
		## Original call witout jacoco coverage
		# executeTest = javapath + "/java -cp {}{}{}  org.junit.runner.JUnitCore {}".format(classpath, os.path.pathsep, dirWithTests,retrievedTestNames)
		##folder to put the jacoco results:
		jccfn = os.path.join(currentpath, "coverageResults", testId)
		if not os.path.exists(jccfn):
			os.makedirs(jccfn, exist_ok=True)

		jccfile = jccfn+"/jacoco.exec"

		## Now the test execution with Jacoco
		executeTest = javapath + "/java -javaagent:"+currentpath+"/lib/jacocoagent.jar=append=false,destfile="+jccfile+" -cp {}{}{}  org.junit.runner.JUnitCore {}".format(classpath, os.path.pathsep, dirWithTests,retrievedTestNames)
		logging.debug("Step running JUnitCore,  command {}".format(executeTest))
		result = ""
		try:
			out = subprocess.check_output(executeTest, stderr=subprocess.STDOUT, timeout=timeoutSeconds, shell=True)
			result = str(out)
		except subprocess.CalledProcessError as ce:
			logging.error("The process return unexpected results, probably one test fails: {}".format(ce))
			logging.error("Status : FAIL {}".format(ce.returncode))
			result =  str(ce.output)

		logging.debug("output test execution:  {}".format(result))

		failingTestsNo, nrTestExecuted, allFailings, failing_assertions, failing_lines = parserOutput(result)

		logging.debug("failing {} all execu {} ".format(failingTestsNo, nrTestExecuted))

		## let's generate Jacoco report

		commandJacocoReport = javapath + "java -jar "+currentpath+ "/lib/jacococli.jar report  "+ jccfile+ " --classfiles "+projectClasspath  +" --csv "+ jccfn+ "/coverage.csv" + " --html "+jccfn  #+  " --csv "
#--html ./
		print("Command jacoco report: "+commandJacocoReport )
		out = subprocess.check_output(commandJacocoReport, stderr=subprocess.STDOUT, timeout=timeoutSeconds, shell=True)
		logging.debug("output jacoco report:  {}".format(out))

		return failingTestsNo, nrTestExecuted, allFailings, retrievedTestNames.split(" "), failing_assertions, failing_lines

	except  subprocess.TimeoutExpired as e:
		logging.error("TimeOut of {} reached when executing generared tests.".format(timeoutSeconds))
		return -1, -1, -1, "", None, None

