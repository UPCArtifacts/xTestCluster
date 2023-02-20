import os.path
import unittest

from src.Clustering import  *
class MyTestCase(unittest.TestCase):

	def test_mergeAll(self):

		allBugs = ["Chart-7", "Chart-12", "Closure-14", "Closure-18", "Closure-31", "Closure-38", "Closure-46", "Closure-62", "Closure-115", "Closure-126", "Lang-6", "Lang-10", "Lang-24", "Lang-39", "Lang-43", "Lang-45", "Lang-55", "Math-4", "Math-33", "Math-57", "Math-58", "Math-59", "Math-70", "Math-71"]
		print("\n ITEMS: ",len(allBugs))

		for item in allBugs:
			print(item)
			seeds = []
			for seed in ["seed_0", "seed_101", "seed_201", "seed_301", "seed_302", "seed_303", "seed_304", "seed_305", "seed_306", "seed_307", "seed_308", "seed_309", "seed_310", "seed_311", "seed_400R"]:
				path = "/Users/matias/develop/git-xTestCluster/new_seed/logsEvo/{}/resultsTestExecutionPerBugUnzip/result_test_exec_{}.json".format(seed, item)
				if os.path.exists(path):
					print("Exist", path)
					seeds.append(path)
				else:
					print("Error",seed,  path)

			merged = mergeResultsSeeds(seeds)
			cr = clusterPatches(merged, "")
			print("Results", cr)

			bugid, json_string = expandClusterJson(cr, filter, item, {})

			f = open("/Users/matias/develop/git-xTestCluster/new_seed/logsEvo/all_seedsR/result_summary_Evosuite_{}.json".format(item), "w")
			f.write(json_string)
			f.close()







	def test_something(self):
		#self.assertEqual(True, False)  # add assertion here
		merged = mergeResultsSeeds(["/Users/matias/develop/git-xTestCluster/new_seed/logsEvo/seed_0/resultsTestExecutionPerBugUnzip/result_test_exec_Chart-7.json",
						   "/Users/matias/develop/git-xTestCluster/new_seed/logsEvo/seed_101/resultsTestExecutionPerBugUnzip/result_test_exec_Chart-7.json",
							"/Users/matias/develop/git-xTestCluster/new_seed/logsEvo/others/result_test_exec_Chart-7.json"])

		cr = clusterPatches(merged, "")
		print("Results", cr)
		json_string = json.dumps(cr, indent=4)
		print(json_string)

	def testNavigate(self):

		files = {}
		for seed in os.listdir("/Users/matias/develop/git-xTestCluster/new_seed/logsEvo/"):
			cpath = "/Users/matias/develop/git-xTestCluster/new_seed/logsEvo/"+ seed+ "/resultsTestExecutionPerBugUnzip/"
			if ".DS_Store" == seed:
				continue

			for execution  in os.listdir(cpath):
				if execution.startswith("result_test_exec"):
					if execution not in files:
						files[execution] = []
					files[execution].append(cpath+ execution)


		for key in files:
			print(key, len(files[key]), files[key])


if __name__ == '__main__':
	unittest.main()
