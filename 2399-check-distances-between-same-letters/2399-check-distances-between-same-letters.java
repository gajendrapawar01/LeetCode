class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] firstIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (firstIndex[c] > 0) {
                if (i - firstIndex[c] != distance[c]) {
                    return false;
                }
            } else {
                firstIndex[c] = i + 1;
            }
        }
        return true;
    }
}