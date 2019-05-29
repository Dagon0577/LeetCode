class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null | nums.length == 0)
            return 0;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i], (nums[i] + nums[i - 1]));
            if (max < nums[i])
                max = nums[i];
        }
        return max;
    }
}