package leetcode;

import java.util.Arrays;

public class Q1509MinimumDifferenceBetweenLargestAndSmallestValuesInThreeMoves {
    public static void main(String[] args) {
        int[] nums = {6,6,0,1,1,4,6};
        System.out.println(minDifference(nums));
    }

    public static int minDifference(int[] nums) {
        // if (nums.length <= 4) {
        //     return 0;
        // }
        // else {
        //     Arrays.sort(nums);
        //     int hold = find(nums);
        //     return Math.min(nums[nums.length - 4] - nums[0], hold);
        // }
    }

    public static int find(int[] nums) {
        int diff = 100;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] < diff) {
                diff = nums[i + 1] - nums[i];
            }
        }
        return diff;
    }

}
