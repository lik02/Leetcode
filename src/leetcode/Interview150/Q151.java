package leetcode.Interview150;

public class Q151 {
    public String reverseWords(String s) {
        String result = "";
        String[] str = s.split(" ");
        for (int i = str.length - 1; i >= 0; i--) {
            if (!str[i].equals("")) {
                result += (result.equals("") ? str[i] : " " + str[i]);
            }
        }
        return result;
    }
}
