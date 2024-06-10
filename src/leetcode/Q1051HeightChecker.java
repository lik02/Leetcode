package leetcode;

import java.util.Arrays;

public class Q1051HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
    public static int heightChecker(int[] heights) {
        int[] num = heights.clone();
        Arrays.sort(num);
        int result = 0;
        for (int i = 0; i < heights.length; i++) {
            if (num[i] != heights[i]) {
                result++;
            }
        }
        return result;
    }
}
