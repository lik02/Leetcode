package leetcode.Interview150;

public class Q392IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int result = -1;
        for (int i = 0; i < s.length(); i++) {
            result = t.indexOf(s.charAt(i), result + 1);
            if (result == -1) {
                return false;
            }
        }
        return true;
    }
}
