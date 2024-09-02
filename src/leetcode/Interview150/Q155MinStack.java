package leetcode.Interview150;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Q155MinStack {
    ArrayList<Integer> list;
    LinkedList<Integer> link;

    public Q155MinStack() {
        list = new ArrayList<>();
        link = new LinkedList<>();
    }
    
    public void push(int val) {
        list.add(val);
        link.add(val);
        Collections.sort(link);
    }
    
    public void pop() {
        boolean bol = link.remove(list.remove(list.size() - 1));
    }
    
    public int top() {
        return list.get(list.size() - 1);
    }
    
    public int getMin() {
        return link.getFirst();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
