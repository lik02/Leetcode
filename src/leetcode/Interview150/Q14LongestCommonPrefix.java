package leetcode.Interview150;

public class Q14LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        String hold = strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < hold.length()) {
                hold = strs[i];
            }
        }
        for (int i = 0; i < hold.length(); i++) {
            result = hold.substring(0,i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != hold.charAt(i)) {
                    result = hold.substring(0, i);
                    return result;
                }
            }
        }
        return hold;
    }
}
