class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        // 层数
        int count = (Math.min(m, n) + 1) / 2;
        while (i < count) {
            // 从左往右
            for (int j = i; j < n - i; j++) {
                result.add(matrix[i][j]);
            }
            // 从右往下
            for (int j = i + 1; j < m - i; j++) {
                result.add(matrix[j][n - i - 1]);
            }
            // 从右往左
            for (int j = (n - 1) - (i + 1); j >= i && (m - i - 1) != i; j--) {
                result.add(matrix[m - i - 1][j]);
            }
            // 从右往上
            for (int j = (m - 1) - (i + 1); j >= i + 1 && (n - i - 1) != i; j--) {
                result.add(matrix[j][i]);
            }
            i++;
        }
        return result;
    }
}