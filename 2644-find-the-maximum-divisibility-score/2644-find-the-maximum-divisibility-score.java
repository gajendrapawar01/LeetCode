class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxScore = -1;
        int bestDivisor = Integer.MAX_VALUE;

        for (int d : divisors) {
            int score = 0;
            for (int num : nums) {
                if (num % d == 0) {
                    score++;
                }
            }

            if (score > maxScore) {
                maxScore = score;
                bestDivisor = d;
            } else if (score == maxScore) {
                bestDivisor = Math.min(bestDivisor, d);
            }
        }

        return bestDivisor;
    }
}