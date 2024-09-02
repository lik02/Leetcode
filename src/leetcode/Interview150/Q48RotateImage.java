package leetcode.Interview150;

import java.util.ArrayList;

public class Q48RotateImage {
    public void rotate(int[][] matrix) {
        int left = 0;
        int right = matrix.length - 1;
        while (left < right) {
            int top = left;
            int bottom = right;
            for (int i = 0; i < right - left; i++) {
                int hold = matrix[top][left + i];
                matrix[top][left + i] = matrix[bottom - i][left];
                matrix[bottom - i][left] = matrix[bottom][right - i];
                matrix[bottom][right - i] = matrix[top + i][right];
                matrix[top + i][right] = hold;
            }
            left++;
            right--;
        }
    }

    // public void rotate(int[][] matrix) {
    //     ArrayList<Integer> list = new ArrayList<>();
    //     int index = 0;
    //     for (int i = 0; i < matrix[0].length; i++) {
    //         for (int j = matrix.length - 1; j >= 0; j--) {
    //             list.add(matrix[j][i]);
    //         }
    //     }
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[i].length; j++) {
    //             matrix[i][j] = list.get(index);
    //             index++;
    //         }
    //     }
    // }
}
