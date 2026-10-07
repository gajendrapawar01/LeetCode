class Solution {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3) {
            return -1;
        }

        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));

        if (a != min && a != max) return a;
        if (b != min && b != max) return b;
        return c;
    }
}