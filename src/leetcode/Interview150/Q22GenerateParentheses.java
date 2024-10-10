package leetcode.Interview150;

import java.util.ArrayList;
import java.util.List;

public class Q22GenerateParentheses {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generate(n, 0, 0, "");
        return res;
    }

    public void generate(int n, int close, int open, String str) {
        if (n == close && n == open) {
            res.add(str);
            return;
        }

        if (close < n) {
            str += "(";
            generate(n, close + 1, open, str);
            str = str.substring(0, str.length() - 1);
        }

        if (open < close) {
            str += ")";
            generate(n, close, open + 1, str);
            str = str.substring(0, str.length() - 1);
        }
    }
}
