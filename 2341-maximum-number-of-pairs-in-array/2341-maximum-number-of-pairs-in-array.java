class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] count = new int[101];
        for (int num : nums) {
            count[num]++;
        }

        int pairs = 0;
        int leftover = 0;

        for (int c : count) {
            pairs += c / 2;
            leftover += c % 2;
        }

        return new int[]{pairs, leftover};
    }
}