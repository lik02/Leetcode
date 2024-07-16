/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;


/**
 *
 * @author User
 */
class Q777SwapAdjacentinLRString {
    public static boolean canTransform(String start, String end) {
        if (!start.equals(end)) {
            for (int i = 0; i < start.length() - 1; i++) {
                boolean status = canTransform(start.substring(i, i + 2), end.substring(i, i + 2));
                if (!status) {
                    return false;
                }
                if ((!start.contains("X") || start.contains("XX")) && !start.equals(end)) {
                    return false;
                }
            }
        }
        else if (start.length() == 1 && end.length() == 1) {
            return start.compareTo(end) == 0;
        }
        return true;

    }
}
