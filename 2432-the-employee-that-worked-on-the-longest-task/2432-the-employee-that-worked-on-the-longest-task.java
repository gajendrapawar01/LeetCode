class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int maxDuration = logs[0][1];
        int ans = logs[0][0];

        for (int i = 1; i < logs.length; i++) {
            int duration = logs[i][1] - logs[i - 1][1];
            int id = logs[i][0];

            if (duration > maxDuration) {
                maxDuration = duration;
                ans = id;
            } else if (duration == maxDuration) {
                ans = Math.min(ans, id);
            }
        }

        return ans;
    }
}