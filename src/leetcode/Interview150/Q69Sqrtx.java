package leetcode.Interview150;

public class Q69Sqrtx {
    public int mySqrt(int x) {
        long low = 0;
        long high = x;
        long middle;
        long res = 0;
        while (low <= high) {
            middle = low + (high - low) / 2;
            if (middle * middle > x) {
                high = middle - 1;
            }
            else if (middle * middle < x) {
                low = middle + 1;
                res = middle;
            }
            else {
                return (int)middle;
            }
        }
        return (int)res;
    }
}
/*
 * use binary search concept
 * we use long because of x = 2147395599
 * in second loop middle will become out of range (overflow) because int is not enough to use (max of int is 2 ^ 31 - 1)
 */
