// Problem: Find Minimum in Rotated Sorted Array
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// Solved on: 2026-09-18T11:19:13.590Z

class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
       int l=0;
       int r=n-1;
       while(l<r){
        int mid=l+(r-l)/2;
        if(nums[mid]>nums[r]){
            l=mid+1;
        }
        else {
            r=mid;
        }
       }
       return nums[l];
        
    }
}