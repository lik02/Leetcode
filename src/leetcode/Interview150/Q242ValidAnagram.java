package leetcode.Interview150;

import java.util.ArrayList;
import java.util.Arrays;

public class Q242ValidAnagram {
    // public boolean isAnagram(String s, String t) {
    //     if (s.length() != t.length()) {
    //         return false;
    //     }
    //     ArrayList<String> list = new ArrayList<>();
    //     for (int i = 0; i < s.length(); i++) {
    //         list.add(s.substring(i, i + 1));
    //     }
    //     for (int i = 0; i < t.length(); i++) {
    //         list.remove(t.substring(i, i + 1));
    //     }
    //     return list.isEmpty();
    // }

    public boolean isAnagram(String s, String t) {// better solution
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
    }
}
