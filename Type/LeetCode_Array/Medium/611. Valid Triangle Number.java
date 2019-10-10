class Solution {
    public int triangleNumber(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int result = 0;
        for (int i = len - 1; i >= 2; i--) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (nums[l] + nums[r] > nums[i]) {
                    result += r - l;
                    r--;
                } else {
                    l++;
                }
            }
        }
        return result;
    }
}