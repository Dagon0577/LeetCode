class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length;
        int[] result = new int[] { -1, -1 };
        while (left < right) {
            int index = (left + right) / 2;
            if (nums[index] < target) {
                left = index + 1;
            } else if (nums[index] > target) {
                right = index;
            } else {
                int l = index, r = index;
                while (l - 1 >= 0 && nums[l - 1] == target) {
                    l--;
                }
                while (r + 1 < nums.length && nums[r + 1] == target) {
                    r++;
                }
                if (l != r) {
                    result[0] = l;
                    result[1] = r;
                } else {
                    result[0] = l;
                    result[1] = l;
                }
                return result;
            }
        }
        return result;
    }
}