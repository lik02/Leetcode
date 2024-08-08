package leetcode.Interview150;

import java.util.ArrayList;
import java.util.Collections;

public class Q3LongestSubstringWithoutRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {
        String str = "";
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (!str.contains(s.substring(i, i + 1))) {
                str += s.substring(i, i + 1);
            }
            else {
                list.add(str.length());
                int index = str.indexOf(s.substring(i, i + 1));
                str = str.substring(index + 1);
                str += s.substring(i, i + 1);
            }
        }
        list.add(str.length());
        Collections.sort(list);
        return list.get(list.size() - 1);
    }

    //wrong becase of line 40 incase abcabcbb
    // public int lengthOfLongestSubstring(String s) {
    //     int length = 0;
    //     ArrayList<Integer> list = new ArrayList<>();
    //     HashMap<String, Integer> map = new HashMap<>();
    //     list.add(0);
    //     for (int i = 0; i < s.length(); i++) {
    //         if (!map.containsKey(s.substring(i, i + 1))) {
    //             map.put(s.substring(i, i + 1), i);
    //             length++;
    //         }
    //         else {
    //             list.add(length);
    //             length = i - map.get(s.substring(i, i + 1));
    //             for (int j = map.get(s.substring(i, i + 1)); j >= 0; j--) {
    //                 map.remove(s.substring(j, j + 1));
    //             }
    //             map.put(s.substring(i, i + 1), i);
    //         }
    //     }
    //     list.add(length);
    //     Collections.sort(list);
    //     return list.get(list.size() - 1);
    // }
}

/*
 * cases:
 * abcabcbb
 * dvdf
 * asjrgapa
 * abba
 * wobgrovw
 */