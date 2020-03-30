class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left) / 2;
        int key = -1;
        int[] result = new int[] { -1, -1 };
        while (left <= right) {
            if (nums[mid] == target) {
                int l = mid, r = mid;
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
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
            mid = left + (right - left) / 2;
        }
        return result;
    }
}