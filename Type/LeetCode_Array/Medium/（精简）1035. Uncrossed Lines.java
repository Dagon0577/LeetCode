class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int m = A.length, n = B.length;
        int[] dp = new int[n + 1];
        for (int i = 1; i <= m; i++) {
            int pre = 0;
            for (int j = 1; j <= n; j++) {
                int temp = dp[j];
                if (A[i - 1] == B[j - 1]) {
                    dp[j] = pre + 1;
                } else {
                    dp[j] = Math.max(dp[j], dp[j - 1]);
                }
                pre = temp;
            }
        }

        return dp[n];

    }
}