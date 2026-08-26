/*class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end = target.length-1;

        while(start<end){
            int mid = (start+end)/2;
            if(target<nums[mid]){
                end=mid;
            }
            else if(target>nums[mid]){
                start=mid;
            }
            else{
                while(nums[]){

                }
            }
        }
    }
}*/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        result[0] = findBound(nums, target, true);
        if (result[0] == -1) {
            return result;
        }
        result[1] = findBound(nums, target, false);
        return result;
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0, right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;
                if (isFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }
}