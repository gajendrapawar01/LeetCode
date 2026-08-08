class Solution {
    public int fillCups(int[] amount) {
        int max = 0;
        int sum = 0;
        for (int x : amount) {
            max = Math.max(max, x);
            sum += x;
        }
        return Math.max(max, (sum + 1) / 2);
    }
}