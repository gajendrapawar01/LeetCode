class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] targetCounts = new int[26];
        for (int i = 0; i < licensePlate.length(); i++) {
            char c = Character.toLowerCase(licensePlate.charAt(i));
            if (c >= 'a' && c <= 'z') {
                targetCounts[c - 'a']++;
            }
        }

        String shortest = null;
        for (String word : words) {
            if (shortest != null && word.length() >= shortest.length()) {
                continue;
            }
            if (isCompleting(word, targetCounts)) {
                shortest = word;
            }
        }

        return shortest;
    }

    private boolean isCompleting(String word, int[] targetCounts) {
        int[] counts = new int[26];
        for (int i = 0; i < word.length(); i++) {
            counts[word.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (counts[i] < targetCounts[i]) {
                return false;
            }
        }
        return true;
    }
}