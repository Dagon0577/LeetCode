class Solution {
    public int uniquePaths(int m, int n) {
        int[][] result = new int[n + 1][m + 1];
        for (int i = n; i > 0; i--) {
            for (int j = m; j > 0; j--) {
                if (i == n || j == m) {
                    result[i][j] = 1;
                } else {
                    result[i][j] = result[i][j + 1] + result[i + 1][j];
                }
            }
        }
        return result[1][1];
    }
}