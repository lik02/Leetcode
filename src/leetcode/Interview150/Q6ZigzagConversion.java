package leetcode.Interview150;

public class Q6ZigzagConversion {
    public static void main(String[] args) {
        System.out.println(convert("A", 2));
    }
    public static String convert(String s, int numRows) {
        String str = "";
        int get1 = (2 * numRows) - 2;
        int get2 = get1;
        int index = 0;
        if (numRows == 1) {// edge case ("AB", 1)
            return s;
        }
        for (int i = 0; i < numRows; i++) {
            if (i >= s.length()) {// edge case ("AB", 3) ("A", 2)
                break;
            }
            if (i == 0 || i == numRows - 1) {
                index = i;
                while (true) {
                    str += s.charAt(index);
                    index += get1;
                    if (index >= s.length()) {
                        break;
                    }
                }
            }
            else {
                get2 -= 2;
                index = i;
                while (true) {
                    str += s.charAt(index);
                    if (index + get2 >= s.length()) {
                        break;
                    }
                    str += s.charAt(index + get2);
                    index += get1;
                    if (index >= s.length()) {
                        break;
                    }
                }
            }
        }
        return str;
    }
}
/* 
PAYPALISHIRING

P     H
A   S I
Y  I  R
P L   I G 
A     N

row = 3 get1 = 4
row = 4 get1 = 6
row = 5 get1 = 8
2row - 2


get2 is to get extra character, for A get2 is to get S, get1 is I because get1 is constant in every row
row = 3 get2 = 2
row = 4 get2 = 4 2
row = 5 get2 = 6 4 2
2row - 2(initialised)
*/