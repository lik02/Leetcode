package leetcode.Interview150;

import java.util.HashMap;

public class Q290WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] str = s.split(" ");
        if (pattern.length() != str.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (map.containsValue(str[i])) {
                    return false;
                }
                map.put(pattern.charAt(i), str[i]);
            }
            else {
                if (!(map.get(pattern.charAt(i)).equals(str[i]))) {
                    return false;
                }
            }
        }
        return true;
    }
}
