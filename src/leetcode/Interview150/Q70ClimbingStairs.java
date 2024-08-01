package leetcode.Interview150;

public class Q70ClimbingStairs {
    // just draw decision tree and you will see the pattern, oneStep is the sum of n - 1 stairs, twoStep is the sum of n - 1 stairs's twoSteps and n - 2 stairs's twoSteps
    public int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int oneStep = 1;
        int twoStep = 1;
        int prev = 1;
        int hold = 0;
        for (int i = 3; i <= n; i++) {
            if (i == 3) {
                oneStep += twoStep;
            }
            else {
                oneStep += twoStep;
                hold = twoStep;
                twoStep += prev;
                prev = hold;
            }
        }
        return oneStep + twoStep;
    }

    // correct but too slow when n = 44
    // public static int climbStairs(int n) {
    //     if (n < 0) {
    //         return 0;
    //     }
    //     if (n == 0) {
    //         return 1;
    //     }
    //     int ways = 0;
    //     int res = 0;
    //     ways = climbStairs(n - 1);
    //     res = climbStairs(n - 2);
    //     ways += res;
    //     return ways;
    // }
}
