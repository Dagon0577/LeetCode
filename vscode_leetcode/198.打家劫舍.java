/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n + 1][2];
        for(int i = 0; i < n; i++) {
            dp[i+1][0] = dp[i][1];
            dp[i+1][1] = Math.max(dp[i][0] + nums[i],dp[i][1]);
        }
        return Math.max(dp[n][0],dp[n][1]);
    }
}
// @lc code=end

