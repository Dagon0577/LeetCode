class Solution {
    public int findDuplicate(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i]);
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            } else {
                result = index;
                break;
            }
        }
        return result;
    }
}