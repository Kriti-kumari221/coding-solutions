// Problem: Deep-ML | Calculate Mean by Row or Column
// Platform: www.deep-ml.com
// Language: Python3
// Verdict: Accepted
// URL: https://www.deep-ml.com/problems/4
// Solved on: 2026-09-07T06:27:11.370Z

def calculate_matrix_mean(matrix: list[list[float]], mode: str) -> list[float]:
	raw=[]
	if mode=="column":
		for i in range(len(matrix[0])):
			sum=0
			for j in range(len(matrix)):
				sum+=matrix[j][i]
			raw.append(sum/len(matrix))
	if mode=="raw":
		for i in range(len(matrix)):
			sum=0
			for j in range(len(matrix[0])):
				sum+=matrix[i][j]
			raw.append(sum/len(matrix[0]))
	
	return raw