package leetcode.Interview150;

import java.util.Arrays;

public class Q136SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int hold = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (hold == nums[i]) {
                hold = nums[i + 1];
                i++;
            }
            else {
                return hold;
            }
        }
        return hold;
    }
}
