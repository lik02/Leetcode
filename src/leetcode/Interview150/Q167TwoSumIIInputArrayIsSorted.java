package leetcode.Interview150;

import java.util.HashMap;

public class Q167TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {// use two pointer concept
        int[] res = new int[2];
        int left = 0; 
        int right = numbers.length - 1;
        while (true) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            }
            else if (numbers[left] + numbers[right] < target) {
                left++;
            }
            else {
                break;
            }
        }
        res[0] = left + 1;
        res[1] = right + 1;
        return res;
    }

    // use two sum 1 concept
    // public int[] twoSum(int[] numbers, int target) {
    //     int[] res = new int[2];
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     for (int i = 0; i < numbers.length; i++) {
    //         if (map.containsKey(target - numbers[i])) {
    //             res[0] = map.get(target - numbers[i]) + 1;
    //             res[1] = i + 1;
    //             return res;
    //         }
    //         map.put(numbers[i], i);
    //     }
    //     return res;
    // }
}
