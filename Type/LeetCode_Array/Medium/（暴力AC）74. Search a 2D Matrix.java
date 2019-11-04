class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return false;
        int i = 0, j = 0;
        for (; i < matrix.length; i++) {
            if (matrix[i][0] > target) {
                break;
            }
        }
        if (i <= matrix.length) {
            if (i > 0) {
                i--;
            }
            for (j = matrix[0].length - 1; j >= 0; j--) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}