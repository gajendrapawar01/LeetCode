class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int dist = Math.abs(i - startIndex);
                dist = Math.min(dist, n - dist);
                minDistance = Math.min(minDistance, dist);
            }
        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
}