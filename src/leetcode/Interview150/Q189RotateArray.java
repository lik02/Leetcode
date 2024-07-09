package leetcode.Interview150;

import java.util.ArrayList;

public class Q189RotateArray {
    public static void rotate(int[] nums, int k) {
        ArrayList<Integer> number = new ArrayList<>();
        while (k > nums.length) {
            k -= nums.length;
        }
        for (int i = nums.length - k; i <= nums.length - 1; i++) {
            number.add(nums[i]);
        }
        for (int i = 0; i < nums.length - k; i++) {
            number.add(nums[i]);
        }
        for (int i = 0; i < number.size(); i++) {
            nums[i] = number.get(i);
        }
    }
}
/*
 * like [1,7]  k=5
 * first loop will throw exception
 * 
 * until 4th iteration, it remains the same
 * so iterate one time is enough
 * use while loop with k > nums.length
 * k minus nums.length until smaller than nums.length
 */
