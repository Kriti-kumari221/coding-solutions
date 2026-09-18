// Problem: Search in Rotated Sorted Array
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/search-in-rotated-sorted-array/
// Solved on: 2026-09-18T11:24:24.546Z

class Solution {
    public int search(int[] nums, int target) {
        int right=nums.length-1;
        int left=0;
        while(left<=right){
            int mid=(right+left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>=nums[left]){
                if(nums[left]<=target&&nums[mid]>=target){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else{
                if(nums[mid]<=target&&nums[right]>=target){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}