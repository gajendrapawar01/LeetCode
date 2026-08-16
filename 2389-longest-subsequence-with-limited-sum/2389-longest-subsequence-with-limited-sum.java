import java.util.Arrays;

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        int m = queries.length;
        int[] ans = new int[m];

        for (int i = 0; i < m; i++) {
            int idx = Arrays.binarySearch(nums, queries[i]);
            if (idx >= 0) {
                ans[i] = idx + 1;
            } else {
                ans[i] = -idx - 1;
            }
        }

        return ans;
    }
}