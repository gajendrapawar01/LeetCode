import java.util.Arrays;

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (int[] row : grid) {
            Arrays.sort(row);
        }

        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int j = 0; j < n; j++) {
            int maxCol = 0;
            for (int i = 0; i < m; i++) {
                maxCol = Math.max(maxCol, grid[i][j]);
            }
            ans += maxCol;
        }

        return ans;
    }
}