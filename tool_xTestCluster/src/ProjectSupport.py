import os
import shutil
import fnmatch
import subprocess
from src.Config import *
from unidiff import PatchSet
import re
import difflib
import sys
import logging


## https://realpython.com/python-logging/
#filename='app.log', filemode='w', format='%(name)s - %(levelname)s - %(message)s'
logging.basicConfig(format='%(levelname)-8s [%(filename)s:%(lineno)d] %(message)s',
    datefmt='%Y-%m-%d:%H:%M:%S',level=logging.DEBUG)

timeoutSeconds = 500 # seconds

ALL_TestGen = "ALL_TestGen"

EVOSUITE = "EVOSUITE"

RANDOOP = "RANDOOP"

exprTestNameRandoop = "[a-z]*Test[0-9]+.java"

prefixTestFolder = "test_from"

folderNameResultsBugs = "resultsTestExecutionPerBug"

folderNameResultPatch = "resultsTestExecutionPerPatch"

fileNameResultBug = "result_{}test_exec_{}.json"

YES = "yes"

FOUND_FLAKY_TEST = "Found_Flaky_Test"

SANITY_CHECK_PASS = "sanity_check_pass"

PATCH_ID = "patch_id"

REMOVING_CHECKED = "removing_project_checked"

EXISTING = "existing"

NO = "no"

OK = "ok"

ERROR = "ERROR"

UNKNOWN = "Unknown"

ARRIVE_END = "arrive_end"

PROJECT_CHECKED = "project_checked"

PATCH_UNDO = "patchUndo"

ERROR_LOG_TEST_GENERATION = "errorLogTestGeneration"

COMPILED_PROJECT_MODIFIED = "compiledProjectModified"

TEST_GENERATED_PASSING = "testGeneratedPassing"

TEST_COMPILED = "testCompiled"

TEST_GENERATED = "testGenerated"

TEST_GENERATED_NAMES = "testGeneratedNames"

PATCHED_PROJECT_PASS_ALL_TEST = "patched_project_pass_all_test"

PATCH_APPLIED = "patchApplied"

PATCH_APPLIED_DIFF_Verified = "patchAppliedDiffVerified"

FOLDER_TEST_GENERATED = "FolderTestGenerated"
ERROR_SEPARATOR = "@@@"

currentpath =  os.path.dirname(os.path.dirname(os.path.realpath(__file__)))
d4jpath = getPathDefects4J()


def compilePatchedProject(checkedoutDir, timeoutSeconds=60):
		preSetupJava = configJavaPath(JAVAHOME7)

		command = preSetupJava+";export PREVDIR=`pwd`;cd {}; {}/defects4j compile;cd $PREVDIR;pwd".format(checkedoutDir,d4jpath )
		logging.debug("command compile {}".format(command))
		#os.system(command)
		try:

			out = subprocess.check_output(command, stderr=subprocess.STDOUT, timeout=timeoutSeconds,
										  shell=True)  # in seconds

			logging.debug("Output compile patched command: \n{}".format(out))
			return True, None
		except subprocess.TimeoutExpired as e:
			logging.error("TimeOut of {} reached for compiling project at {}".format(timeoutSeconds, checkedoutDir))
			return False, "Timeout"
		except subprocess.CalledProcessError as ce:
			logging.error("The process of compilation returns unexpected results, probably program does not compile: {}".format(ce))
			logging.error("Status : FAIL", ce.returncode)
			result = str(ce.output)
			return False, "FailCompiling"


def executeOriginalTestPatchedProject(checkedoutDir, timeoutSeconds=240, mustPass = True):
	preSetupJava = configJavaPath(JAVAHOME7)

	command = preSetupJava + ";export PREVDIR=`pwd`;cd {}; {}/defects4j test;cd $PREVDIR;pwd".format(checkedoutDir,
																									   d4jpath)
	logging.debug("command test run using D4J: {}".format(command))
	# os.system(command)
	try:

		out = subprocess.check_output(command, stderr=subprocess.STDOUT, timeout=timeoutSeconds,
									  shell=True)  # in seconds

		outS = str(out)
		logging.debug("Output test patched command: \n{}".format(out))

		if (mustPass and "nFailing tests: 0" in outS ) or (not mustPass and  not "nFailing tests: 0" in outS):
			return True, None
		else:
			return False, None
	except subprocess.TimeoutExpired as e:
		logging.error("TimeOut of {} reached for executing original test  at {}".format(timeoutSeconds, checkedoutDir))
		return False, "Timeout"
	except subprocess.CalledProcessError as ce:
		logging.error("The process of  execution test {}".format(ce))
		logging.error("Status : FAIL", ce.returncode)
		result = str(ce.output)
		return False, "FailCompiling"

'''It is deprecated as we now explicily says which JVM we use'''
def pathToJavaHome():
	javaHome = getJavaHome()
	preSetupJava = "export PATH={}:$PATH;export JAVA_HOME={};".format(javaHome, javaHome)
	logging.debug("Java home: {}".format(javaHome))
	return preSetupJava

def pathToJava7():
	return pathToJava(JAVAHOME7)

def pathToJava(javaHome):
	if not os.path.exists(javaHome):
		import sys
		logging.debug("Error: The path does not exit: finish program {}".format(javaHome))
		sys.exit()

	return javaHome

def pathToJava8():
	return pathToJava(JAVAHOME8)


def configJavaPath(javaHome):
	if not os.path.exists(javaHome):
		import sys
		logging.debug("Error: The path does not exit: finish program {}".format(javaHome))
		sys.exit()

	preSetupJava = "export PATH={}/bin/:$PATH;export JAVA_HOME={}; echo $JAVA_HOME".format(javaHome, javaHome)
	logging.debug("Java home: {}".format(javaHome))
	return preSetupJava


def retrieveTestFromRandoop(path):
	logging.debug("finding files on  {}".format(path))
	all = ""
	for root, dirs, files in os.walk(path, topdown=False):
		for name in files:
			matched = re.match(exprTestNameRandoop, name,  re.IGNORECASE)
			is_match = bool(matched)
			if is_match:
				all =  all + " " +os.path.join(root, name)
	return all

def retrieveTestFromEvosuite(path):
	all = ""
	for root, dirs, files in os.walk(path, topdown=False):
		for name in files:
			if name.endswith("ESTest.java") or name.endswith("_ESTest_scaffolding.java"):
				all = all + " " +os.path.join(root, name)
	return all


def retrieveClassesTestEvosuite(path):
	all = []
	for root, dirs, files in os.walk(path, topdown=False):
		for name in files:
			if name.endswith("ESTest.java"):
				all.append(os.path.join(root, name).replace(".java", "").replace(path, "").replace("/", ".")[1:])
	return all

def retrieveClassesTestRandoop(path):
	all = []
	for root, dirs, files in os.walk(path, topdown=False):
		for name in files:
			matched = re.match(exprTestNameRandoop, name, re.IGNORECASE)
			is_match = bool(matched)
			if is_match:
				all.append(os.path.join(root, name).replace(".java", "").replace(path, "").replace("/", ".")[1:])
	return all

def getLogTestGenerationFinish(logOut, isEvo, bugid):
	return os.path.join(logOut, "finished_{}_{}.info".format("evosuite" if isEvo else "randoop", bugid))

def apply_patch(patchpath, buggyProject, revert = False, verifyApplication = True):
	if not revert:
		logging.debug("Appying patch")
	else:
		logging.debug("Reverting applied patch")
	try:
		with open(patchpath) as fp:

			contentFilePatch = fp.read()
			fp.close()

			patchSet = PatchSet.from_string(contentFilePatch)
			allResults = ""
			statusAll = 0
			verificationAll = 0
			nrdiff = 1
			for aDiff in patchSet:
				diffs = str(aDiff)
				logging.debug("diff splitted {}/{} ***\n{}\n***".format(nrdiff,len(patchSet), diffs))
				nrdiff+=1
				# split a patch to several temporary patches in case one patch containes many fixes for different files
				filepath='./tmp.patch'
				f=open(filepath,"w")
				f.write(diffs)
				f.close()
				tmppatch='./tmp.patch'
				lines = diffs.split('\n')
				first_line = lines[0]
				iLine = 0
				while not first_line.startswith("---"):
					first_line = lines[iLine]
					iLine +=1
				# original buggy file patch
				filepath=first_line.split('--- ')[1].strip()

				if filepath.startswith("a/"):
					filepath = filepath[2:]

				original_file=  buggyProject + '/' + filepath

				### Workaround for fixing the CRLF

				fbuggy = open(original_file, "r")
				originalFileContent = fbuggy.read()
				fbuggy.close()
				fbuggy = open(original_file, "w")
				fbuggy.write(originalFileContent)
				fbuggy.close()
				## end workaround

				command = "patch " + (" -R " if revert else "") + " -f -u -l --fuzz=10  -i " + tmppatch + "  " + original_file
				logging.debug("command apply patch: "+ command)
				process = subprocess.Popen(command, shell="True")
				out, err = process.communicate()
				logging.debug("Status patch command: {} ".format(process.returncode))
				#try:
				#	out = subprocess.check_output(command, stderr=subprocess.STDOUT, timeout=timeoutSeconds, shell=True)  # in seconds
				#except subprocess.CalledProcessError as grepexc:
				#	logging.debug("error code", grepexc.returncode, grepexc.output)

				result = str(out)
				allResults+=result

				if "patch unexpectedly ends in middle of line" in result:
					logging.error("Error: Patch with unexpectedly ends in middle of line")

				os.remove(tmppatch)
				logging.debug("Result apply {}".format(result))

				if verifyApplication:
					fbuggy = open(original_file, "r")
					contentAfterApplication = fbuggy.read()

					resultDiff = difflib.context_diff(originalFileContent.split("\n"), contentAfterApplication.split("\n"))
					logging.debug(" -- Diff original and patched: \n".format())
					for r in  resultDiff:
						logging.debug(r)

					if contentAfterApplication != originalFileContent:
						logging.debug("* Well applied: Content different after applying patch\n")

					else:
						logging.error("* Error in application: Content idem after applying patch\n")
						verificationAll = -1

					if process.returncode != 0:
						statusAll = process.returncode

			return allResults, statusAll, verificationAll
	except BaseException as err:
		logging.error("Problems by applying {}".format(patchpath))
		logging.error("Error obtained: {}".format(err))
		return "", -1, -1

def checkEncoding(contentFilePatch):
	crlf, lfcr = contentFilePatch.count('\r\n'), contentFilePatch.count('\n\r')
	cr, lf = contentFilePatch.count('\r'), contentFilePatch.count('\n')
	logging.debug('crlf: %s' % crlf)
	logging.debug('lfcr: %s' % lfcr)
	logging.debug('cr: %s' % cr)
	logging.debug('lf: %s' % lf)


def checkout_project(filePatchId, projectDestination, bugtype ="b", singleCheckout = False):
	try:
		arraynames = os.path.basename(filePatchId).split("-")
		projectId = arraynames[1]
		bugId = arraynames[2]

		lcProjectId = projectId.lower()#projectId.decode('utf-8').lower()
		if not os.path.exists(projectDestination):
			os.system('mkdir ' + projectDestination)
			os.system('mkdir ' + projectDestination + '/lib')
			os.system('cp ./lib/evosuite-1.1.0.jar  ' + projectDestination + '/lib/')
		if not os.path.exists(projectDestination + '/' + projectId):
			os.system('mkdir ' + projectDestination + '/' + projectId)

		dest =   projectDestination + '/' + projectId + '/' + lcProjectId + '_' + bugId + '_buggy'

		if os.path.exists(dest):

			if singleCheckout:
				logging.debug("project exist avoid checkout {}".format(dest))
				return dest, False
			else:
				shutil.rmtree(dest)

		os.makedirs(dest)
		logging.debug("Checkout dir {}".format(dest))

		## Buggy lines

		# HERE
		#os.chdir(dest)

		command =  d4jpath + '/defects4j checkout -p ' + projectId + ' -v ' + bugId + bugtype + ' -w ' + dest

		preSetupJava = configJavaPath(JAVAHOME7)

		command = "export PREVDIR=`pwd`;pwd;cd "+dest+ ";"+preSetupJava+ ";"+command+";cd $PREVDIR;pwd;"

		logging.debug("command checkout: {}".format(command))

		try:

			out = subprocess.check_output(command, stderr=subprocess.STDOUT, timeout=timeoutSeconds,
										  shell=True)  # in seconds

			logging.debug("Output checkout command: \n{}".format(out))

		except subprocess.TimeoutExpired as e:
			logging.error("TimeOut of {} reached for check out {} {}".format(timeoutSeconds, projectId, bugId))
			return None, False
		##Originally was here
		#export_classpath_compile(dest)

		return dest, True
	except BaseException as ex:
		logging.error("Problem doing check out  of {} : {} ".format(filePatchId, ex))
		return None, False


def copy_project(filePatchId, projectDestination):
	try:
		if (not os.path.exists(LOCATION_EXTRACTED_DEFECTS4)):
			logging.error("The folder with D4J bugs does not exists {}, now calling to checkout.".format(LOCATION_EXTRACTED_DEFECTS4))
			return checkout_project(filePatchId, projectDestination)

		arraynames = os.path.basename(filePatchId).split("-")
		projectId = arraynames[1]
		bugId = arraynames[2]

		lcProjectId = projectId.lower()

		dest = projectDestination + '/' + projectId + '/' + lcProjectId + '_' + bugId + '_buggy'
		logging.debug("Copying extracted bug to {}".format(dest))

		locBug = "{}/{}/{}_{}".format(LOCATION_EXTRACTED_DEFECTS4, lcProjectId,lcProjectId , bugId)

		copyBugDefectsFolder(locBug, dest)

		logging.debug("Copied extracted bug to {}".format(dest))

		return dest, True

	#	if not os.path.exists(projectDestination):
	#		os.system('mkdir ' + projectDestination + '/lib')
	#		os.system('cp ./lib/evosuite-1.0.6.jar  ' + projectDestination + '/lib/')
	#	if not os.path.exists(projectDestination + '/' + projectId):
	#		os.system('mkdir ' + projectDestination + '/' + projectId)





	except BaseException as ex:
		logging.error("Problem doing check out  of {} : {} ".format(filePatchId, ex))
		return None, False

def export_classpath_compile(dest):

	try:
		#logging.debug("Exporting src classpath to compile")
		command = d4jpath + '/defects4j export -p cp.compile -o src_build_path.txt'

		preSetupJava = configJavaPath(JAVAHOME8) ### Here it fails if we use Java7
		command = "export PREVDIR=`pwd`;pwd;cd " + dest + ";" +  preSetupJava  + ";"+ command+ ";cd $PREVDIR;pwd;"

		logging.debug("command export src classpath {}".format(command))

		out = subprocess.check_output(command, stderr=subprocess.STDOUT, timeout=timeoutSeconds,
									  shell=True)  # in seconds

		logging.debug("Output  export src: \n{}".format(out))

		# Classpath to compile and run the developer-written tests
		#logging.debug("Exporting test classpath to compile")
		command = d4jpath + '/defects4j export -p cp.test -o test_build_path.txt'
		preSetupJava = configJavaPath(JAVAHOME7)

		## HERE BF
		command = "export PREVDIR=`pwd`;pwd;cd " + dest + ";" + preSetupJava + command+ ";cd $PREVDIR;pwd;" # preSetupJava + command #

		logging.debug("command export tests: {}".format(command))

		out = subprocess.check_output(command, stderr=subprocess.STDOUT, timeout=timeoutSeconds,
									  shell=True)

		logging.debug("Output  export test: \n{}".format(out))

	except subprocess.TimeoutExpired as e:
		logging.error("TimeOut of {} exporting path in {}".format(timeoutSeconds,dest))
		return None, False  # False, "Timeout"




def parserOutput(result):
	resultlines = str(result).strip().split('\n')

	if len(resultlines) == 1:
		resultlines = result.split('\\n')

	logging.debug("Number of result lines: {}".format(len(resultlines)))

	time = ''
	okpattern = 'OK (* test*)'
	failpattern = 'Tests run: *,  Failures: *'
	failInfoPattern = '*test*(*)'
	failingInfo = ''
	nrFailingTests = 0
	nrTestExec = 0
	NoTestFoundCount = 0
	warningpatern = '*warning*'
	reason = ''
	allFails = []
	timeOuts = []
	failing_assertions = []
	searching_failing_lines = False
	first_line_found = False
	test_class_name = ""
	all_failing_lines = []
	failing_lines_per_test_case = []


	for k in range(0, len(resultlines)):
		line = resultlines[k]
		if searching_failing_lines:

			if line.startswith("\tat ") or line.startswith("\\tat "):
				if not first_line_found:
					first_line_found = True

				if test_class_name in line:

					rsp = line.split("\tat ")
					## Workarround
					if len(rsp) == 1:
						rsp = line.split("\\tat ")

					failing_lines_per_test_case.append(rsp[1])
			else:
				if first_line_found:
					searching_failing_lines = False
					first_line_found = False
					test_class_name = ""
					all_failing_lines.append(failing_lines_per_test_case)
					failing_lines_per_test_case = []
		if 'Time: ' in line:
			time = line.split('Time: ')[1]
		if fnmatch.fnmatch(line, okpattern):
			nrFailingTests = '0'
			nrTestExec = int(line.split('(')[1].split(' ')[0])
		if fnmatch.fnmatch(line, failpattern):
			nrFailingTests = line.split("Failures: ")[1]
			nrTestExec = int(line.split(",")[0].split("Tests run: ")[1])
		if fnmatch.fnmatch(line, failInfoPattern):
			line = line

			if "[Time-limited" in line:
				timeOuts.append(line)
			elif not line.startswith("\tat") and not line.startswith("\\tat"):
				if " " in line:
					failing_test_id = str(line).strip().split(" ")[1]
					allFails.append(failing_test_id)

					if len(resultlines[k+1].strip()) > 0:
						failing_assertions.append(resultlines[k+1])

					if "(" in failing_test_id and ")" in failing_test_id:
						test_class_name = (failing_test_id.split("(")[1]).split(")")[0]
						searching_failing_lines = True
		if fnmatch.fnmatch(line, warningpatern):
			NoTestFoundCount = int(NoTestFoundCount) + 1

	return int(nrFailingTests), int(nrTestExec), allFails, failing_assertions, all_failing_lines


def getClasspathOfProject(checkedoutProject):
	classpath = ''

	src_build_path_fp = checkedoutProject + '/src_build_path.txt'
	logging.debug('Extracting classpath of src from {}'.format(src_build_path_fp))
	if os.path.exists(src_build_path_fp):
		with open(src_build_path_fp) as src_build_path_file:
			src_build_path_lines = src_build_path_file.readlines()
			if len(classpath) > 0:
				classpath = classpath + ':' + src_build_path_lines[0]
			else:
				classpath = src_build_path_lines[0]

	test_build_path_fp = checkedoutProject + '/test_build_path.txt'
	logging.debug('Extracting classpath of test from {}'.format(test_build_path_fp))
	if os.path.exists(test_build_path_fp):
		with open(test_build_path_fp) as test_build_path_file:
			test_build_path_lines = test_build_path_file.readlines()
			if len(classpath) > 0:
				classpath = classpath + ':' + test_build_path_lines[0]
			else:
				classpath = test_build_path_lines[0]

	classpath = checkClasspath(classpath)


	if len(classpath) == 0:
		logging.debug("END Unexpected: Classpath empty after extracting classpath")
		sys.exit()

	return classpath


def checkClasspath(classpath):
	classpaths = classpath.split(':')
	filtered_classpath = ''
	for cp in classpaths:
		if os.path.exists(cp):
			if len(filtered_classpath) > 0:
				filtered_classpath = filtered_classpath + ':' + cp
			else:
				filtered_classpath = cp

	return filtered_classpath


def retrieveAllPatches(patchesDir = "./Patches/patches-DRR/"):

	collectedPatches = []
	patchesDir =  os.path.realpath(patchesDir)
	for classification in ['Dcorrect', 'Doverfitting', 'Dunassessed']:
		for iApproach	in 	os.listdir(os.path.join(patchesDir, classification)):
			for iDataset in os.listdir(os.path.join(patchesDir, classification, iApproach)):
				for iPatch in os.listdir(os.path.join(patchesDir, classification, iApproach, iDataset)):
					file = os.path.join(patchesDir, classification, iApproach, iDataset, iPatch)
					if file not in collectedPatches:
						collectedPatches.append(file)
					else:
						logging.debug("existing patch {}".format(file))

	return collectedPatches

def retriveNotDuplicatePatches(bugid, duplicatePatches):
	groupsFromBugid = duplicatePatches[bugid]
	patches = []
	##Only one patch from a group
	for aGroup in groupsFromBugid:
		if len(aGroup) == 0:
			logging.debug("Error: empty group for bug {}".format())
		else:
			## Sort to be more deterministic
			aGroupSorted = sorted(aGroup)
			onePatchFromGroup = aGroupSorted[0]
			patches.append(onePatchFromGroup)

	return patches


def retrieveAllPatchesFromBugid( bugid, patchesDirs = [], considerDunassessed = True ):

	collectedPatches = []
	types = ['Dcorrect', 'Doverfitting']

	if considerDunassessed:
		types.append( 'Dunassessed')

	for aPatchDir in patchesDirs:
		for classification in types:
			dirCorr = os.path.join(aPatchDir, classification)

			if not os.path.exists(dirCorr):
				continue

			for iApproach in  os.listdir(dirCorr):

				if iApproach == ".DS_Store":
					continue

				for iDataset in os.listdir(os.path.join(aPatchDir, classification, iApproach)):

					if iDataset == ".DS_Store":
						continue

					for iPatch in os.listdir(os.path.join(aPatchDir, classification, iApproach, iDataset)):

						if iPatch == ".DS_Store":
							continue

						if fnmatch.fnmatch(iPatch, "*-{}-*".format(bugid)) :
							file = os.path.join(aPatchDir, classification, iApproach, iDataset, iPatch)
							if file not in collectedPatches:
								collectedPatches.append(file)
							else:
								logging.debug("existing patch {}".format(file))

	return collectedPatches


def retrieveAllBugs(patchesDirs = []):

	collectedBugs = []

	for aPatchDir in patchesDirs:

		aPatchDir =  os.path.realpath(aPatchDir)
		for classification in ['Dcorrect', 'Doverfitting', 'Dunassessed', 'Dsame', 'Ddifferent']:

			dirClassif = os.path.join(aPatchDir, classification)

			if not os.path.exists(dirClassif):
				continue

			for iApproach in 	os.listdir(dirClassif):
				if iApproach == ".DS_Store":
					continue

				for iDataset in os.listdir(os.path.join(aPatchDir, classification, iApproach)):

					if iDataset == ".DS_Store":
						continue

					for iPatch in os.listdir(os.path.join(aPatchDir, classification, iApproach, iDataset)):

						if iPatch == ".DS_Store":
							continue

						ps = iPatch.split("-")

						bugid = "{}-{}".format(ps[1], ps[2])

						if bugid not in collectedBugs:
							collectedBugs.append(bugid)


	return collectedBugs


def retrieveTools(patchesDirs = [], considerDunassessed = False):

	toolsAndPatches = {}
	allPatches = 0

	types = ['Dcorrect', 'Doverfitting']

	if considerDunassessed:
		types.append( 'Dunassessed')

	for aPatchDir in patchesDirs:

		aPatchDir =  os.path.realpath(aPatchDir)
		for classification in types:

			dirClassif = os.path.join(aPatchDir, classification)

			if not os.path.exists(dirClassif):
				continue

			for iApproach in 	os.listdir(dirClassif):

				iApproachRoot = iApproach.replace("2015", "").replace("2017", "" ).title()

				if iApproach == ".DS_Store":
					continue

				if iApproachRoot not in toolsAndPatches:
					toolsAndPatches[iApproachRoot] = {}

				if classification not in toolsAndPatches[iApproachRoot]:
					toolsAndPatches[iApproachRoot][classification] = 0

				for iDataset in os.listdir(os.path.join(aPatchDir, classification, iApproach)):

					if iDataset == ".DS_Store":
						continue

					for iPatch in os.listdir(os.path.join(aPatchDir, classification, iApproach, iDataset)):

						if iPatch == ".DS_Store":
							continue

						toolsAndPatches[iApproachRoot][classification] = toolsAndPatches[iApproachRoot][classification] + 1
						allPatches+=1

	return toolsAndPatches, allPatches

def retrieveClassesFromDiff(file):
	file1 = open(file, 'r')
	count = 0
	lines = []
	for line in file1:
		count += 1
		if line.startswith("---"):
			logging.debug("--> finding a class name in line {}".format(line))
			### TO improve .replace("src/main/java", "")
			classname = line.replace("--- ", "").strip().replace(".java", "").replace("/src/main/java", "").replace("src/main/java", "").replace(
				"/src/java", "").replace("src/java", "").replace("/src", "").replace("/source", "").replace("source/", "/").replace("src/", "/").replace("/", ".")

			while str(classname).startswith(".") or str(classname).startswith("/"):
				classname =  classname[1:]

			lines.append(classname)

			logging.debug("found class name: {}".format(classname))

	# Closing files
	file1.close()
	return lines

def copyBugDefectsFolder(forlderSource, folderDest ):

	if os.path.exists(folderDest):
		shutil.rmtree(folderDest)
		logging.debug("Removed existing folder {}".format(folderDest))
	shutil.copytree(forlderSource, folderDest)
	logging.debug("Copied from {} to {} ".format(forlderSource, folderDest))