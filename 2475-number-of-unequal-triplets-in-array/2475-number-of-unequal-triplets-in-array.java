import java.util.HashMap;
import java.util.Map;

class Solution {
    public int unequalTriplets(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int triplets = 0;
        int prev = 0;
        int n = nums.length;

        for (int count : countMap.values()) {
            int next = n - prev - count;
            triplets += prev * count * next;
            prev += count;
        }

        return triplets;
    }
}