package leetcode.Interview150;

import java.util.ArrayList;

public class Q56MergeIntervals {
    public static void main(String[] args) {
        int[][] nums = {{1,3},{2,6},{8,10},{15,18}};
        nums = merge(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] merge(int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();
        int[][] res = null;
        int index = 0;
        list.add(intervals[0][0]);
        list.add(intervals[0][1]);
        for (int i = 1; i < intervals.length; i++) {
            for (int j = 0; j < intervals[i].length; j++) {
                list.add(intervals[i][j]);
            }
            if (list.get(list.size() - 3) >= list.get(list.size() - 2) && list.get(list.size() - 3) <= list.get(list.size() - 1)) {
                list.remove(list.size() - 2);
                list.remove(list.size() - 2);
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
