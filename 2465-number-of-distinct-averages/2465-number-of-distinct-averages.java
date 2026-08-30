import java.util.Arrays;

class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        boolean[] seen = new boolean[201];
        int count = 0;
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int sum = nums[left++] + nums[right--];
            if (!seen[sum]) {
                seen[sum] = true;
                count++;
            }
        }

        return count;
    }
}