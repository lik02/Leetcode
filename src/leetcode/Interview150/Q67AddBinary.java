package leetcode.Interview150;

public class Q67AddBinary {
    public String addBinary(String a, String b) {
        String str1 = "";
        String str2 = "";
        if (a.length() < b.length()) {// b + a
            str1 = a;
            str2 = b;
        }
        else {// a + b
            str1 = b;
            str2 = a;
        }
        for (int i = str1.length() - 1, j = str2.length() - 1; i >= 0; i--, j--) {
            if (str1.substring(i, i + 1).equals("0")) {// skip 0;
                continue;
            }
            if (str2.substring(j, j + 1).equals("0")) {
                str2 = str2.substring(0, j) + "1" + str2.substring(j + 1);
            }
            else {
                int k = j;
                for (; k >= 0 && str2.substring(k, k + 1).equals("1"); k--) {
                    str2 = str2.substring(0, k) + "0" + str2.substring(k + 1);
                }
                if (k < 0) {
                    str2 = "1" + str2;
                    j++;// to cater case like 11 + 1 = 100; the index will skip one digit if no j++;
                }
                else {
                    str2 = str2.substring(0, k) + "1" + str2.substring(k + 1);
                }
            }
        }
        return str2;
    }
}
