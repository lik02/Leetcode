package leetcode.Interview150;

public class Q67AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
    public static String addBinary(String a, String b) {
        int num1 = 0;
        int num2 = 0;
        Long hold1 = Long.valueOf(a);
        Long hold2 = Long.valueOf(b);
        for (int i = 0; i < a.length(); i++) {
            num1 += hold1 % 10 * Math.pow(2, i);
            hold1 /= 10;
        }
        for (int i = 0; i < b.length(); i++) {
            num2 += hold2 % 10 * Math.pow(2, i);
            hold2 /= 10;
        }
        num1 += num2;
        return Integer.toBinaryString(num1);
    }
}
