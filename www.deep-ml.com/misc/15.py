// Problem: Deep-ML | Linear Regression Using Gradient Descent
// Platform: www.deep-ml.com
// Language: Python3
// Verdict: Accepted
// URL: https://www.deep-ml.com/problems/15
// Solved on: 2026-09-10T19:48:07.931Z

import numpy as np

def linear_regression_gradient_descent(X: np.ndarray, y: np.ndarray, alpha: float, iterations: int) -> np.ndarray:
    """
    Perform linear regression using gradient descent.

    Args:
        X: Feature matrix of shape (m, n) where first column is all ones (for intercept)
        y: Target vector of shape (m,)
        alpha: Learning rate
        iterations: Number of gradient descent iterations
    
    Returns:
        Learned weights as a 1D array of shape (n,)
    """
    m, n = X.shape
    theta=np.zeros(n)
    for _ in range(iterations):
        prediction=X @ theta
        error=prediction-y 
        gradient=(1/m)*(X.T @ error)
        theta=theta-alpha*gradient
    
    


    return theta.flatten()