public class Q918MaximumSumCircularSubarray {
    public static void main(String[] args) {
        int[] nums = {-5,-2,5,6,-2,-7,0,2,8};
        // int[] nums = {5,-3,5};
        System.out.println(maxSubarraySumCircular(nums));
    }

    public static int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;  // Sum of all elements in the array
        int maxSum = Integer.MIN_VALUE;  // Max sum for non-circular subarray
        int minSum = Integer.MAX_VALUE;  // Min sum for subarray (used for circular case)
        int currentMax = 0;  // Current sum for Kadane's max subarray
        int currentMin = 0;  // Current sum for Kadane's min subarray

        for (int num : nums) {
            totalSum += num;

            // Kadane's algorithm for maximum subarray sum
            currentMax = Math.max(currentMax + num, num);
            maxSum = Math.max(maxSum, currentMax);

            // Kadane's algorithm for minimum subarray sum
            currentMin = Math.min(currentMin + num, num);
            minSum = Math.min(minSum, currentMin);
        }

        // Case where all elements are negative, so maxSum is the best non-circular result
        if (maxSum < 0) {
            return maxSum;
        }

        // Maximum of non-circular sum or circular sum
        return Math.max(maxSum, totalSum - minSum);
    }
}