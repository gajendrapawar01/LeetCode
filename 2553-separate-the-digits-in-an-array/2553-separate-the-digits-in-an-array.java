class Solution {
    public int[] separateDigits(int[] nums) {
        int totalDigits = 0;
        for (int num : nums) {
            int temp = num;
            while (temp > 0) {
                totalDigits++;
                temp /= 10;
            }
        }

        int[] ans = new int[totalDigits];
        int idx = totalDigits - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = nums[i];
            while (temp > 0) {
                ans[idx--] = temp % 10;
                temp /= 10;
            }
        }

        return ans;
    }
}