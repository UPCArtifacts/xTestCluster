# xTestCluster 

## Appendix of paper: Test-based Patch Clustering for Automated Program Repair.


## Data

We use tree existing datasets of Defects4J patches.
The patches are publicly available in the repositories of  those dataset, which we present below.

### Dataset DRR:


Data from this experiment (i.e., Patches) collected, processed and curated by Ye et al. available at [DRR](https://github.com/KTH/drr)
If you use the data please cite:

```
@Article{Ye2021EMSE,
    author = {Ye, He and Martinez, Matias and Monperrus, Martin},
    title = "Automated Patch Assessment for Program Repair at Scale",
    journal="Empirical Software Engineering",
    volume = "26",
    issn = "1573-7616",
    doi = "https://doi.org/10.1007/s10664-020-09920-w",
    year = "2021"
}
```


The patches are splitted in 3 folders: DCorrect (contains the correct), Doverfitting (contains the overfitting), Dunassesed (those not classified). 


### Dataset APR-Efficiency: 

The dataset of patches is available at [APR-Efficiency](https://github.com/SerVal-DTF/APR-Efficiency).
If you use this dataset, please cite:

```
Kui Liu, Shangwen Wang, Anil Koyuncu, Kisub Kim, Tegawendé F. Bissyandé, Dongsun Kim, Peng Wu, Jacques Klein, Xiaoguang Mao, and Yves Le Traon. 2020. 
On the efficiency of test suite based program repair: A Systematic Assessment of 16 Automated Repair Systems for Java Programs. In Proceedings of the ACM/IEEE 42nd International Conference on Software Engineering (ICSE '20). Association for Computing Machinery, New York, NY, USA, 615–627. DOI:https://doi.org/10.1145/3377811.3380338
```

We apply several transformations on the data provided by Lui et al. which we encoded in the script [patchConverter.py](../src/transformers/patchConverterICSE2020.py).

First, many patches have noice and mistakes e.g., wrong file paths, reference to local folders, missing characters (e.g. ` ---`).

Second, we organize the patches according from the convention from Ye He et al. from DRR.
Consequently, we can analyze patches from Lui et al and from Ye He et al using the same scripts.

Important: the converter may not focus on all mistakes, so it would be necessary to apply the patch and to see the result.


### Dataset APIARTY

The dataset of patches is available at [APIARTY](https://github.com/SOLAR-group/APIARTy).
If you use this dataset, please cite:

```
@ARTICLE{9381596,
  author={Kechagia, Maria and Mechtaev, Sergey and Sarro, Federica and Harman, Mark},
  journal={IEEE Transactions on Software Engineering}, 
  title={Evaluating Automatic Program Repair Capabilities to Repair API Misuses}, 
  year={2021},
  volume={},
  number={},
  pages={1-1},
  doi={10.1109/TSE.2021.3067156}}
```



## Results from our experiment

### Test Generation

We generate test cases for each patch using Randoop and Evosuite.
The tests are available in the [test_generation](test_generation) folder.
The generated test cases are divided by test generation tool, and then by bug id. 
For example, the folder [/generatedTestEvosuite/Chart_17](test_generation/generatedTestEvosuite/Chart_17) has the test created by Evosuite for patches of Chart17.
Then, inside of them, there are one folder for each patch of the bug. That folder contains the test cases generated after applying the patch.
For example, the folder [generatedTestEvosuite/Chart_17/test_from_DRR_patch1-Chart-17-Elixir-plausible/](https://github.com/UPHF/xTestCluster/tree/main/test_generation/generatedTestEvosuite/Chart_17/test_from_DRR_patch1-Chart-17-Elixir-plausible/org/jfree/data/time) contains the Evosuite test generated from the Elixir patch for Chart 17, available on the DRR repository.
The identifiers of the patch repositories are: DRR for Ye et al, API for Kechagia et al.  NFL and PFL for Liu et al.


### Test Execution

### Clustering


## The tool
