package leetcode.Interview150;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q103BinaryZigZagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }
        int time = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int cnt = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < cnt ; i++) {
                TreeNode hold = queue.poll();
                list.add(hold.val);
                if (hold.left != null) {
                    queue.offer(hold.left);
                }
                if (hold.right != null) {
                    queue.offer(hold.right);
                }
            }
            if (time % 2 == 1) {
                Collections.reverse(list);
            }
            time++;
            res.add(list);
        }
        return res;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}