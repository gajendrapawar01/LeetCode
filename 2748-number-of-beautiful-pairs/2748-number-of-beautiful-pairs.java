class Solution {
    public int countBeautifulPairs(int[] nums) {
        int[] count = new int[10];
        int pairs = 0;

        for (int num : nums) {
            int lastDigit = num % 10;
            for (int d = 1; d <= 9; d++) {
                if (count[d] > 0 && gcd(d, lastDigit) == 1) {
                    pairs += count[d];
                }
            }

            int firstDigit = num;
            while (firstDigit >= 10) {
                firstDigit /= 10;
            }
            count[firstDigit]++;
        }

        return pairs;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}