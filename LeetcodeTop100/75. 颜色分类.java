class Solution {
    public void sortColors(int[] nums) {
        // 荷兰三色解法,p0为0的最右边界,p2为2的最左边界
        int p0 = 0, p2 = nums.length - 1, curr = 0;
        int tmp = 0;
        while (curr <= p2) {
            if (nums[curr] == 2) {
                tmp = nums[curr];
                nums[curr] = nums[p2];
                nums[p2] = tmp;
                p2--;
            } else if (nums[curr] == 0) {
                tmp = nums[curr];
                nums[curr] = nums[p0];
                nums[p0] = tmp;
                p0++;
                curr++;
            }else{
                curr++;
            }
        }
    }
}