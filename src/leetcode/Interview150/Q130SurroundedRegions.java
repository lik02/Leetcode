package leetcode.Interview150;

import java.util.ArrayList;
import java.util.HashSet;

public class Q130SurroundedRegions {
    static HashSet<String> visited = new HashSet<>();
    static ArrayList<String> hold = new ArrayList<>();
    static boolean surrounded = true;

    public static void main(String[] args) {
        char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        solve(board);
    }

    public static void solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'O' && !visited.contains(String.valueOf(i) + "-" + String.valueOf(j))) {
                    dfs(board, i, j);
                    if (surrounded) {
                        modify(board);
                    }
                    hold.clear();
                    surrounded = true;
                }
            }
        }
    }

    public static void dfs(char[][] board, int i, int j) {
        if ((i == 0 || j == 0|| i == board.length - 1 || j == board[i].length - 1) && board[i][j] == 'O') {
            visited.add(String.valueOf(i) + "-" + String.valueOf(j));
            hold.add(String.valueOf(i) + "-" + String.valueOf(j));
            surrounded = false;
            return;
        }
        else if (board[i][j] == 'X' || i < 0 || j < 0|| i > board.length - 1 || j > board[i].length - 1 || visited.contains(String.valueOf(i) + "-" + String.valueOf(j))) {
            return;
        }
        visited.add(String.valueOf(i) + "-" + String.valueOf(j));
        hold.add(String.valueOf(i) + "-" + String.valueOf(j));
        dfs(board, i, j - 1);
        dfs(board, i + 1, j);
        dfs(board, i, j + 1);
        dfs(board, i - 1, j);
    }

    public static void modify(char[][] board) {
        for (int i = 0; i < hold.size(); i++) {
            int dash = hold.get(i).indexOf("-");
            String row = hold.get(i).substring(0, dash);
            String column = hold.get(i).substring(dash + 1);
            board[Integer.valueOf(row)][Integer.valueOf(column)] = 'X';
        }
    }
}
