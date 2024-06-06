package leetcode.Interview150;

import java.util.ArrayList;

public class Q26 {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        ArrayList<Integer> visited = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!visited.contains(nums[i])) {
                visited.add(nums[i]);
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
