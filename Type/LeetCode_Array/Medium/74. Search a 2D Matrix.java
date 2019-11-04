class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0)
            return false;
        int n = matrix[0].length;

        int left = 0, right = m * n - 1;
        int index, indexValue;
        while (left <= right) {
            index = (left + right) / 2;
            indexValue = matrix[index / n][index % n];
            if (indexValue == target) {
                return true;
            } else if (indexValue > target) {
                right = index - 1;
            } else {
                left = index + 1;
            }
        }
        return false;
    }
}