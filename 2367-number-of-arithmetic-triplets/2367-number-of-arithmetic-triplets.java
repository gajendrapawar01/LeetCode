class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        boolean[] seen = new boolean[201];
        for (int num : nums) {
            seen[num] = true;
        }

        int count = 0;
        for (int num : nums) {
            if (num >= 2 * diff && seen[num - diff] && seen[num - 2 * diff]) {
                count++;
            }
        }

        return count;
    }
}