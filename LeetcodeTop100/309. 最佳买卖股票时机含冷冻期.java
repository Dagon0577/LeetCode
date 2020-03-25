class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp_i_0 = 0, dp_i_1 = Integer.MIN_VALUE;
        int dp_i2_0 = 0;// 代表dp[i-2][0]
        for (int i = 0; i < n; i++) {
            int tmp = dp_i_0;
            // 卖出
            dp_i_0 = Math.max(dp_i_0, dp_i_1 + prices[i]);
            // 买入
            dp_i_1 = Math.max(dp_i_1, dp_i2_0 - prices[i]);
            dp_i2_0 = tmp;
        }
        return dp_i_0;
    }
}