import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] suffix = new int[n + 1];
        Set<Integer> set = new HashSet<>();

        for (int i = n - 1; i >= 0; i--) {
            set.add(nums[i]);
            suffix[i] = set.size();
        }

        int[] diff = new int[n];
        set.clear();

        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
            diff[i] = set.size() - suffix[i + 1];
        }

        return diff;
    }
}