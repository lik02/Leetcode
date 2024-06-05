package leetcode;

public class Q2486 {
    // public static int appendCharacters(String s, String t) {
    //     return appendCharacters(s, t, t.length());
    // }

    // public static int appendCharacters(String s, String t, int k) {
    //     if (s.contains(t) || t.length() == 0) {
    //         return k - t.length();
    //     }
    //     return appendCharacters(s, t.substring(0, t.length() - 1), k);
    // }

    // public static int appendCharacters(String s, String t) {
    //     String[] sarr = s.split("");
    //     String[] tarr = t.split("");
    //     int cnt = 0;
    //     for (int i = 0; i < tarr.length; i++) {
    //         for (int j = 0; j < sarr.length; j++) {
    //             if (tarr[i].equals(sarr[j])) {
    //                 cnt++;
    //                 sarr[j] = null;
    //                 break;
    //             }
    //         }
    //     }
    //     return t.length() - cnt;
    // }

    public int appendCharacters(String s, String t) {
        int position = 0;
        int result = t.length();
        for (int i = 0; i < t.length(); i++) {
            if (s.indexOf(t.charAt(i), position) != -1) {
                result--;
                position = s.indexOf(t.charAt(i), position) + 1;
            }
            else {
                return result;
            }
        }
        return result;
    }
}
