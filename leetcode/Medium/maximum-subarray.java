// Problem: Maximum Subarray
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/maximum-subarray/
// Solved on: 2026-09-11T17:25:31.139Z

class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            if(max<sum){
                max=sum;
            }
        }
        return max;
    }
}