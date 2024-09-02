package leetcode.Interview150;

import java.util.Stack;

public class Q71SimplifyPath {
    public String simplifyPath(String path) {
        path += "/";// to cater edge case like "/" and "/..."
        Stack<String> stack = new Stack<>();
        String res = "";
        int index = path.indexOf("/");
        int nextIndex = path.indexOf("/", index + 1);
        
        while (index != nextIndex) {
            String str = path.substring(index + 1, nextIndex);
            if (str.equals(".")) {
                
            }
            else if (str.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                if (!stack.isEmpty()) {// case "/../"
                    stack.pop();
                }
            }
            else if (!str.equals("")) {
                stack.push("/");
                stack.push(str);
            }
            index = nextIndex;
            nextIndex = path.indexOf("/", index + 1);
            if (nextIndex == -1) {
                nextIndex = path.length();
            }
        }
        if (stack.isEmpty()) {
            stack.push("/");
        }
        res =  stack.toString();
        res = res.substring(1, res.length() - 1);
        res =  res.replaceAll(",", "");
        return res.replaceAll(" ", "");
    }
}
