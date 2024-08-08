package leetcode.Interview150;

import java.util.ArrayList;

public class Q48RotateImage {
    public void rotate(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                list.add(matrix[j][i]);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = list.get(index);
                index++;
            }
        }
    }
}
