class Solution {
    public int maxProduct(int[] nums) {
        int pro=1;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            pro=pro*nums[i];
            if(max<pro){
                max=pro;
            }
        }
        return max;
    }
}