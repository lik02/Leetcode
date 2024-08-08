package leetcode.Interview150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q49GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();// 1. key can map to multiple element as one value 2. element dont have to find the list with for loop
        for (int i = 0; i < strs.length; i++) {
            char[] cha = strs[i].toCharArray();
            Arrays.sort(cha);
            String s = String.valueOf(cha);// new concept
            if (!map.containsKey(s)) {
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(strs[i]);
        }
        return new ArrayList<>(map.values());// new concept
    }
}
