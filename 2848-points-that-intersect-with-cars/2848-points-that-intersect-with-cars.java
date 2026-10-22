class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] count = new int[102];
        for (List<Integer> range : nums) {
            int start = range.get(0);
            int end = range.get(1);
            count[start]++;
            count[end + 1]--;
        }

        int ans = 0;
        int current = 0;
        for (int c : count) {
            current += c;
            if (current > 0) {
                ans++;
            }
        }

        return ans;
    }
}