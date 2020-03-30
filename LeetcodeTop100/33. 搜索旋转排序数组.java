class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left) / 2;

        while (left <= right) {
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {// 左边升序
                if (nums[left] <= target && target < nums[mid]) {// 在左边
                    right = mid - 1;
                } else {// 在右边
                    left = mid + 1;
                }
            } else {// 右边升序
                if (nums[right] >= target && target > nums[mid]) {// 在右边
                    left = mid + 1;
                } else {// 在左边
                    right = mid - 1;
                }
            }
            mid = left + (right - left) / 2;
        }

        return -1;
    }
}