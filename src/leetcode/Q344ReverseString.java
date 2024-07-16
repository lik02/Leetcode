package leetcode;

public class Q344ReverseString {
    public void reverseString(char[] s) {
        char[] c = s.clone();
        for (int i = c.length - 1; i >= 0; i--) {
            s[s.length - 1 - i] = c[i];
        }
    }
}
