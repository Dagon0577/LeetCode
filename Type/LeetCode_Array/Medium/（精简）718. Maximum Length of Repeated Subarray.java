class Solution {
    public int findLength(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int dp[] = new int[n + 1];
        int res = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = n; j >= 1; j--) {
                if (A[i - 1] == B[j - 1]) {
                    dp[j] = dp[j - 1] + 1;
                    res = Math.max(res, dp[j]);
                } else {
                    dp[j] = 0;
                }

            }
        }
        return res;
    }
}