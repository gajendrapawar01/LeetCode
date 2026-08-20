class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        HashMap<Integer, Integer> map = new HashMap<>();
        String[] arr = new String[names.length];
        int index = names.length-1;

        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i], i);
        }
        Arrays.sort(heights);
        for (int i = 0; i < heights.length; i++) {
            arr[index-i] = names[map.get(heights[i])];
        }

        return arr;
    }
}