class Solution {
    public int findMaxK(int[] nums) {
        int start=0;
        int end=nums.length-1;
        Arrays.sort(nums);
        while(start<end){
            if(-nums[start]==nums[end]){
                return Math.abs(nums[start]);
            }
            else if(-nums[start]<nums[end]){
                end--;
            }
            else{
                start++;
            }
        }
        return -1;
    }
}