class Solution {
    public int findMin(int[] nums) {
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int m = (l + h) / 2;
            if (nums[m] >= nums[0]) {
                l = m + 1;
            } else {
                h = m;
            }
        }
        return nums[h] > nums[0] ? nums[0] : nums[h];
    }
}