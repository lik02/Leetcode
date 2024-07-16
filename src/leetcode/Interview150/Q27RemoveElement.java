package leetcode.Interview150;

public class Q27RemoveElement {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            int foundIndex = i;
            int found = nums[i];
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] == val) {
                    foundIndex = j;
                    found = nums[j];
                    break;
                }
            }
            if (foundIndex != i) {
                nums[foundIndex] = nums[i];
                nums[i] = found;
            }
        }
        for (int i = 0; i < nums.length && nums[i] != val; i++) {
            result++;
        }
        return result;
    }
}
