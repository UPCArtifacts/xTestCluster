from subprocess import Popen, PIPE
import subprocess
import os
import shutil
from src.ProjectSupport import *
import logging


def compileGeneratedTest(outputdir, classpath, allTesteGenerated, useJava7 = False):

	folderName = os.path.basename(outputdir)
	if len(allTesteGenerated) == 0:
		logging.error("No test cases generated")
		return False
	if useJava7:
		preSetupJava = configJavaPath(JAVAHOME7)
		pathtoJava = "{}/bin/".format(pathToJava7())
	else:
		preSetupJava = configJavaPath(JAVAHOME8)
		pathtoJava = "{}/bin/".format(pathToJava8())

	commandcompile =  "{};echo 'Init at: ';pwd;export DDMM=`pwd`;cd {};{}/javac -cp {} {};cd $DDMM;echo 'dir at end'; pwd;echo ' end'".format(preSetupJava,outputdir,pathtoJava,classpath, allTesteGenerated)
	logging.debug("compile generated test command:\n {}".format(commandcompile))
	#os.system(commandcompile)
	process = subprocess.Popen(commandcompile, shell="True", stdout=PIPE, stderr=PIPE)
	out, err = process.communicate()
	logging.debug("out compile generated test: {}".format(out))

	if err is not None and "javac: no source files" in str(err):

		logging.error("Problems compiling at {} tests {}".format(folderName, allTesteGenerated))

		return False

	return True
