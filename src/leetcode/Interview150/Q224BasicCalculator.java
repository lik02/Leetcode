package leetcode.Interview150;

import java.util.Stack;

public class Q224BasicCalculator {
    public static void main(String[] args) {
        String s = "1-11";
        System.out.println(calculate(s));
    }
    public static int calculate(String s) {
        if (!s.contains("+") && !s.contains("-")) {
            s = s.replace("(", "");
            s = s.replace(")", "");
            s = s.replace(" ", "");
            return Integer.valueOf(s);
        }
        s = "(" + s + ")";
        s = s.replace(" ", "");
        Stack<Integer> num = new Stack<>();
        Stack<String> op = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i, i + 1);
            if (str.equals("(")) {
                cnt = 0;
                continue;
            }
            else if (Character.isDigit(s.charAt(i))) {
                num.push(Integer.valueOf(str));
                cnt++;
            }
            else if (str.equals("+")) {
                op.push(str);
            }
            else if (str.equals("-")) {
                if (Character.isDigit(s.charAt(i + 1))) {
                    num.push(-1 * Integer.valueOf(s.substring(i + 1, i + 2)));
                    cnt++;
                    i++;
                }
                else {
                    op.push(str);
                }
            }
            if ((cnt >= 2 || str.equals(")")) && (num.size() >= 2 && op.size() >= 1)) {
                int y = num.pop();
                int x = num.pop();
                num.push(calculate(x, y, op.pop()));
            }
        }
        while (num.size() > 1) {
            int y = num.pop();
            int x = num.pop();
            num.push(calculate(x, y, "+"));
        }
        return op.isEmpty() ? num.pop() : -1 * num.pop();
    }

    public static int calculate(int x, int y, String str) {
        switch (str) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            default:
                return -1;
        }
    }

    // public static int calculate(String s) {
    //     if (!s.contains("+") && !s.contains("-")) {
    //         s = s.replace("(", "");
    //         s = s.replace(")", "");
    //         s = s.replace(" ", "");
    //         return Integer.valueOf(s);
    //     }
    //     Stack<Integer> stack = new Stack<>();
    //     boolean bool = false;
    //     for (int i = 0; i < s.length(); i++) {
    //         if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == ' ') {
    //             continue;
    //         }
    //         else if (s.charAt(i) == '-') {
    //             if (bool) {
    //                 bool = false;
    //                 continue;
    //             }
    //             bool = true;
    //         }
    //         else if (bool) {
    //             stack.push(-1 * Integer.valueOf(s.substring(i, i + 1)));
    //             bool = false;
    //         }
    //         else if (Character.isDigit(s.charAt(i))) {
    //             stack.push(Integer.valueOf(s.substring(i, i + 1)));
    //         }
    //         if (stack.size() >= 2) {
    //             stack.push(stack.pop() + stack.pop());
    //         }
    //     }
    //     return stack.pop();
    // }

    // public static int calculate(String s) {
    //     Stack<String> num = new Stack<>();
    //     Stack<String> operator = new Stack<>();
    //     s = "(" + s + ")";
    //     for (int i = 0; i < s.length(); i++) {
    //         if (Character.isDigit(s.charAt(i)) || s.charAt(i) == '(') {
    //             num.push(String.valueOf(s.charAt(i)));
    //         }
    //         else if (s.charAt(i) != ' ' && s.charAt(i) != '(' && s.charAt(i) != ')') {
    //             operator.push(String.valueOf(s.charAt(i)));
    //         }
    //         else if (s.charAt(i) == ')') {
    //             while (true) {
    //                 int y = Integer.valueOf(num.pop());
    //                 int x = Integer.valueOf(num.pop());
    //                 String res = String.valueOf(calculate(x, y, operator.pop()));
    //                 if (num.peek().equals("(")) {
    //                     num.pop();
    //                     num.push(res);
    //                     break;
    //                 }
    //                 else {
    //                     num.push(res);
    //                 }
                    
    //             } 
    //         }
    //     }
    //     return operator.isEmpty() ? Integer.valueOf(num.pop()) : Integer.valueOf(num.pop()) * -1;
    // }

    // public static int calculate(int x, int y, String str) {
    //     switch (str) {
    //         case "+":
    //             return x + y;
    //         case "-":
    //             return x - y;
    //         default:
    //             return -1;
    //     }
    // }
}
