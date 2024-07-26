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
        String str1 = preorder(p);
        String str2 = preorder(q);
        return str1.equals(str2);
    }
    public String preorder(TreeNode node) {// case show DFS (preorder)
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
