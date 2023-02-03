#!/bin/bash
for i in {303..320}
do
echo "$i"
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Math-59 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Lang-24 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Closure-31 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Math-71 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Chart-12 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Closure-46 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Chart-7 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Math-70 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Lang-10 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Lang-24 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Math-57 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Lang-39 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Lang-45 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Lang-55 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Math-4 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Lang-43 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Closure-14 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Closure-18 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Lang-6 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Math-33 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Math-58 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Closure-115 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Closure-62 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Closure-126 $i;
/home/mmartinez/xTestCluster/tool_xTestCluster/runGenAndExec.sh Closure-38 $i;
done
echo "End"
