package leetcode.Interview150;

import java.util.ArrayList;

public class Q202HappyNumber {
    public boolean isHappy(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n != 1) {
            while (n != 0) {
                list.add(n % 10);
                n /= 10;
            }
            if (list.size() == 1 && list.get(0) != 7) {
                break;
            }
            for (int i = 0; i < list.size(); i++) {
                n += Math.pow(list.get(i), 2);
            }
            list.clear();
        }
        return n == 1;
    }
}
/*
 * edge case: every number is possible to become a happy number
 * except single digit and it is not 7
 * 7 can become a happy number
 */
