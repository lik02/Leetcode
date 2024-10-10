package leetcode.Interview150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q17LetterCombinationsOfAPhoneNumber {
    HashMap<String, ArrayList<String>> map = new HashMap<>();
    List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return res;
        }
        for (int i = 2; i <= 9; i++) {
            map.put(String.valueOf(i), new ArrayList<>());
        }
        map.get("2").add("a");
        map.get("2").add("b");
        map.get("2").add("c");
        map.get("3").add("d");
        map.get("3").add("e");
        map.get("3").add("f");
        map.get("4").add("g");
        map.get("4").add("h");
        map.get("4").add("i");
        map.get("5").add("j");
        map.get("5").add("k");
        map.get("5").add("l");
        map.get("6").add("m");
        map.get("6").add("n");
        map.get("6").add("o");
        map.get("7").add("p");
        map.get("7").add("q");
        map.get("7").add("r");
        map.get("7").add("s");
        map.get("8").add("t");
        map.get("8").add("u");
        map.get("8").add("v");
        map.get("9").add("w");
        map.get("9").add("x");
        map.get("9").add("y");
        map.get("9").add("z");
        compute(digits, "");
        return res;
    }

    public void compute(String digits, String ans) {
        if (digits.length() == 0) {
            res.add(ans);
            return;
        }
        for (int i = 0; i < map.get(digits.substring(0, 1)).size(); i++) {
            ans += map.get(digits.substring(0, 1)).get(i);
            compute(digits.substring(1), ans);
            ans = ans.substring(0, ans.length() - 1);
        }
    }
}
