class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] weights = new int[1001];

        for (int[] item : items1) {
            weights[item[0]] += item[1];
        }

        for (int[] item : items2) {
            weights[item[0]] += item[1];
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int value = 1; value <= 1000; value++) {
            if (weights[value] > 0) {
                result.add(List.of(value, weights[value]));
            }
        }

        return result;
    }
}