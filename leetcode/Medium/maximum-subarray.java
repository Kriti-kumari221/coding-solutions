// Problem: Maximum Subarray
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/maximum-subarray/
// Solved on: 2026-09-11T17:16:21.176Z

class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=0;
        int max=nums[0];
        for(int i=0;i<n;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            if(max<sum){
                max=sum;
            }
        }
        return max;
        
    }
}