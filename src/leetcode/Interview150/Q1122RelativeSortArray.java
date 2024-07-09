package leetcode.Interview150;

public class Q1122RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        relativeSortArray(arr1, arr2);
        for (int i: arr1) {
            System.out.print(i + " ");
        }
    }

    // public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            int freq = frequency(arr1, arr2[i]);
            for (int j = 0; j < freq; j++) {
                arr3[index++] = arr2[i];
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr3[i]) {

            }
        }
        return arr3;
    }

    public static int frequency(int[] arr, int k) {
        int freq = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                freq++;
            }
        }
        return freq;
    }
}
