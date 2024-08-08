package leetcode.Interview150;

import java.util.ArrayList;
import java.util.List;

public class Q54SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int x = 0;
        int y = 0;
        int xmin = 0;
        int xmax = matrix.length - 1;
        int ymin = 0;
        int ymax = matrix[0].length - 1;
        while (res.size() < matrix.length * matrix[0].length) {
            while (y <= ymax && res.size() < matrix.length * matrix[0].length) {
                res.add(matrix[x][y]);
                y++;
            }
            x++;
            y--;
            xmin++;
            while (x <= xmax && res.size() < matrix.length * matrix[0].length) {
                res.add(matrix[x][y]);
                x++;
            }
            x--;
            y--;
            ymax--;
            while (y >= ymin && res.size() < matrix.length * matrix[0].length) {
                res.add(matrix[x][y]);
                y--;
            }
            x--;
            y++;
            xmax--;
            while (x >= xmin && res.size() < matrix.length * matrix[0].length) {
                res.add(matrix[x][y]);
                x--;
            }
            x++;
            y++;
            ymin++;
        }
        return res;
    }
}
