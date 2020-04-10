class Solution {
    int[][] map;

    public boolean exist(char[][] board, String word) {
        map = new int[board.length][board[0].length];
        char[] wordChar = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == wordChar[0]) {
                    map[i][j] = 1;
                    if (dfs(board, i, j, wordChar, 1)) {
                        return true;
                    }
                    map[i][j] = 0;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int i, int j, char[] wordChar, int index) {
        if (index < wordChar.length) {
            if (i + 1 < board.length && map[i + 1][j] == 0 && board[i + 1][j] == wordChar[index]) {
                map[i + 1][j] = 1;
                if (dfs(board, i + 1, j, wordChar, index + 1)) {
                    return true;
                } else {
                    map[i + 1][j] = 0;
                }
            }
            if (i - 1 >= 0 && map[i - 1][j] == 0 && board[i - 1][j] == wordChar[index]) {
                map[i - 1][j] = 1;
                if (dfs(board, i - 1, j, wordChar, index + 1)) {
                    return true;
                } else {
                    map[i - 1][j] = 0;
                }
            }
            if (j + 1 < board[0].length && map[i][j + 1] == 0 && board[i][j + 1] == wordChar[index]) {
                map[i][j + 1] = 1;
                if (dfs(board, i, j + 1, wordChar, index + 1)) {
                    return true;
                } else {
                    map[i][j + 1] = 0;
                }
            }
            if (j - 1 >= 0 && map[i][j - 1] == 0 && board[i][j - 1] == wordChar[index]) {
                map[i][j - 1] = 1;
                if (dfs(board, i, j - 1, wordChar, index + 1)) {
                    return true;
                } else {
                    map[i][j - 1] = 0;
                }
            }
            return false;
        } else {
            return true;
        }
    }
}