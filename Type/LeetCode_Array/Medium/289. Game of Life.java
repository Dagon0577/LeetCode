class Solution {
    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                board[i][j] = getAlive(board, i, j);
            }
        }
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == -1) {
                    board[i][j] = 1;
                } else if (board[i][j] == -2) {
                    board[i][j] = 0;
                }
            }
        }
    }

    public int getAlive(int[][] board, int x, int y) {
        int alive = 0;
        int self = board[x][y];
        for (int i = x - 1; i < x + 2; ++i) {
            for (int j = y - 1; j < y + 2; ++j) {
                if (i == x && j == y) {
                    continue;
                }
                if (i < 0 || j < 0 || i > board.length - 1 || j > board[0].length - 1) {
                    continue;
                }
                if (board[i][j] != -1 && board[i][j] != 0) {
                    alive++;
                }
            }
        }
        if (self == 1) {
            if (alive < 2 || alive > 3) {
                // 1 -> 0
                return -2;
            } else {
                return 1;
            }
        } else {
            if (alive == 3) {
                // 0 -> 1
                return -1;
            } else {
                return 0;
            }
        }
    }
}