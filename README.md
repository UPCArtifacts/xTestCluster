# xTestCluster 

## Appendix of paper: Test-based Patch Clustering for Automated Program Repair.


## Data

The dataset from Wang et al. [1] used in this experiment is available in https://zenodo.org/record/3730599#.Y_8eOOzMKeQ.

```
[1] Shangwen Wang, Ming Wen, Bo Lin, Hongjun Wu, Yihao Qin, Deqing Zou, Xiaoguang Mao, and Hai Jin. 2021. Automated patch correctness assessment: how far are we? In Proceedings of the 35th IEEE/ACM International Conference on Automated Software Engineering (ASE '20). Association for Computing Machinery, New York, NY, USA, 968–980. https://doi.org/10.1145/3324884.3416590
```


## Results from our experiment

### Test Generation

We generate test cases for each patch using Randoop and Evosuite.
The tests are available in the `test_generation` folder.
The generated test cases are divided by test generation tool, and then by bug id. 
For example, the folder `test_generation/generatedTestEvosuite/Chart_17` has the test created by Evosuite for patches of Chart17.
Then, inside of them, there are one folder for each patch of the bug. That folder contains the test cases generated after applying the patch.


### Test Execution

The information related to the execution of each generated patch is store in folder `test_execution` and also divided in two subfolders (Randoop and evosuite). 
For example, file `test_execution/evosuite/result_test_exec_Math-70.json` contains the execution of all Evosuite test cases executed on all the patches for bug Math-70. (We exclude the execution of duplicate (i.e., syntactically equivalent) patches)

### Clustering

For each bug we present a JSON file that shows the cluster generated based on the test execution.


We also present the classification of the bugs from Defects4J according to the types of cluster they have (e.g., pure correct cluster, pure incorrect cluster, mixed cluster, etc).
The following files contain the information presented in the paper, in particular:

* `clustering/summary/consideredbugs.md` contains the bug Ids of the Defects4J bugs considered in our experiments
* `clustering/summary/bugsWithSingleCluster.md` contains the bug Ids of the Defects4J bugs with a single cluster

* `clustering/summary/bugsWithMixedClusters.md` contains the bug Ids of the Defects4J bugs with, at least, one mixed cluster (i.e., with correct and incorrect patches)

* `clustering/summary/bugsWithMultipleClusters.md` contains the bug Ids of the Defects4J bugs with multiple clusters

* `clustering/summary/bugsWithOnlyPureCorrectClusters.md` contains the bug Ids of the Defects4J bugs with at least one pure correct cluster.

* `clustering/summary/bugsWithOnlyPureIncorrectClusters.md` contains the bug Ids of the Defects4J bugs with at least one pure incorrect cluster.

* `clustering/summary/bugsWithPureCorrectAndPureIncorrectClusters.md` contains the bug Ids of the Defects4J bugs with at least one pure correct cluster, and at least one incorrect cluster, but no mixed cluster.



## The tool xTestCluster

The implementation of xTestCluster is publicly available at folder `tool_xTestCluster`. 
If you use the tool, please cite our paper.

### Instructions

* First, download the patches to be analyzed and put in `tool_xTestCluster/Patches`. 
For the experiment presented in the paper paper,  we download patches from https://zenodo.org/record/3730599#.Y_8eOOzMKeQ
* Change the location to the Java virtual machine and Defects4J repositories in file `Config.py`. You need to previously checkout the bugs from Defects4J.
* Run xTestCluster using the entry point `MainLauncher.py`



