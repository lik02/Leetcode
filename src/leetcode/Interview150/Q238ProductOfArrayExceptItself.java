package leetcode.Interview150;

public class Q238ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] arr = productExceptSelf(nums);
        for (int i: arr) {
            System.out.println(i);
        }
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr = nums.clone();
            arr[i] = 1;
            result[i] = calculate(arr, arr.length - 1);
        }
        return result;
    }

    public static int calculate(int[] nums, int index) {
        if (index < 0) {
            return 1;
        }
        return nums[index] * calculate(nums, index - 1);
    }
}
