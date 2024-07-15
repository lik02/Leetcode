package leetcode.Interview150;

public class Q55JumpGame {
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int targetIndex = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (targetIndex <= i + nums[i]) {
                targetIndex = i;
            }
        }
        return targetIndex == 0;
    }
}
