class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long total = 0;
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int temp = nums[right];
            int multiplier = 1;
            while (temp > 0) {
                multiplier *= 10;
                temp /= 10;
            }
            total += (long) nums[left] * multiplier + nums[right];
            left++;
            right--;
        }

        if (left == right) {
            total += nums[left];
        }

        return total;
    }
}