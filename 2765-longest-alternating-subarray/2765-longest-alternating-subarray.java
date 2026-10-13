class Solution {
    public int alternatingSubarray(int[] nums) {
        int maxLen = -1;
        int currLen = -1;

        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i] - nums[i - 1];

            if (currLen > 0 && diff == (currLen % 2 == 0 ? -1 : 1)) {
                currLen++;
            } else if (diff == 1) {
                currLen = 2;
            } else {
                currLen = -1;
            }

            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }
}