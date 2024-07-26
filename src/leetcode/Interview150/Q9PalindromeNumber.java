package leetcode.Interview150;

public class Q9PalindromeNumber {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
