package leetcode.Interview150;

import java.util.HashMap;

public class Q13RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<String, Integer> rom = new HashMap<>();
        rom.put("I", 1);
        rom.put("V", 5);
        rom.put("X", 10);
        rom.put("L", 50);
        rom.put("C", 100);
        rom.put("D", 500);
        rom.put("M", 1000);
    
        String[] arr = s.split("");
        int sum = 0;
        for (int i = 0; i < arr.length;) {
            if (i == arr.length - 1) {
                sum += rom.get(arr[i]);
                i++;
            }
            else if (rom.get(s.substring(i, i + 1)) < rom.get(s.substring(i + 1, i + 2))) {
                sum += rom.get(s.substring(i + 1, i + 2)) - rom.get(s.substring(i, i + 1)); 
                i += 2;
            }
            else {
                sum += rom.get(s.substring(i, i + 1));
                i++;
            }
        }
        return sum;
    }
}
