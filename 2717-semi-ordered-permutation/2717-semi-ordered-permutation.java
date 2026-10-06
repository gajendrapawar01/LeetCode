class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int n = nums.length;
        int idx1 = 0;
        int idxN = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                idx1 = i;
            }
            if (nums[i] == n) {
                idxN = i;
            }
        }

        int swaps = idx1 + (n - 1 - idxN);
        return idx1 > idxN ? swaps - 1 : swaps;
    }
}