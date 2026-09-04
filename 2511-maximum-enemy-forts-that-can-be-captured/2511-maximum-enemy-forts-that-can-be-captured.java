class Solution {
    public int captureForts(int[] forts) {
        int maxForts = 0;
        int prev = -1;

        for (int i = 0; i < forts.length; i++) {
            if (forts[i] != 0) {
                if (prev != -1 && forts[i] == -forts[prev]) {
                    maxForts = Math.max(maxForts, i - prev - 1);
                }
                prev = i;
            }
        }

        return maxForts;
    }
}