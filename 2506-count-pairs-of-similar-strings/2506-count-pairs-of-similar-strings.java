import java.util.HashMap;
import java.util.Map;

class Solution {
    public int similarPairs(String[] words) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (String word : words) {
            int mask = 0;
            for (int i = 0; i < word.length(); i++) {
                mask |= 1 << (word.charAt(i) - 'a');
            }
            int count = map.getOrDefault(mask, 0);
            ans += count;
            map.put(mask, count + 1);
        }

        return ans;
    }
}