package leetcode.Interview150;

import java.util.Stack;

public class Q150EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token: tokens) {
            if (evaluateDigit(token)) {
                stack.push(Integer.valueOf(token));
            }
            else {
                int y = stack.pop();
                int x = stack.pop();
                stack.push(calculate(x, y, token));
            }
        }
        return stack.pop();
    }

    public boolean evaluateDigit(String str) {
        try {
            Integer.valueOf(str);
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
    }

    public int calculate(int x, int y, String str) {
        switch (str) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                return x / y;
            default: 
                return -1;
        }
    }
}
