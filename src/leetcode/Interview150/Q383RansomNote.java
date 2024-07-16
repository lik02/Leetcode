package leetcode.Interview150;

import java.util.ArrayList;
import java.util.Arrays;

public class Q383RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        String[] r = ransomNote.split("");
        String[] m = magazine.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(m));
        for (int i = 0; i < r.length; i++) {
            if (list.contains(r[i])) {
                list.remove(r[i]);
            }
            else {
                return false;
            }
        }
        return true;
    }
}
