class Solution {
    public int maxSum(int[] nums) {
        int[] maxVal = new int[10];
        for (int i = 0; i < 10; i++) {
            maxVal[i] = -1;
        }

        int maxSum = -1;

        for (int num : nums) {
            int maxDigit = getMaxDigit(num);
            if (maxVal[maxDigit] != -1) {
                maxSum = Math.max(maxSum, num + maxVal[maxDigit]);
            }
            maxVal[maxDigit] = Math.max(maxVal[maxDigit], num);
        }

        return maxSum;
    }

    private int getMaxDigit(int n) {
        int max = 0;
        while (n > 0) {
            max = Math.max(max, n % 10);
            n /= 10;
        }
        return max;
    }
}