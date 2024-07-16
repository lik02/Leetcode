package leetcode.Interview150;

import java.util.HashMap;

public class Q205IsomorphicThings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                if (map.containsValue(t.charAt(i))) {// only one-to-one mapping
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
            }
            else {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}

/*
 * 3 cases
 * -if the map does not have the key then we add
 * -but if the value is already added then we return false because "No two characters may map to the same character, but a character may map to itself."
 * means one-to-one mapping only
 * -if the key is already added then we examine the value with the t.charAt(i)
 */
