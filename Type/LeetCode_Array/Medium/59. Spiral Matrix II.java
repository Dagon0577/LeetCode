class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int count = 1, j = 0;
        while (count <= n * n) {
            for (int i = j; i < n - j; ++i)
                result[j][i] = count++;
            for (int i = j + 1; i < n - j; ++i)
                result[i][n - j - 1] = count++;
            for (int i = n - j - 2; i >= j; --i)
                result[n - j - 1][i] = count++;
            for (int i = n - j - 2; i > j; --i)
                result[i][j] = count++;
            j++;
        }
        return result;
    }
}