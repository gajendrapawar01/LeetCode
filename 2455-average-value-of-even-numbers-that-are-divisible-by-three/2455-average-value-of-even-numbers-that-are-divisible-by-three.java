class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int count=0;

        for(int num:nums){
            if(num%6==0){
                count++;
                sum+=num;
            }
        }
        if(sum>0)return sum/count;
        return 0;
    }
}