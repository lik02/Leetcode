package leetcode.Interview150;

import java.util.Arrays;

public class Q80RemoveDuplicatesfromSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        int hold = nums[0];
        int cnt = 0;
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == hold) {
                cnt++;
                if (cnt >= 3) {
                    nums[i] = 999999;
                    result--;
                }
            }
            else {
                hold = nums[i];
                cnt = 1;
            }
        }
        Arrays.sort(nums);
        return result;
    }
}
