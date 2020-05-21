/*
 * @lc app=leetcode.cn id=238 lang=java
 *
 * [238] 除自身以外数组的乘积
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new int[1];
        }
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        res[n - 1] = 1;
        for(int i = n - 2; i >= 0; --i) {
            res[i] = res[i + 1] * nums[i + 1]; 
        }
        int tmp = 1;
        for(int i = 1; i < n; ++i) {
            tmp *= nums[i - 1];
            res[i] *= tmp;
        }
        return res;
    }
}
// @lc code=end

