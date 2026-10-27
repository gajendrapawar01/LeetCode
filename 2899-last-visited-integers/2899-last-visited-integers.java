class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> seen = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int k = 0;

        for (int num : nums) {
            if (num == -1) {
                k++;
                int i = seen.size() - k;
                ans.add(i < 0 ? -1 : seen.get(i));
            } else {
                k = 0;
                seen.add(num);
            }
        }

        return ans;
    }
}