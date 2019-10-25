class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> col = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        int a = 0;
        int b = 0;
        for (int c = 0; c < col.size(); c++) {
            a = row.get(c);
            b = col.get(c);
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[a][j] = 0;
            }
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][b] = 0;
            }
        }
    }
}