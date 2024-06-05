package leetcode.Interview150;

import java.util.Arrays;

public class Q88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        int[] nums3 = new int[m + n];

        while (cnt1 < m && cnt2 < n) {
            if (nums1[cnt1] < nums2[cnt2]) {
                nums3[cnt3++] = nums1[cnt1++];
            }
            else {
                nums3[cnt3++] = nums2[cnt2++];
            }
        }
        while (cnt1 < m) {
            nums3[cnt3++] = nums1[cnt1++];
        }
        while (cnt2 < n) {
            nums3[cnt3++] = nums2[cnt2++];
        }
        for (int i = 0; i < nums3.length; i++) {
            nums1[i] = nums3[i];
        }
    }
}
