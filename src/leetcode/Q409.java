package leetcode;

import java.util.ArrayList;

public class Q409 {
    // idea: the odd palindrome has one different character in the middle, the rest is symmetrical
    //       the even palindrome is symmetrical
    public static int longestPalindrome(String s) {
        int result = 0;
        ArrayList<Character> visited = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {// run all characters
            char hold = s.charAt(i);
            if (visited.contains(hold)) {// skip same character
                continue;
            }
            visited.add(hold);
            int cnt = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == hold) {
                    cnt++;//count total
                }
            }
            if (cnt % 2 == 1) {//if odd, we drop 1 character
                result += (cnt - 1);
            }
            else {// if even, we take all characters
                result += cnt;
            }
        }
        if (result == s.length()) {// all characters have been taken
            return result;
        }
        else {// if not equal means that there are odd charaters left, we only take one of them.
            return result + 1;
        }
    }
}
