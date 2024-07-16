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
        int hold = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                arr[i] = hold;
            }
            else {
                hold *= nums[i - 1];
                arr[i] = hold;
            }
        }
        hold = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                arr[i] *= hold;
            }
            else {
                hold *= nums[i + 1];
                arr[i] *= hold;
            }
        }
        return arr;
    }

    
}
