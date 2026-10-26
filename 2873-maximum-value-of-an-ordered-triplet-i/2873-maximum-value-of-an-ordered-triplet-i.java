class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxVal = 0;
        long maxDiff = 0;
        long maxNum = 0;

        for (int num : nums) {
            maxVal = Math.max(maxVal, maxDiff * num);
            maxDiff = Math.max(maxDiff, maxNum - num);
            maxNum = Math.max(maxNum, (long) num);
        }

        return maxVal;
    }
}