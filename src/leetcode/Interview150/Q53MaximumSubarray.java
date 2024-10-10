public class Q53MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-1, -2};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int hold = 0;
        for (int i = 0; i < nums.length; i++) {
            hold += nums[i];
            ans = Math.max(ans, hold);
            if (hold < 0) {
                hold = 0;
            }
        }
        return ans;
    }
}
