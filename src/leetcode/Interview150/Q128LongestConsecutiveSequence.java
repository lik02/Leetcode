package leetcode.Interview150;

import java.util.Arrays;

public class Q128LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0) {
            return 0;
        }
        int hold = nums[0];
        int length = 1;
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == hold) {// case [1,2,0,1]
                continue;
            }
            if (nums[i] - 1 == hold) {
                length++;
                res = Math.max(res, length);
            }
            else {
                length = 1;
            }
            hold = nums[i];
        }
        return res;
    }
}
