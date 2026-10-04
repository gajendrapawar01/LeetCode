class Solution {
    public int[] circularGameLosers(int n, int k) {
        boolean[] visited = new boolean[n];
        int curr = 0;
        int step = 1;
        visited[0] = true;

        while (true) {
            curr = (curr + step * k) % n;
            if (visited[curr]) {
                break;
            }
            visited[curr] = true;
            step++;
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
            }
        }

        int[] losers = new int[count];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                losers[idx++] = i + 1;
            }
        }

        return losers;
    }
}