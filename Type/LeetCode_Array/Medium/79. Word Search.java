class Solution {
    public boolean exist(char[][] board, String word) {
        char[] wordChar = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == wordChar[0]) {
                    char c = board[i][j];
                    board[i][j] = '#';
                    if (dfs(board, i, j, wordChar, 1)) {
                        return true;
                    }
                    board[i][j] = c;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, int i, int j, char[] wordChar, int index) {
        if (index < wordChar.length) {
            char c = '#';
            if (j + 1 < board[0].length && board[i][j + 1] != '#' && board[i][j + 1] == wordChar[index]) {
                c = board[i][j + 1];
                board[i][j + 1] = '#';
                if (dfs(board, i, j + 1, wordChar, index + 1)) {
                    return true;
                }
                board[i][j + 1] = c;
            }

            if (j - 1 >= 0 && board[i][j - 1] != '#' && board[i][j - 1] == wordChar[index]) {
                c = board[i][j - 1];
                board[i][j - 1] = '#';
                if (dfs(board, i, j - 1, wordChar, index + 1)) {
                    return true;
                }
                board[i][j - 1] = c;
            }

            if (i + 1 < board.length && board[i + 1][j] != '#' && board[i + 1][j] == wordChar[index]) {
                c = board[i + 1][j];
                board[i + 1][j] = '#';
                if (dfs(board, i + 1, j, wordChar, index + 1)) {
                    return true;
                }
                board[i + 1][j] = c;
            }

            if (i - 1 >= 0 && board[i - 1][j] != '#' && board[i - 1][j] == wordChar[index]) {
                c = board[i - 1][j];
                board[i - 1][j] = '#';
                if (dfs(board, i - 1, j, wordChar, index + 1)) {
                    return true;
                }
                board[i - 1][j] = c;
            }
            return false;
        } else {
            return true;
        }
    }
}