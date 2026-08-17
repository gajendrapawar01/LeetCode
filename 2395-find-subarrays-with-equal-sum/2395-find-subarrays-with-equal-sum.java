import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int i = 1; i < nums.length; i++) {
            if (!seen.add(nums[i] + nums[i - 1])) {
                return true;
            }
        }
        return false;
    }
}