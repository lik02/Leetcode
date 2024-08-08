package leetcode.Interview150;

import java.util.HashSet;

public class Q36ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (!set.add(c + "row" + i) || !set.add(c + "col" + j) || !set.add(c + "sub-box" + i/ 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
