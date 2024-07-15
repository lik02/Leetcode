package leetcode.Interview150;

public class Q45JumpGameII {
    public static int jump(int[] nums) {
        int near = 0;
        int far = 0;
        int jump = 0;
        while (far < nums.length - 1) {
            int furthest = 0;
            for (int i = near; i <= far; i++) {
                furthest = Math.max(furthest, i + nums[i]);
            }
            near = far + 1;
            far = furthest;
            jump++;
        }
        return jump;
    }
}
