class Solution {
    public int numberOfArrays(String s, int k) {
        int N = s.length();
        int MOD = 1000000007;
        long[] dp = new long[N + 1];
        dp[0] = 1;
        int len = (k + "").length();
        for (int i = 1; i <= N; i++) {
            for (int j = Math.max(0, i - len); j < i; j++) {
                if (s.charAt(j) != '0' && Long.valueOf(s.substring(j, i)) <= k) {
                    dp[i] = (dp[i] + dp[j]) % MOD;
                }
            }
        }
        return (int) dp[N];
    }
}