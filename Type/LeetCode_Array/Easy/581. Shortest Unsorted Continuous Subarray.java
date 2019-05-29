class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int last = -2, first = -1, max = nums[0], min = nums[n - 1];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n - i - 1]);
            if (nums[i] < max)
                last = i;
            if (nums[n - i - 1] > min)
                first = n - i - 1;
        }
        return last - first + 1;
    }
}
