package leetcode;

import java.util.ArrayList;

public class Q350IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> nums = new ArrayList<>();
        int[] result = null;
        int[] hold = nums1.length < nums2.length ? nums1.clone() : nums2.clone();
        ArrayList<Integer> visited = new ArrayList<>();
        for (int i = 0; i < hold.length; i++) {
            if (!visited.contains(hold[i])) {
                visited.add(hold[i]);
                int freq = Math.min(frequency(nums1, hold[i]), frequency(nums2, hold[i]));
                for (int j = 0; j < freq; j++) {
                    nums.add(hold[i]);
                }
            }
        }
        result = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            result[i] = nums.get(i);
        }
        return result;
    }

    public int frequency(int[] nums, int num) {
        int freq = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                freq++;
            }
        }
        return freq;
    }
}
