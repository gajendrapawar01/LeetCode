class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        int degree = 0;
        int minLength = 0;

        for (int i = 0; i < nums.length; i++) {
            first.putIfAbsent(nums[i], i);
            int currentCount = count.getOrDefault(nums[i], 0) + 1;
            count.put(nums[i], currentCount);

            if (currentCount > degree) {
                degree = currentCount;
                minLength = i - first.get(nums[i]) + 1;
            } else if (currentCount == degree) {
                minLength = Math.min(minLength, i - first.get(nums[i]) + 1);
            }
        }

        return minLength;
    }
}