class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        if (row == 1 && col == 1)
            return obstacleGrid[0][0] == 0 ? 1 : 0;
        int[][] result = new int[row][col];
        result[0][0] = 1;
        for (int i = 1; i < col; i++) {
            if (obstacleGrid[0][i] == 0 && obstacleGrid[0][i - 1] != 1) {
                result[0][i] = result[0][i - 1];
            }
        }
        for (int i = 1; i < row; i++) {
            if (obstacleGrid[i][0] == 0 && obstacleGrid[i - 1][0] != 1) {
                result[i][0] = result[i - 1][0];
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] != 1) {
                    result[i][j] += result[i - 1][j] + result[i][j - 1];
                }
            }
        }
        return result[row - 1][col - 1];
    }
}