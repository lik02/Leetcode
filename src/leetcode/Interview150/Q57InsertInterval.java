package leetcode.Interview150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Q57InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int index = 0;
        int[][] res = new int[intervals.length + 1][2];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals[i].length; j++) {
                res[i][j] = intervals[i][j];
            }
        }
        res[intervals.length][0] = newInterval[0];
        res[intervals.length][1] = newInterval[1];
        Arrays.sort(res, Comparator.comparingInt(i -> i[0]));
        int start = res[0][0];
        int end = res[0][1];
        for (int i = 0; i <= res.length; i++) {
            if (i < res.length) {
                if (res[i][0] <= end) {
                    end = Math.max(end, res[i][1]);
                }
                else {
                    list.add(start);
                    list.add(end);
                    start = res[i][0];
                    end = res[i][1];
                }
            }
            else {
                list.add(start);
                list.add(end);
            }
        }
        res = new int[list.size() / 2][2];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = list.get(index);
                index++;
            }
        }
        return res;
    }
}
