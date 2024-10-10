package leetcode.Interview150;

import java.util.HashSet;

public class Q79WordSearch {
    HashSet<String> visited = new HashSet<>();

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (search(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean search(char[][] board, String word, int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }
        if (visited.contains(i + "-" + j) || i < 0 || i > board.length - 1 || j < 0 || j > board[i].length - 1 || board[i][j] != word.charAt(index)) {
            return false;
        }
        visited.add(i + "-" + j);
        if (search(board, word, i + 1, j, index + 1) || search(board, word, i, j + 1, index + 1) || search(board, word, i - 1, j, index + 1) || search(board, word, i, j - 1, index + 1)) {
            return true;
        }
        visited.remove(i + "-" + j);
        return false;
    }
}
