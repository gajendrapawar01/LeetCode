class Solution {
    public int diagonalPrime(int[][] nums) {
        int maxPrime = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int val1 = nums[i][i];
            int val2 = nums[i][n - 1 - i];

            if (val1 > maxPrime && isPrime(val1)) {
                maxPrime = val1;
            }
            if (val2 > maxPrime && isPrime(val2)) {
                maxPrime = val2;
            }
        }

        return maxPrime;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; (long) i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}