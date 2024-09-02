package leetcode.Interview150;

import java.util.Arrays;
import java.util.Comparator;

public class Q452MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(i -> i[0]));
        int res = 0;
        int end = points[0][1];
        for (int i = 1; i <= points.length; i++) {
            if (i < points.length) {
                end = Math.min(end, points[i][1]);
                if (points[i][0] > end) {
                    res++;
                    end = points[i][1];
                }
            }
            else {
                res++;
            }
        }
        return res;
    }
}
// best test case: {{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}} 