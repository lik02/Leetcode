package leetcode.Interview150;

public class Q55JumpGame {
    public boolean canJump(int[] nums) {
        int targetIndex = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (targetIndex <= i + nums[i]) {
                targetIndex = i;
            }
        }
        return targetIndex == 0;
    }
}
