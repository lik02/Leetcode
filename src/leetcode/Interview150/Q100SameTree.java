package leetcode.Interview150;

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

public class Q100SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return preorder(p).equals(preorder(q));
    }
    public String preorder(TreeNode node) {// case use DFS (preorder)
        String str = "";
        if (node == null) {
            return "null ";
        }
        str += node.val + " ";
        str += preorder(node.left);
        str += preorder(node.right);
        return str;
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
