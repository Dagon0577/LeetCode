class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = n + m;
                }
            }
        }
        // 只有 水平向左移动 和 竖直向上移动
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i - 1 >= 0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + 1);
                }
                if (j - 1 >= 0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + 1);
                }
            }
        }
        // 只有 水平向左移动 和 竖直向下移动
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (i + 1 < n) {
                    dp[i][j] = Math.min(dp[i][j], dp[i + 1][j] + 1);
                }
                if (j + 1 < m) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][j + 1] + 1);
                }
            }
        }
        return dp;
    }
}