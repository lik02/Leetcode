package leetcode.Interview150;

public class Q66PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] += 1;
            return digits;
        }
        int i = digits.length - 1;
        for (; i >= 0 && digits[i] == 9; i--) {
            digits[i] = 0;
        }
        if (i < 0) {
            int[] nums = new int[digits.length + 1];
            nums[0] = 1;
            System.arraycopy(digits, 0, nums, 1, digits.length);
            return nums;
        }
        else {
            digits[i] += 1;
            return digits;
        }
    }
}
/*
 * base case: 123 -> 124
 * edge case: 999 -> 1000 && 299 -> 300
 */
