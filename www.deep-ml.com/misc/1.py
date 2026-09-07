// Problem: Deep-ML | Matrix-Vector Dot Product
// Platform: www.deep-ml.com
// Language: Python3
// Verdict: Accepted
// URL: https://www.deep-ml.com/problems/1
// Solved on: 2026-09-07T05:54:15.411Z

def matrix_dot_vector(a: list[list[int|float]], b: list[int|float]) -> list[int|float]:
	if len(a[0])!=len(b):
		return -1
	result=[]
	for raw in a:
		dot_prod=0;
		for i in range(len(b)):
			dot_prod+=raw[i]*b[i]
		result.append(dot_prod)
	return result