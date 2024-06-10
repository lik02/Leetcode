package leetcode.Interview150;

import java.util.Arrays;
///////////////////////////////////////////haven't accepted!!!!!!!!!!!!!!!!!!
public class Q189RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int hold = nums[nums.length - 1];
            int l;
            for (l = nums.length - 2; l >= 0; l--) {
                nums[l + 1] = nums[l];
            }
            nums[l + 1] = hold;
        }
    }
}
