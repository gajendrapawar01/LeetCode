import java.util.HashMap;
import java.util.Map;

class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = -1;
        int maxFreq = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                int freq = map.getOrDefault(num, 0) + 1;
                map.put(num, freq);

                if (freq > maxFreq || (freq == maxFreq && num < ans)) {
                    maxFreq = freq;
                    ans = num;
                }
            }
        }

        return ans;
    }
}