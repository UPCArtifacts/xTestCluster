# xTestCluster 

## Appendix of paper: Test-based Patch Clustering for Automated Program Repair.


## Data

We use tree existing datasets of Defects4J patches.
The patches are publicly available in the repositories of  those dataset, which we present below.

### Dataset DRR:


Data (patches) from "Automated Patch Assessment for Program Repair at Scale" by Ye et al. is available at [DRR](https://github.com/KTH/drr).
The patches are splitted in 3 folders: DCorrect (contains the correct), Doverfitting (contains the overfitting), Dunassesed (those not classified). 


### Dataset APR-Efficiency: 

Data (patches) from "On the efficiency of test suite based program repair: A Systematic Assessment of 16 Automated Repair Systems for Java Programs" by Liy et al. is available at [APR-Efficiency](https://github.com/SerVal-DTF/APR-Efficiency).


### Dataset APIARTY

Data (patches) from "Evaluating Automatic Program Repair Capabilities to Repair API Misuses" by Kechagia et al. is available at [APIARTY](https://github.com/SOLAR-group/APIARTy).


## Results from our experiment

### Test Generation

We generate test cases for each patch using Randoop and Evosuite.
The tests are available in the `test_generation` folder.
The generated test cases are divided by test generation tool, and then by bug id. 
For example, the folder `test_generation/generatedTestEvosuite/Chart_17` has the test created by Evosuite for patches of Chart17.
Then, inside of them, there are one folder for each patch of the bug. That folder contains the test cases generated after applying the patch.
For example, the folder `generatedTestEvosuite/Chart_17/test_from_DRR_patch1-Chart-17-Elixir-plausible/` contains the Evosuite test generated from the Elixir patch for Chart 17, available on the DRR repository.
The identifiers of the patch repositories are: `DRR` for Ye et al, `API` for Kechagia et al.  `NFL` and `PFL` for Liu et al.


### Test Execution

The information related to the execution of each generated patch is store in folder `test_execution` and also divided in two subfolders (Randoop and evosuite). 
For example, file `test_execution/evosuite/result_test_exec_Math-70.json` contains the execution of all Evosuite test cases executed on all the patches for bug Math-70. (We exclude the execution of duplicate (i.e., syntactically equivalent) patches)

### Clustering

For each bug we present a JSON file that shows the cluster generated based on the test execution.
The cluster generated using both Evosuite and Randoop, which are presented in the paper, have the identified *Both* and availables at `clustering/both`.
Moreover, we also present the clusters generated only Evosuite test in folder `clustering/evosuite` and only randoop in folder `clustering/randoop`.

We also present the classification of the bugs from Defects4J according to the types of cluster they have (e.g., pure correct cluster, pure incorrect cluster, mixed cluster, etc).
The following files contain the information presented in the paper, in particular:

* `clustering/summary/both/consideredbugs.md` contains the bug Ids of the Defects4J bugs considered in our experiments
* `clustering/summary/both/bugsWithSingleCluster.md` contains the bug Ids of the Defects4J bugs with a single cluster

* `clustering/summary/both/bugsWithMixedClusters.md` contains the bug Ids of the Defects4J bugs with, at least, one mixed cluster (i.e., with correct and incorrect patches)

* `clustering/summary/both/bugsWithMultipleClusters.md` contains the bug Ids of the Defects4J bugs with multiple clusters

* `clustering/summary/both/bugsWithOnlyPureCorrectClusters.md` contains the bug Ids of the Defects4J bugs with at least one pure correct cluster.

* `clustering/summary/both/bugsWithOnlyPureIncorrectClusters.md` contains the bug Ids of the Defects4J bugs with at least one pure incorrect cluster.

* `clustering/summary/both/bugsWithPureCorrectAndPureIncorrectClusters.md` contains the bug Ids of the Defects4J bugs with at least one pure correct cluster, and at least one incorrect cluster, but no mixed cluster.

### Patch Selection

The results of the patch selection strategy based on patch length are presented in file `https://github.com/UPHF/xTestCluster/blob/main/selection/README.md`.



## The tool xTestCluster

The implementation of xTestCluster is publicly available at folder `tool_xTestCluster`. 
If you use the tool, please cite our paper.

### Instructions

* First, download the patches to be analyzed and put in `tool_xTestCluster/Patches`. For the experiment presented in the paper paper,  we download patches from
 https://github.com/KTH/drr, which were put in folder (`tool_xTestCluster/Patches/patchesDRR`),  from https://github.com/SerVal-DTF/APR-Efficiency which were put in `tool_xTestClusterPatches/patchesEffectivenessICSE20`, and from https://github.com/SOLAR-group/APIARTy put in `tool_xTestCluster/Patches/patchesAPI`
 * Change the location to the Java virtual machine and Defects4J repositories in file `Config.py`. You need to previously checkout the bugs from Defects4J.
 * Run xTestCluster using the entry point `MainLauncher.py`



