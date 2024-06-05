package leetcode.Interview150;

public class Q151 {
    public String reverseWords(String s) {
        String result = "";
        String[] str = s.split(" ");// if "  " two space, it gives "","","", three empty strings
        for (int i = str.length - 1; i >= 0; i--) {
            if (!str[i].equals("")) {// avoid "" because it will concatenate space in result
                result += (result.equals("") ? str[i] : " " + str[i]);// for the first word, it will not write space, but the rest will
            }
        }
        return result;
    }
}
