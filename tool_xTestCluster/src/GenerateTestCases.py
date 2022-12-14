from subprocess import Popen, PIPE
import subprocess
import os
import shutil
from src.ProjectSupport import *
from src.CompileTest import *
import tempfile

def generateTestEvosuite(projectId, bugId, checkedoutdir, destinationTestGenerated, patchSource, patchPath):

	result = {}

	currentpath = os.path.dirname(
		os.path.dirname(os.path.realpath(__file__)))  ## we add a dirname to get the parent of src folder
	logging.debug("Current path {} ".format(currentpath))
	logging.debug("Step: retrieve classpath of project ")

	export_classpath_compile(checkedoutdir)

	classpathOfProject = getClasspathOfProject(checkedoutdir)

	logging.debug("Result classpath of project {}".format(classpathOfProject))

	evoClasspath = currentpath + '/lib/evosuite-1.1.0.jar'+os.path.pathsep + currentpath + '/lib/junit-4.12.jar'+ os.path.pathsep + currentpath + '/lib/hamcrest-core-1.3.jar'

	### Test cases generation with Evosuite

	logging.debug("Step: identifying classes to generate tests")

	patchId = "{}_{}_{}".format(prefixTestFolder, patchSource, os.path.basename(patchPath).replace(".patch", ""))

	logging.debug("patch id {}".format(patchId))
	destinationForGeneratedTestsForBug = "{}/{}_{}/{}".format(destinationTestGenerated, projectId, bugId, patchId)

	## Remove the already generated test in case the folder exists
	if os.path.exists(destinationForGeneratedTestsForBug):
		shutil.rmtree(destinationForGeneratedTestsForBug)

	os.makedirs(destinationForGeneratedTestsForBug)
	affectedClasses = retrieveClassesFromDiff(patchPath)

	problemsInGeneration = False
	generatedFlaky = False
	sanityCheckPass = True

	## Check if the folder has not test
	testcases = retrieveClassesTestEvosuite(destinationForGeneratedTestsForBug)
	logging.debug("Checking the destination folder before generating test: # of test: {} (must be zero)".format(len(testcases)))

	for affectedFile in affectedClasses:
		logging.debug("----Generating tests for {}".format(affectedFile))
		isTestGenerated = generateTestForPatchedEvosuite(outputdir=destinationForGeneratedTestsForBug,
														 checkedOutDirectory=currentpath + "/myTempTest/{}/{}_{}_buggy/".format(
													 projectId, projectId.lower(), bugId),
														 targetClass=affectedFile, evoclasspath=evoClasspath,
														 projectClasspath=classpathOfProject)

		if not isTestGenerated:
			problemsInGeneration = True

		logging.debug("----Identify flaky tests for {}".format(affectedFile))
		foundFlaky = checkFlakyTests(tests_dir=destinationForGeneratedTestsForBug, evo_classpath=evoClasspath,
									 project_classpath=classpathOfProject, target_class=affectedFile)

		logging.debug("----Execute sanity check for {}".format(affectedFile))
		sanity_check_pass = sanityCheck(tests_dir=destinationForGeneratedTestsForBug, evo_classpath=evoClasspath,
										project_classpath=classpathOfProject, target_class=affectedFile)

		if foundFlaky:
			generatedFlaky = True

		if not sanity_check_pass:
			sanityCheckPass = False

	if problemsInGeneration:
		logging.debug("We could generate tests for patch {} ".format(patchPath))
		#failingPatches.append(patchPath + ERROR_SEPARATOR + "PatchApplication")
		return result
	else:
		result[TEST_GENERATED] = OK
		result[FOLDER_TEST_GENERATED] = destinationForGeneratedTestsForBug.replace(destinationTestGenerated, "")
		testcases = retrieveClassesTestEvosuite(destinationForGeneratedTestsForBug)
		result[TEST_GENERATED_NAMES] = testcases

	if generatedFlaky:
		result[FOUND_FLAKY_TEST] = YES
		logging.debug("We stop due to  Flaky test found")
		return result

	if not sanityCheckPass:
		result[SANITY_CHECK_PASS] = NO
		logging.debug("We stop due to  problems in sanity check")
		return result

	logging.debug("Step: compiling tests")
	allTesteGenerated = retrieveTestFromEvosuite(destinationForGeneratedTestsForBug)

	classPath = "{}{}{}".format(evoClasspath, os.path.pathsep, classpathOfProject)

	isCompiled = compileGeneratedTest(outputdir=destinationForGeneratedTestsForBug, classpath=classPath, allTesteGenerated = allTesteGenerated)

	if not isCompiled:
		logging.debug("Problems compiling {}".format(patchPath))
		return result
	else:
		result[TEST_COMPILED] = OK


	return result


def generateTestRandoop(projectId, bugId, checkedoutdir, destinationTestGenerated, patchSource, patchPath):

	result = {}

	currentpath = os.path.dirname(
		os.path.dirname(os.path.realpath(__file__)))  ## we add a dirname to get the parent of src folder
	logging.debug("Current classpath {} ".format(currentpath))
	logging.debug("Step: retrieve classpath of project ")

	export_classpath_compile(checkedoutdir)

	classpathOfProject = getClasspathOfProject(checkedoutdir)

	logging.debug("Result classpath of project {}".format(classpathOfProject))

	xClasspath =  classpathOfProject  +  os.path.pathsep +   currentpath + '/lib/randoop-all-4.2.6.jar'+ os.path.pathsep + currentpath + '/lib/junit-4.12.jar'+ os.path.pathsep + currentpath + '/lib/hamcrest-core-1.3.jar'

	### Test cases generation with Evosuite

	logging.debug("Step: identifying classes to generate tests")

	patchId = "{}_{}_{}".format(prefixTestFolder, patchSource, os.path.basename(patchPath).replace(".patch", ""))

	logging.debug("patch id {}".format(patchId))
	destinationForGeneratedTestsForBug = "{}/{}_{}/{}".format(destinationTestGenerated, projectId, bugId, patchId)

	## Remove the already generated test in case the folder exists
	if os.path.exists(destinationForGeneratedTestsForBug):
		shutil.rmtree(destinationForGeneratedTestsForBug)

	os.makedirs(destinationForGeneratedTestsForBug)
	affectedClasses = retrieveClassesFromDiff(patchPath)

	#problemsInGeneration = False
	generatedFlaky = False
	sanityCheckPass = True

	## Check if the folder has not test
	testcases = retrieveClassesTestEvosuite(destinationForGeneratedTestsForBug)
	logging.debug("Checking the destination folder before generating test: # of test: {} (must be zero)".format(len(testcases)))


	tmp = tempfile.NamedTemporaryFile(delete=False)
	try:
		logging.debug(tmp.name)

		for affectedFile in affectedClasses:
			tmp.write("{}\n".format(affectedFile).encode())

	finally:
		tmp.close()
		#os.unlink(tmp.name)

	logging.debug("----Generating tests for {}".format(affectedFile))
	isTestGenerated, errorDescription = generateTestForPatchedRandoop(outputdir=destinationForGeneratedTestsForBug,
													checkedOutDirectory=currentpath + "/myTempTest/{}/{}_{}_buggy/".format(
													 projectId, projectId.lower(), bugId),
													targetClassFile=tmp.name, classpath=xClasspath, allClassesToGenerate=affectedClasses)


	if not isTestGenerated:
		logging.debug("We could not generate tests for patch {} ".format(patchPath))
		result[ERROR_LOG_TEST_GENERATION] = errorDescription
		return result

	else:
		result[TEST_GENERATED] = OK
		result[FOLDER_TEST_GENERATED] = destinationForGeneratedTestsForBug.replace(destinationTestGenerated, "")
		testcases = retrieveClassesTestRandoop(destinationForGeneratedTestsForBug)
		result[TEST_GENERATED_NAMES] = testcases

	if generatedFlaky:
		result[FOUND_FLAKY_TEST] = YES

	if not sanityCheckPass:
		result[SANITY_CHECK_PASS] = NO

	logging.debug("Step: compiling tests")

	allTesteGenerated = retrieveTestFromRandoop(destinationForGeneratedTestsForBug)
	isCompiled = compileGeneratedTest(outputdir=destinationForGeneratedTestsForBug, classpath=xClasspath,  allTesteGenerated = allTesteGenerated)

	if not isCompiled:
		logging.debug("Problems compiling {}".format(patchPath))
		return result
	else:
		result[TEST_COMPILED] = OK


	return result


def runTestGenerationForPatch(patchPath,
							  patchSource,
							  destinationCheckOut = os.path.realpath("../dataTemp/"),
							  destinationTestGenerated =  os.path.realpath("../dataTempTestGenerated/"),
							  doTestGeneration = True,
							  singleCheckout = False,
							  evosuite = True
							  ):
	singleApproach = EVOSUITE if evosuite else RANDOOP
	result = runTestGenerationForPatchAllTGApproaches(patchPath,
							  patchSource,
							  destinationCheckOut ,
							  destinationTestGenerated ,
							  doTestGeneration,
							  singleCheckout ,
							  evosuite = [singleApproach])
	return {singleApproach:result}

def runTestGenerationForPatchAllTGApproaches(patchPath,
							  patchSource,
							  destinationCheckOut = os.path.realpath("../dataTemp/"),
							  destinationTestGenerated =  os.path.realpath("../dataTempTestGenerated/"),
							  doTestGeneration = True,
							  singleCheckout = False,
							  TGApproach = [EVOSUITE, RANDOOP]
							  ):
	result = {}
	result[PATCH_ID] = patchPath
	result[PROJECT_CHECKED] = NO
	result[PATCH_APPLIED] = NO
	result[TEST_GENERATED] = NO
	result[TEST_GENERATED_NAMES] = NO
	result[TEST_COMPILED] = NO
	result[FOUND_FLAKY_TEST] = NO
	result[SANITY_CHECK_PASS] = YES
	result[TEST_GENERATED_PASSING] = UNKNOWN
	result[PATCH_UNDO] = NO
	result[REMOVING_CHECKED] = NO
	result[ARRIVE_END] = NO
	result[FOLDER_TEST_GENERATED] = NO
	result[MESSAGE] = NO
	result[PATCH_APPLIED_DIFF_Verified]  = NO
	result[ERROR_LOG_TEST_GENERATION] = NO
	result[COMPILED_PROJECT_MODIFIED] = NO
	result[PATCHED_PROJECT_PASS_ALL_TEST] = NO


	if not os.path.isfile(patchPath):
		logging.debug("Patch file do not exit {}".format(patchPath))
		return result

	logging.debug("\n\n\n*** Test generation for patch {} ".format(patchPath))
	logging.debug("Working directory {}".format(destinationCheckOut))

	## let's retrieve the bug info
	arraynames = os.path.basename(patchPath).split("-")
	projectId = arraynames[1]
	bugId = arraynames[2]

	logging.debug("** Step: Checkout project ")

	if APPLY_CHECKOUT_D4J_OPTION:
		checkedoutdir, newcheck = checkout_project(filePatchId=patchPath, projectDestination=destinationCheckOut,
														 singleCheckout=singleCheckout)
	else:
		checkedoutdir, newcheck = copy_project(filePatchId=patchPath,
													 projectDestination=destinationCheckOut)


	logging.debug("Project located at  {}".format(checkedoutdir))

	if checkedoutdir is not None and  len(os.listdir(checkedoutdir)) > 0:
		if newcheck:
			result[PROJECT_CHECKED] = OK
		else:
			result[PROJECT_CHECKED] = EXISTING
	else:
		logging.debug("Problems checking out project for {} {} ".format(projectId, bugId))
		return result


	logging.debug("**Step: Apply patch on project ")
	resultApplyingPatch, statusApplyingPatch, verificationSuccessfulyApplied = apply_patch(patchPath, checkedoutdir)

	if statusApplyingPatch != 0:
		logging.debug("We could not apply a patch {} ".format(patchPath))
		return result
	else:
		result[PATCH_APPLIED] = OK

	if verificationSuccessfulyApplied is not None:
		if verificationSuccessfulyApplied == 0:
			result[PATCH_APPLIED_DIFF_Verified] = OK
		else:
			result[PATCH_APPLIED_DIFF_Verified] = ERROR

	logging.debug("Step: Compile project with applied patch ")
	compiled, message = compilePatchedProject(checkedoutdir)

	if not compiled:
		logging.debug("Problems to compile")
		return result

	result[COMPILED_PROJECT_MODIFIED] = OK

	logging.debug("Step: Execute Original test on patched project before test generation")
	success, message = executeOriginalTestPatchedProject(checkedoutdir, mustPass=True)
	logging.debug("Result Execution on tests of patched, success {}".format(success))

	if not success:
		logging.error("No passing all test cases:{}.".format(message))
		result[PATCHED_PROJECT_PASS_ALL_TEST] = NO
		result[MESSAGE] = message
		return result

	result[PATCHED_PROJECT_PASS_ALL_TEST] = OK

	resultEvo = {}
	resultRandoop = {}
	if doTestGeneration:
		if EVOSUITE in TGApproach:
			logging.debug("Running test generation with Evosuite ")
			resultEvo = generateTestEvosuite(projectId, bugId, checkedoutdir, "{}{}".format(destinationTestGenerated, EVOSUITE.title()), patchSource, patchPath)

		if RANDOOP in TGApproach:
			logging.debug("Running test generation with Randoop ")
			resultRandoop = generateTestRandoop(projectId, bugId, checkedoutdir, "{}{}".format(destinationTestGenerated, RANDOOP.title()), patchSource,
										  patchPath)

	##Once we generate the tests, we undo the patch and we remove the project

	logging.debug("Step: revert patch")
	resultap, statusUndoApply, verificationUndoSuccessfulyApplied = apply_patch(patchPath, checkedoutdir, revert=True)

	if statusUndoApply != 0:
		logging.debug("We could not undo applying of patch {} ".format(patchPath))
		return result
	else:
		result[PATCH_UNDO] = OK

	if not singleCheckout and os.path.exists(checkedoutdir) :
		logging.debug("Step deleting checked out folder {}:".format(checkedoutdir))
		shutil.rmtree(checkedoutdir)
		result[REMOVING_CHECKED] = OK

	logging.debug("End test generation for {}".format(patchPath))
	result[ARRIVE_END] = OK

	finalResult = {}
	if EVOSUITE in TGApproach:
			nres = dict(result)
			nres.update(resultEvo)
			finalResult[EVOSUITE] = nres


	if RANDOOP in TGApproach:
		nres = dict(result)
		nres.update(resultRandoop)
		finalResult[RANDOOP] = nres

	return finalResult


def generateTestForPatchedEvosuite(outputdir, checkedOutDirectory, targetClass, projectClasspath, evoclasspath, generator ="evosuite", total_budget_Sec = 30):
	## http://defects4j.org/html_doc/gen_tests.html

	logging.debug("Project checked out in  {} ".format(checkedOutDirectory))
	javapath = "{}/bin/".format(pathToJava8())
	commandGenTest = "{}java -cp {} org.evosuite.EvoSuite " \
					 "-class {} " \
					 "-projectCP {} " \
					 "-seed 10 " \
					 "-Dsearch_budget={} " \
					 "-Dassertion_timeout={} -Doutput_variables=TARGET_CLASS,criterion,Coverage,Covered_Goals,Total_Goals,Size,Length,MutationScore " \
					 "-Dsandbox=true -Dno_runtime_dependency=false -Dshow_progress=false " \
					 "-Dtest_dir={} -Dreport_dir={}".format(javapath, evoclasspath, targetClass, projectClasspath, total_budget_Sec, total_budget_Sec, outputdir, outputdir)
	# "-Dreport_dir={}".format(javapath, evoclasspath, targetClass, projectClasspath, total_budget_Sec, total_budget_Sec, outputdir, outputdir)

	logging.debug("command test gen {}".format(commandGenTest))

	process = subprocess.Popen(commandGenTest, shell="True", stdout=PIPE)
	out, err = process.communicate()
	logging.debug("Output test generation {}".format(out))
	if "Writing tests to file" in str(out):
		logging.debug("Generation Ok for class {}".format(targetClass))
		return True
	elif "Unknown class:"  in str(out):
		logging.debug("Evosuite problematic test generation with class {}".format(targetClass) )
		return False
	else:
		logging.debug("Unknown output of Evosuite for class {}".format(targetClass))
		return False

def generateTestForPatchedRandoop(outputdir, checkedOutDirectory, targetClassFile, classpath, allClassesToGenerate, total_budget_Sec = 60, randomseed = 10):
	## http://defects4j.org/html_doc/gen_tests.html

	javapath = "{}/bin/".format(pathToJava8())
	logging.debug("Project checked out in  {} ".format(checkedOutDirectory))
	# randoop.main.Main gentests --classlist=myclasses.txt --time-limit=60 --junit-output-dir=./out --randomseed=10
	commandGenTest = "{}/java -cp {} randoop.main.Main gentests  " \
					 "--classlist {} " \
					 "--randomseed={} " \
					 "--time-limit={}   " \
					 " --junit-output-dir={}".format(javapath, classpath, targetClassFile, randomseed, total_budget_Sec, outputdir)

	logging.debug("command test gen {}".format(commandGenTest))

	try:

		out = subprocess.check_output(commandGenTest, stderr=subprocess.STDOUT, timeout=timeoutSeconds, shell=True) # in seconds
		#process = subprocess.Popen(commandGenTest, shell="True", stdout=PIPE)
		#out, err = process.communicate()

		logging.debug("Output test generation {}".format(out))
		logging.debug("Test generated at:  {}".format(outputdir))
		if "Wrote regression JUnit tests" in str(out):
			logging.debug("Generation Randoop Ok for clasess {}".format(allClassesToGenerate))
			return True, None
		else:
			logging.debug("Unknown output of Randoop for class {}".format(allClassesToGenerate))
			return False, str(out)
	except subprocess.TimeoutExpired as e:
		logging.debug("TimeOut of {} reached ".format(timeoutSeconds))
		return False, "Timeout"
	except subprocess.CalledProcessError as exc:
		logging.debug("Status : FAIL", exc.returncode, exc.output)
		return False, str(exc.output)
	except Exception as e:
		logging.debug("Exception {}".format(e))
		return False, str(e)



def checkFlakyTests(tests_dir, evo_classpath, project_classpath, target_class):
	NUM_CONSECUTIVE_RUNS = 1
	logging.debug('Number of consecutive runs needed to confirm test suite is not flaky - %d' % NUM_CONSECUTIVE_RUNS)
	num_runs_without_flaky = 0
	foundFlaky = False
	while num_runs_without_flaky < NUM_CONSECUTIVE_RUNS:
		logging.debug('Clean bytecode files of %s tests in %s' % (target_class, tests_dir))
		cleanBytecodeFiles(tests_dir, target_class)

		logging.debug('Compile generated tests for %s in %s' % (target_class, tests_dir))
		compileTest(tests_dir=tests_dir, evoclasspath=evo_classpath, projectClasspath=project_classpath,
					target_class=target_class)

		logging.debug('Run generated tests for %s in %s' % (target_class, tests_dir))
		result = runGeneratedTests(tests_dir, evo_classpath, project_classpath, target_class)

		logging.debug('Parse results from test execution for %s in %s' % (target_class, tests_dir))
		parsed_results = parseExecResults(result)

		if not flakyTestsExist(parsed_results):
			num_runs_without_flaky += 1
		else:
			logging.debug('Flaky tests detected. Removing flaky tests.')
			removeFlakyTests(tests_dir, target_class, parsed_results)
			num_runs_without_flaky = 0
			foundFlaky = True


		logging.debug('Current runs without flaky tests - %d' % num_runs_without_flaky)
		return foundFlaky

def cleanBytecodeFiles(tests_dir, target_class):
	short_classname = target_class.split('.')[-1]
	all_tests_generated = retrieveTestFromEvosuite(tests_dir).split(" ")[1:]
	for test_file in all_tests_generated:
		if short_classname + '_ESTest.java' not in test_file \
				and short_classname + '_ESTest_scaffolding.java' in test_file:
			continue

		bytecode_file = test_file.replace('.java', '.class')
		if os.path.exists(bytecode_file):
			os.remove(bytecode_file)


def compileTest(tests_dir, projectClasspath, evoclasspath, target_class):
	short_classname = target_class.split('.')[-1]
	javapath = "{}/bin/".format(pathToJava7())
	all_tests_generated = retrieveTestFromEvosuite(tests_dir).split(" ")[1:]
	test_files = ""
	for test_file in all_tests_generated:
		if short_classname + '_ESTest.java' in test_file or short_classname + '_ESTest_scaffolding.java' in test_file:
			test_files += test_file + " "

	compile_command = "export DDMM=`pwd`;pwd;cd {};{}/javac -cp {}{}{} {};cd $DDMM;pwd".format(tests_dir, javapath, evoclasspath,os.path.pathsep, projectClasspath, test_files)
	logging.debug("compile command:\n{}".format(compile_command))
	#os.system(compile_command)
	process = subprocess.Popen(compile_command, shell="True", stdout=PIPE, stderr=PIPE)
	out, err = process.communicate()
	logging.debug("out compile2 generated test: {}".format(out))

def runGeneratedTests(tests_dir, evo_classpath, project_classpath, target_class):
	all_test_names = retrieveClassesTestEvosuite(tests_dir)
	test_names = ''
	for test_name in all_test_names:
		if target_class + '_ESTest' == test_name:
			test_names += test_name + ' '

	logging.debug("-->{}".format(tests_dir))

	logging.debug("Generated test classes to run {}".format(test_names))
	javapath = "{}/bin/".format(pathToJava8())

	jccfile = tests_dir+ "/jacoco.exec"

	execute_test_command = "{}/java -javaagent:{}/lib/jacocoagent.jar=append=false,destfile={} -cp {}{}{}{}{} org.junit.runner.JUnitCore {}".format(javapath,currentpath,jccfile, evo_classpath, os.path.pathsep, tests_dir, os.path.pathsep,
																					project_classpath, test_names)
	logging.debug(execute_test_command)
	result = os.popen(execute_test_command).read()
	logging.debug(result)

	return result


def flakyTestsExist(parsed_results):
	if int(parsed_results['num_failing_tests']) > 0:
		return True
	else:
		return False


def removeFlakyTests(tests_dir, target_class, parsed_results):
	num_failing_tests = int(parsed_results['num_failing_tests'])
	failing_tests = parsed_results['all_fails']
	assert len(failing_tests) == num_failing_tests, "Number of failing tests and size of failing tests do not match!"
	failing_test_names = dict()
	for failing_test in failing_tests:
		test_case_name = failing_test.split('(')[0]
		test_file_name = failing_test.split('(')[1].split(')')[0]
		if test_file_name not in failing_test_names:
			failing_test_names[test_file_name] = list()
			failing_test_names[test_file_name].append(test_case_name)
		else:
			failing_test_names[test_file_name].append(test_case_name)

	test_file_path = tests_dir + '/' + target_class.replace('.', '/') + '_ESTest.java'
	test_file_name = target_class + '_ESTest'
	line_nums_to_comment = set()
	flaky_test_case_found = False
	logging.debug('Identifying line numbers of flaky test cases in %s' % test_file_name)
	with open(test_file_path) as test_file:
		lines = test_file.readlines()
		num_lines = len(lines)
		for line_num in range(0, num_lines):
			line = lines[line_num]

			if flaky_test_case_found:
				if '@Test(timeout = ' in line and 'public void ' in lines[line_num + 1]:
					line_nums_to_comment.remove(line_num - 1)
					flaky_test_case_found = False
				else:
					line_nums_to_comment.add(line_num)
			else:
				for test_case_name in failing_test_names[test_file_name]:
					if 'public void ' + test_case_name + '()' in line:
						line_nums_to_comment.add(line_num - 1)
						line_nums_to_comment.add(line_num)
						flaky_test_case_found = True
						logging.debug('Flaky test case %s found in %s' % (test_case_name, test_file_name))

		if flaky_test_case_found:
			line_nums_to_comment.remove(num_lines - 1)

		logging.debug('Failing test case names in {} - {}'.format(test_file_name, failing_test_names[test_file_name]))
		logging.debug('Line numbers of flaky test cases in {} - {}'.format(test_file_name, line_nums_to_comment))

	# write the modified test to a file
	logging.debug('Update the test suite {} with flaky test cases removed at {}'.format(test_file_name, test_file_path))
	modified_test = ''
	with open(test_file_path) as test_file:
		lines = test_file.readlines()
		num_lines = len(lines)
		for line_num in range(0, num_lines):
			line = lines[line_num]
			if line_num in line_nums_to_comment:
				modified_test += '// ' + line
			else:
				modified_test += line

	if os.path.exists(test_file_path):
		os.remove(test_file_path)

	with open(test_file_path, 'w') as test_file:
		test_file.write(modified_test)


def parseExecResults(result):
	result_lines = result.split('\n')
	time = ''
	ok_pattern = 'OK (* test*)'
	fail_pattern = 'Tests run: *,  Failures: *'
	fail_info_pattern = '*test*(*)'
	num_failing_tests = '0'
	num_tests_run = ''

	assertion_fail_pattern = '*org.junit.ComparisonFailure:*expected*but was*'
	assert_fail_info = ''
	exception_pattern = '*java.lang.AssertionError: Expecting exception*'
	exception_info = ''
	other_reason = ''

	no_test_found_count = 0
	warning_patern = '*warning*'
	reason = ''
	all_fails = []
	all_reasons = []

	for k in range(0, len(result_lines)):
		line = result_lines[k]

		if 'Time: ' in line:
			time = line.split('Time: ')[1]
		if fnmatch.fnmatch(line, ok_pattern):
			num_failing_tests = '0'
			num_tests_run = line.split('(')[1].split(' ')[0]
		if fnmatch.fnmatch(line, fail_pattern):
			num_failing_tests = line.split("Failures: ")[1]
			num_tests_run = line.split(",")[0].split("Tests run: ")[1]
		if fnmatch.fnmatch(line, fail_info_pattern):
			if not line.startswith("\tat"):
				if " " in line:
					if line.split('test')[1].split('(')[0].isdigit():
						all_fails.append(line.split(" ")[1])
						all_reasons.append(result_lines[k + 1])
		if fnmatch.fnmatch(line, warning_patern):
			no_test_found_count += 1
		if fnmatch.fnmatch(line, assertion_fail_pattern):
			assert_fail_info += line + '^'
		if fnmatch.fnmatch(line, exception_pattern):
			exception_info += line + '^'

	# TODO: Use the parsed results to remove flaky tests etc.?
	logging.debug('Parsed results -> time - {}, tests run - {}, num failing tests - {}, no tests found - {}, '
		  'all failed test ids - {}, all reasons - {}, assert fail info - {}, exception info - {}'.format(
			time, num_tests_run, num_failing_tests, no_test_found_count, all_fails, all_reasons, assert_fail_info,
			exception_info))

	parsed_results = dict()
	parsed_results['time'] = float(time)
	parsed_results['tests_run'] = int(num_tests_run)
	parsed_results['num_failing_tests'] = num_failing_tests
	parsed_results['no_tests_found'] = no_test_found_count
	parsed_results['all_fails'] = all_fails
	parsed_results['all_reasons'] = all_reasons
	parsed_results['assert_fail_info'] = assert_fail_info
	parsed_results['exception_info'] = exception_info

	return parsed_results


def sanityCheck(tests_dir, evo_classpath, project_classpath, target_class):
	logging.debug('Clean bytecode files of %s tests in %s' % (target_class, tests_dir))
	cleanBytecodeFiles(tests_dir, target_class)

	logging.debug('Compile generated tests for %s in %s' % (target_class, tests_dir))
	compileTest(tests_dir=tests_dir, evoclasspath=evo_classpath, projectClasspath=project_classpath,
				target_class=target_class)

	logging.debug('Run generated tests for %s in %s' % (target_class, tests_dir))
	result = runGeneratedTests(tests_dir, evo_classpath, project_classpath, target_class)

	logging.debug('Parse results from test execution for %s in %s' % (target_class, tests_dir))
	parsed_results = parseExecResults(result)

	if int(parsed_results['num_failing_tests']) > 0:
		logging.debug('Sanity check FAIL for %s tests in %s' % (target_class, tests_dir))
		return False
	else:
		logging.debug('Sanity check PASS for %s tests in %s' % (target_class, tests_dir))
		return True
