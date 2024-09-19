package leetcode.Interview150;

import java.util.HashSet;

public class Q200NumberOfIslands {
    HashSet<String> visited = new HashSet<>();

    public int numIslands(char[][] grid) {
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1' && !visited.contains(String.valueOf(i) + "-" + String.valueOf(j))) {
                    islands++;
                    dfs(grid, i, j);
                }
            }
        }
        return islands;
    }

    public void dfs(char[][] grid, int row, int column) {
        if (row < 0 || row >= grid.length || column < 0 || column >= grid[row].length || grid[row][column] == '0' || visited.contains(String.valueOf(row) + "-" + String.valueOf(column))) {
            return;
        }
        else {
            visited.add(String.valueOf(row) + "-" + String.valueOf(column));
        }
        dfs(grid, row, column - 1);
        dfs(grid, row + 1, column);
        dfs(grid, row, column + 1);
        dfs(grid, row - 1, column);
    }
}
