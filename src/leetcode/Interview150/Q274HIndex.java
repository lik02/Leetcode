package leetcode.Interview150;

import java.util.Arrays;

public class Q274HIndex {
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        for (int i = citations.length; i >= 0; i--) {
            int h = 0;
            for (int j = citations.length - 1; j >= 0; j--) {
                if (citations[j] < i) {
                    break;
                }
                h++;
                if (h >= i) {
                    return i;
                }
            }
        }
        return 0;
    }
/*
 * h-index has at least h books has at least h citations where h is maximum
 * h is max, number of books and number of citations has directly related
 * we use number of books as the main factor because if [100], it also can works
 * below is the case with citatations as main factor (My idea is the h index will be the one of the citations but when [100], h is 1)
 */



    // public static int hIndex(int[] citations) {
    //     int[] nums = citations.clone();
    //     Arrays.sort(nums);
    //     for (int i = nums.length - 1; i >= 0; i--) {
    //         if (nums[i] <= nums.length) {
    //             if (nums.length - i >= nums[i]) {
    //                 return nums[i];
    //             }
    //         }
    //     }
    //     return 1;
    // }
}
