class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] ans = new int[n];

        for (int c = 0; c < n; c++) {
            int maxLen = 0;
            for (int r = 0; r < m; r++) {
                maxLen = Math.max(maxLen, getLength(grid[r][c]));
            }
            ans[c] = maxLen;
        }

        return ans;
    }

    private int getLength(int x) {
        int len = 0;
        if (x <= 0) {
            len = 1; // Accounts for '0' or the negative sign '-'
        }
        while (x != 0) {
            len++;
            x /= 10;
        }
        return len;
    }
}