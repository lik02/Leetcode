package leetcode.Interview150;

public class Q209MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            sum += nums[right];
            while (left < right && sum - nums[left] >= target) {
                sum -= nums[left];
                left++;
            }
            if (sum >= target) {
                res = Math.min(res, right - left + 1);
            }
            right++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}

// case [1,2,3,4] target = 6
// case [1,2,3,4,5] target = 15, cannot choose res in second while loop because total of element is exactly 15
