package leetcode.Interview150;

import java.util.Arrays;

public class Q169MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int cnt = 0;
        int max = 0;
        int result = 0;
        int hold = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != hold) {
                hold = nums[i--];
                cnt = 0;
            }
            else {
                cnt++;
                if (cnt > max) {
                    max = cnt;
                    result = nums[i];
                }
            }
        }
        return result;
    }
}
