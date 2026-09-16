class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        boolean[] seen = new boolean[10];
        int min1 = 10;
        int min2 = 10;
        int commonMin = 10;

        for (int num : nums1) {
            seen[num] = true;
            min1 = Math.min(min1, num);
        }

        for (int num : nums2) {
            min2 = Math.min(min2, num);
            if (seen[num]) {
                commonMin = Math.min(commonMin, num);
            }
        }

        if (commonMin < 10) {
            return commonMin;
        }

        return Math.min(min1, min2) * 10 + Math.max(min1, min2);
    }
}