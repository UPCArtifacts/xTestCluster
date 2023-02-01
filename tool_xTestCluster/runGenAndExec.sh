bugid=$1
seed=$2

python3 -m src.MainLauncher testgenerationsingle \
	/home/mmartinez/xTestCluster/Patches/Patches_Wang902/Patches_ICSE@/home/mmartinez/xTestCluster/Patches/Patches_Wang902/Patches_others \
	/home/mmartinez/xTestCluster/new_seed/logsEvo \
	/home/mmartinez/xTestCluster/new_seed/tempCheckoutProjects \
	/home/mmartinez/xTestCluster/new_seed/newTestGenerated \
	evosuite $bugid $seed;

python3 -m src.MainLauncher testexecutionsingle \
/home/mmartinez/xTestCluster/Patches/Patches_Wang902/Patches_ICSE@/home/mmartinez/xTestCluster/Patches/Patches_Wang902/Patches_others \
/home/mmartinez/xTestCluster/new_seed/newTestGenerated/seed_${seed}Evosuite \
/home/mmartinez/xTestCluster/new_seed/logsEvo/seed_${seed} \
True \
$bugid;