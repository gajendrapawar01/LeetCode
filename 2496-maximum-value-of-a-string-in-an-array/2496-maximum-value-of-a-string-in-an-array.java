class Solution {
    public int maximumValue(String[] strs) {
        int maxVal = 0;
        for (String s : strs) {
            maxVal = Math.max(maxVal, getValue(s));
        }
        return maxVal;
    }

    private int getValue(String s) {
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                val = val * 10 + (c - '0');
            } else {
                return s.length();
            }
        }
        return val;
    }
}