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

public class Q101SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return traverseLeft(root.left).equals(traverseRight(root.right));
    }
    public String traverseLeft(TreeNode root) {
        String str = "";
        if (root == null) {
            return "null ";
        }
        str += root.val + " ";
        str += traverseLeft(root.left);
        str += traverseLeft(root.right);
        return str;
    }
    public String traverseRight(TreeNode root) {
        String str = "";
        if (root == null) {
            return "null ";
        }
        str += root.val + " ";
        str += traverseRight(root.right);
        str += traverseRight(root.left);
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
