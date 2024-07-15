package leetcode.Interview150;

import java.util.HashMap;

public class Q12IntegerToRoman {
    public static String intToRoman(int num) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1000, "M");
        map.put(500, "D");
        map.put(100, "C");
        map.put(50, "L");
        map.put(10, "X");
        map.put(5, "V");
        map.put(1, "I");
        
        String roman = "";
        while (num != 0) {
            String hold = String.valueOf(num);
            if (hold.charAt(0) == '4' || hold.charAt(0) == '9') {
                int value = Integer.valueOf(hold.substring(0, 1)) + 1;
                roman += map.get((int)Math.pow(10, hold.length() - 1)) + map.get(value * (int)Math.pow(10, hold.length() - 1));
                hold = hold.substring(1);
                if (hold.equals("")) {
                    num = 0;
                }
                else {
                    num = Integer.valueOf(hold);
                }
            }
            else {
                if (num >= 1000) {
                    num -= 1000;
                    roman += map.get(1000);
                }
                else if (num >= 500) {
                    num -= 500;
                    roman += map.get(500);
                }
                else if (num >= 100) {
                    num -= 100;
                    roman += map.get(100);
                }
                else if (num >= 50) {
                    num -= 50;
                    roman += map.get(50);
                }
                else if (num >= 10) {
                    num -= 10;
                    roman += map.get(10);
                }
                else if (num >= 5) {
                    num -= 5;
                    roman += map.get(5);
                }
                else if (num >= 1) {
                    num -= 1;
                    roman += map.get(1);
                }
            }
        }
        return roman;
    }
}
