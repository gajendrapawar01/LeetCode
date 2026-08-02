import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] count = new int[1001];
        int n = nums.length;

        for (int[] array : nums) {
            for (int num : array) {
                count[num]++;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            if (count[i] == n) {
                result.add(i);
            }
        }

        return result;
    }
}