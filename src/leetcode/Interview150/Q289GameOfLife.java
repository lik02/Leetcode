package leetcode.Interview150;

public class Q289GameOfLife {
    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int cnt = count(i, j, board);
                if (board[i][j] == 1) {
                    if (cnt == 2 || cnt == 3) {
                        board[i][j] = 3;
                    }
                }
                else {
                    if (cnt == 3) {
                        board[i][j] = 2;
                    }
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 2 || board[i][j] == 3) {
                    board[i][j] = 1;
                }
                else {
                    board[i][j] = 0;
                }
            }
        }
    }

    public int count(int row, int col, int[][] board) {
        int cnt = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i < 0 || j < 0 || i >= board.length || j >= board[row].length || (i == row && j == col)) {
                    continue;
                }
                if (board[i][j] == 1 || board[i][j] == 3) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}

/*
 *   ori |  new  |  state 
 * ------|-------|--------
 *    0  |   0   |   0
 *    1  |   0   |   1
 *    0  |   1   |   2
 *    1  |   1   |   3
 */
