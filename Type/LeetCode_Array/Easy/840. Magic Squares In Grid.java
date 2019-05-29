class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int result = 0;
        for (int i = 0; i <= grid.length - 3; i++)
            for (int j = 0; j <= grid[0].length - 3; j++)
                if (isMagic(grid, i, j) == true)
                    result++;

        return result;
    }

    private boolean isMagic(int[][] grid, int i, int j) {
        for (int a = 0; a < 3; a++)
            for (int b = 0; b < 3; b++)
                if (grid[i + a][j + b] > 9 || grid[i + a][j + b] < 1)
                    return false;
        int sum = grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2];
        if (sum != grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j])
            return false;
        for (int a = 0; a < 3; a++)
            if (sum != grid[i + a][j] + grid[i + a][j + 1] + grid[i + a][j + 2])
                return false;
        for (int b = 0; b < 3; b++)
            if (sum != grid[i][j + b] + grid[i + 1][j + b] + grid[i + 2][j + b])
                return false;
        return true;
    }
}