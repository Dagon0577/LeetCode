import java.util.*;

class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (r * c > nums.length * nums[0].length)
            return nums;
        int[][] result = new int[r][c];
        int row = 0, col = 0;
        for (int i = 0; i < nums.length; i++)
            for (int j = 0; j < nums[0].length; j++) {
                result[row][col] = nums[i][j];
                col++;
                if (col == c) {
                    row++;
                    col = 0;
                }

            }

        return result;
    }
}