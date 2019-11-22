//桶排序
// 1.特判，若nums为空，则返回1

// 2.遍历数组，进入循环，循环条件：对于索引i处的nums[i],是否满足在索引范围[0,n],且nums[i]!=nums[nums[i]-1]，表示若索引处已经存放一个正确元素，则退出循环。

// 交换nums[nums[i]-1]和nums[i]

// 遍历数组，找到第一个nums[i]!=i+1，返回i+1，若遍历结束不返回，则返回n+1(即i+1,此时i=n)。
class Solution {
    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }
        int len = nums.length;
        for (int i = 0; i < len; ++i) {
            while (nums[i] > 0 && nums[i] <= len && nums[i] != nums[nums[i] - 1]) {
                int j = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int i = 0;
        for (; i < len; i++) {
            if (nums[i] != i + 1) {
                break;
            }
        }
        return i + 1;
    }
}