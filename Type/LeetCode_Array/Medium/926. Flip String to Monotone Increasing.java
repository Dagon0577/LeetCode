class Solution {
    public int minFlipsMonoIncr(String S) {
        int N = S.length();
        int[] dp = new int[N + 1];
        for (int i = 0; i < N; ++i) {
            dp[i + 1] = dp[i] + (S.charAt(i) == '1' ? 1 : 0);
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i <= N; ++i) {
            // dp[i] 表示前面多少1，N-i-(dp[N]-dp[i]) 后面几个0
            result = Math.min(result, dp[i] + N - i - (dp[N] - dp[i]));
        }
        return result;
    }
}