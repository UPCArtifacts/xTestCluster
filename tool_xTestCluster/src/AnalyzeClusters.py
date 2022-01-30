import json
import os
import matplotlib.pyplot as plt
from collections import Counter

def analyzeCluster(fileClusters):

	f = open(fileClusters)
	clusters = json.load(f)

	nr_clusters = clusters["nr_clusters"]

	f.close()
	return nr_clusters


def runClusteringReport(pathResultsExecutionFolder, toolTestGeneration = ""):


	allNrClusters = []
	filesConsidered = []

	pp = toolTestGeneration.lower()

	if toolTestGeneration.lower() == "both":
		pp = "merged"

	prefix = "result_summary_{}".format(pp)
	print("prefix {}".format(prefix))
	for file in os.listdir(pathResultsExecutionFolder):

		if file.startswith(prefix):

			fullpath = os.path.join(pathResultsExecutionFolder, file)

			nr_clusters = analyzeCluster(fullpath)

			allNrClusters.append(nr_clusters)

			filesConsidered.append(file)

	print(allNrClusters)
	c = Counter(allNrClusters)
	print(c)
	for k in sorted(c.keys()):
		print("{} | {} ".format(k, c[k]))

	plt.hist(allNrClusters)
	plt.xlabel('Cluster size', fontsize=15)
	plt.ylabel('Frequency', fontsize=15)
	plt.savefig("../results/plots/cluster_histo_{}.pdf".format(toolTestGeneration))

	plt.show()
