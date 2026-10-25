class Solution {
    public int minOperations(List<Integer> nums, int k) {
        boolean[] collected = new boolean[k + 1];
        int count = 0;
        int collectedCount = 0;

        for (int i = nums.size() - 1; i >= 0; i--) {
            count++;
            int num = nums.get(i);
            if (num <= k && !collected[num]) {
                collected[num] = true;
                collectedCount++;
                if (collectedCount == k) {
                    break;
                }
            }
        }

        return count;
    }
}