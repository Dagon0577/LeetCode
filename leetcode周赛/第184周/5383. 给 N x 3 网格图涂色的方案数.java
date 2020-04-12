class Solution {
    public int numOfWays(int n) {
        long[][] dp = new long[n + 1][2];
        dp[0][0] = 6;
        dp[0][1] = 6;
        for (int i = 1; i <= n; i++) {
            dp[i][0] = (2 * dp[i - 1][0] + 2 * dp[i - 1][1]) % (1000000007);
            dp[i][1] = (2 * dp[i - 1][0] + 3 * dp[i - 1][1]) % (1000000007);
        }
        return (int) (dp[n - 1][0] + dp[n - 1][1]) % (1000000007);
    }
}
/*
dp[i][0] 为abc情况下，下一行有四种情况即：[cab,bca]和[bab,bcb]
dp[i][1] 为aba情况下，下一行有五种情况即：[cab,bac]和[bab,bcb,cac]
*/