# How to run the executed test cases?

## Configure 
Replace in Config.py the paths to:
- The JDK path (JAVAHOME7, JAVAHOME8). It should be Java 8 as it 's required by defects4J
- Optional: the option  `APPLY_CHECKOUT_D4J_OPTION` (also included in the `Config.py`) controls if a project from Defects4J is obtained by running the command  `defects4j compile` or if it's copied from another location (i.e., it was already checked out). In this case, `LOCATION_EXTRACTED_DEFECTS4` shoould contain the path to a folder where the bugs are checkedout.


### Run all test cases of all patches of a given bug

```
python3 -m src.MainLauncher \
  testexecutionsingle \
  path to folder with patch (if we have more than one folder, join with '-') \
  folder-test-cases-generated (path to Evosuite or Randoop folder) \ 
  path-to-folder-results \
  True for Evosuite, False for Randoop \
  Project-Bugid
```

For example: running Evosuite
```
python3 -m src.MainLauncher \
  testexecutionsingle 
  <path>/Patches/patchesDRR/-<path>/Patches/patchesEffectivenessICSE20/NFL/-<path>/Patches/patchesEffectivenessICSE20/PFL/-<path>/Patches/patchesAPI/ \
  <path>/test_generation/generatedTestEvosuite \ 
  <path>/tool_xTestCluster/resultsTemp \
  True \ 
  Math-70
```
Replace `<path>` by the path to the repository.

For example: running Randoop
```
python3 -m src.MainLauncher \
  testexecutionsingle 
  <path>/Patches/patchesDRR/-<path>/Patches/patchesEffectivenessICSE20/NFL/-<path>/Patches/patchesEffectivenessICSE20/PFL/-<path>/Patches/patchesAPI/ \
  <path>/test_generation/generatedTestRandoop \ 
  <path>/tool_xTestCluster/resultsTemp \
  False \ 
  Math-70
```

As running the test cases for all the patches for a bug, we can run all test for a single patch, we use parameter `testexecutionsinglepatch`.

```
python3 -m src.MainLauncher \
  testexecutionsinglepatch \
  <path-to-patch> \
  <path>/test_generation/generatedTestEvosuite \ 
  <path>/tool_xTestCluster/resultsTemp \
  True \ 
  Math-70
```

Example for patch `patch9-Math-85-SequenceR.patch` and `Evosuite` test: 

```
python3 -m src.MainLauncher \
  testexecutionsinglepatch \
  <path>/Patches/patchesDRR/Doverfitting/SequenceR/Math/patch9-Math-85-SequenceR.patch \
  <path>/test_generation/generatedTestEvosuite \
  <path>/tool_xTestCluster/resultsTemp \
  True
```