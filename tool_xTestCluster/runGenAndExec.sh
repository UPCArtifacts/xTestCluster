bugid=$1
seed=$2

python3 -m src.MainLauncher testgenerationsingle \
	/home/mmartinez/xTestCluster/Patches/Patches_Wang902/Patches_ICSE@/home/mmartinez/xTestCluster/Patches/Patches_Wang902/Patches_others \
	/home/mmartinez/xTestCluster/new_seed/logsRandoop \
	/home/mmartinez/xTestCluster/new_seed/tempCheckoutProjects \
	/home/mmartinez/xTestCluster/new_seed/newTestGenerated \
	randoop $bugid $seed;

python3 -m src.MainLauncher testexecutionsingle \
/home/mmartinez/xTestCluster/Patches/Patches_Wang902/Patches_ICSE@/home/mmartinez/xTestCluster/Patches/Patches_Wang902/Patches_others \
/home/mmartinez/xTestCluster/new_seed/newTestGenerated/seed_${seed}Randoop \
/home/mmartinez/xTestCluster/new_seed/logsRandoop/seed_${seed} \
False \
$bugid;