class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>(nums.length);
        int currentRemainder = 0;
        
        for (int bit : nums) {
            currentRemainder = ((currentRemainder << 1) + bit) % 5;
            result.add(currentRemainder == 0);
        }
        
        return result;
    }
}