class Solution {
    public int[] leftRightDifference(int[] nums) {
        int rightTotal=0,leftTotal=0,temp=0;

        for(int num:nums){
            rightTotal+=num;
        }

        for(int i=0;i<nums.length;i++){
            leftTotal+=temp;
            temp=nums[i];
            rightTotal-=temp;
            int ans=Math.abs(leftTotal-rightTotal);
            nums[i]=ans;
        }
        return nums;
    }
}