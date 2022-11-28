import os
JAVAHOME78="<SET_PATH>/jdk1.8.0_45/"

JAVAHOME7="<SET_PATH>/jdk1.8.0_101.jdk/Contents/Home/"
JAVAHOME8="<SET_PATH>jdk1.8.0_101.jdk/Contents/Home/"

LOCATION_EXTRACTED_DEFECTS4="<SET_PATH_TO_FOLDER_WITH_BUGS>"

### Checkout using D4J or Copy from file system
APPLY_CHECKOUT_D4J_OPTION = True


def getPathDefects4J():
	pD4J = os.getenv('DEFECTS4J_HOME')

	if pD4J is not None:
		path = pD4J + '/framework/bin'
		if os.path.exists(path):
			return path

	## If we cannot resolve the path, we return the harcoded path
	return "<SET_PATH>/defects4j/framework/bin/"


def getJavaHome():
	if os.path.exists(JAVAHOME78):
		return JAVAHOME78

	if os.getenv('JAVA_HOME') is not None:
		return os.getenv('JAVA_HOME')

	else:
		print("Error, Configure your java home.")
		return None
