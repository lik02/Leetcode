package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Q102BinaryTreeLevelOrderTraversal {// youtube solution
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    list.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            if (!list.isEmpty()) {
                res.add(list);
            }
        }
        return res;
    }
}

// public List<List<Integer>> levelOrder(TreeNode root) {// my solution
//     ArrayList<List<Integer>> res = new ArrayList<>();
//     Queue<TreeNode> queue = new LinkedList<>();
//     if (root == null) {
//         return res;
//     }
//     queue.add(root);
//     while (!queue.isEmpty()) {
//         int size = queue.size();
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int i = 0; i < size; i++) {
//             TreeNode node = queue.poll();
//             list.add(node.val);
//             if (node.left != null) {
//                 queue.add(node.left);
//             }
//             if (node.right != null) {
//                 queue.add(node.right);
//             }
//         }
//         res.add(list);
//     }
//     return res;
// }

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