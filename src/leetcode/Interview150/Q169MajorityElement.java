package leetcode.Interview150;

import java.util.Arrays;

public class Q169MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int cnt = 0;// count the number of occurance
        int max = 0;// store maximum number of occurance
        int result = 0;// store the element
        int hold = nums[0];// store the current element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == hold) {
                cnt++;
                if (cnt > max) {
                    max = cnt;
                    result = nums[i];
                }
            }
            else {
                hold = nums[i--];
                cnt = 0;
            }
        }
        return result;
    }
}
