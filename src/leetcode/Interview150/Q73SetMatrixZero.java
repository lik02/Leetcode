package leetcode.Interview150;

import java.util.ArrayList;

public class Q73SetMatrixZero {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    if (!row.contains(i)) {
                        row.add(i);
                    }
                    if (!col.contains(j)) {
                        col.add(j);
                    }
                }
            }
        }
        for (int i = 0; i < row.size(); i++) {
            for (int j = 0; j < matrix[row.get(i)].length; j++) {
                matrix[row.get(i)][j] = 0;
            }
        }
        for (int i = 0; i < col.size(); i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][col.get(i)] = 0;
            }
        }
    }
}
