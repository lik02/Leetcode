package leetcode.Interview150;

public class Q11ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,100,2,100,4,8,3,7};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] height) {
        int res = 0;
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        while(left < right) {
            area = (right - left) * Math.min(height[left], height[right]);
            res = Math.max(res, area);
            if (height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return res;
    }
}
