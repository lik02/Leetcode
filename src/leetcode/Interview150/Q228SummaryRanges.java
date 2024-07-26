package leetcode.Interview150;

import java.util.ArrayList;
import java.util.List;

public class Q228SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        if (nums.length == 0) {
            return list;
        }
        int start = nums[0];
        for (int i = 1; i <= nums.length; i++) {
            if (i < nums.length && nums[i] == nums[i - 1] + 1) {
                continue;
            }
            if (start == nums[i - 1]) {
                list.add(String.valueOf(start));
            }
            else {
                list.add(start + "->" + nums[i - 1]);
            }
            if (i < nums.length) {
                start = nums[i];
            }
        }
        return list;
    }
}
