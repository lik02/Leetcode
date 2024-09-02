package leetcode.Interview150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Q56MergeIntervals {
    public int[][] merge(int[][] intervals) {
        int[][] res = null;
        int index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));// sort arrays based on the first element
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i <= intervals.length; i++) {
            if (i != intervals.length) {
                if (intervals[i][0] <= end && intervals[i][0] >= start) {
                    end = Math.max(end, intervals[i][1]);
                }
                else {
                    list.add(start);
                    list.add(end);
                    start = intervals[i][0];
                    end = intervals[i][1];
                }
            }
            else {
                list.add(start);
                list.add(end);
            }
        }
        res = new int[list.size() / 2][2];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < 2; j++) {
                res[i][j] = list.get(index);
                index++;
            }
        }
        return res;
    }
}
