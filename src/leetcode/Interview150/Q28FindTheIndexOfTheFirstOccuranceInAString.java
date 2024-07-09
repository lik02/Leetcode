package leetcode.Interview150;

public class Q28FindTheIndexOfTheFirstOccuranceInAString {
    public static void main(String[] args) {
        System.out.println(strStr("a", "a"));
    }

    public static int strStr(String haystack, String needle) {
        int length = needle.length();
        int found = -1;
        if (haystack.contains(needle)) {
            found = 0;
            while (found != -1) {
                if (haystack.substring(found, found + length).equals(needle)) {
                    return found;
                }
                found = haystack.indexOf(needle.charAt(0), found + 1);
            }
        }
        return found;
    }
}
