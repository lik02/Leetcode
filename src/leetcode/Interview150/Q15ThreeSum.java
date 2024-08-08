package leetcode.Interview150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q15ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int  left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int threeSum = nums[i] + nums[left] + nums[right];
                if (threeSum > 0) {
                    right--;
                }
                else if (threeSum < 0) {
                    left++;
                }
                else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    left++;// [-2,-2,0,0,2,2] left or right also can, just update once, the rest above condition will update for you
                    while (left < right && nums[left] == nums[left - 1] ) {// the same left pointer will give same answer as previous
                        left++;
                    }
                }
            }
        }
        return res;
    }
}
