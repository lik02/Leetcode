package leetcode;

import java.util.List;

public class Q648ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] str = sentence.split(" ");
        String result = "";
        for (String i: dictionary) {
            for (int j = 0; j < str.length; j++) {
                if (str[j].startsWith(i)) {
                    str[j] = i;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            result += (i != 0 ? " " + str[i] : str[i]);
        }
        return result;
    }
}
