class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n = nums.size();
        int pivot = -1;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                count++;
                pivot = i;
            }
        }

        if (count == 0) {
            return 0;
        }
        if (count > 1 || nums.get(n - 1) > nums.get(0)) {
            return -1;
        }

        return n - 1 - pivot;
    }
}