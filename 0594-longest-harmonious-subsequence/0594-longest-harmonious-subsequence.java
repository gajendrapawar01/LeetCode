class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        int maxLen = 0;
        for (int key : counts.keySet()) {
            if (counts.containsKey(key + 1)) {
                maxLen = Math.max(maxLen, counts.get(key) + counts.get(key + 1));
            }
        }

        return maxLen;
    }
}