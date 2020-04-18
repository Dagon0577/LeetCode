class Solution {
    public int findMinFibonacciNumbers(int k) {
        int[] dp = new int[10000];
        dp[0] = 1;
        dp[1] = 1;
        int i = 2;
        for (; i < 10000; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            if (dp[i] >= k) {
                break;
            }
        }
        int t = 0;
        for (; i >= 0 && k != 0; i--) { 
            if (k - dp[i] >= 0) {
                k -= dp[i];
                t++;
            }
        }
        return t;
    }
}