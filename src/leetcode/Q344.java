package leetcode;

import java.util.Scanner;

public class Q344 {
    public void reverseString(char[] s) {
        char[] c = s.clone();
        for (int i = c.length - 1; i >= 0; i--) {
            s[s.length - 1 - i] = c[i];
        }
    }
}
