package leetcode;

class Q523ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {// correct but exceed time limit
        int  result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                result += nums[j];
                if (result < k && result != 0) {
                    continue;
                }
                if (result % k == 0 || result == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}

// class Solution {// no exceed time limit
//     public boolean checkSubarraySum(int[] nums, int k) {
//         Map<Integer, Integer> remainderIndexMap = new HashMap<>();
//         remainderIndexMap.put(0, -1); // To handle the case where the subarray starts from index 0
//         int sum = 0;

//         for (int i = 0; i < nums.length; i++) {
//             sum += nums[i];
//             int remainder = sum % k;

//             if (remainderIndexMap.containsKey(remainder)) {
//                 if (i - remainderIndexMap.get(remainder) > 1) {
//                     return true;
//                 }
//             } else {
//                 remainderIndexMap.put(remainder, i);
//             }
//         }

//         return false;
//     }
// }