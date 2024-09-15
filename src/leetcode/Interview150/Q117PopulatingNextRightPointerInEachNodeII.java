package leetcode.Interview150;

import java.util.LinkedList;
import java.util.Queue;

public class Q117PopulatingNextRightPointerInEachNodeII {

    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int cnt = queue.size();
            for (int i = 0; i < cnt; i++) {
                Node hold = queue.poll();
                if (i == cnt - 1) {
                    hold.next = null;
                }
                else {
                    hold.next = queue.peek();
                }
                if (hold.left != null) {
                    queue.offer(hold.left);
                }
                if (hold.right != null) {
                    queue.offer(hold.right);
                }
            }
        }
        return root;
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}