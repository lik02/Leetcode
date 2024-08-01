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

public class Q112PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        boolean res = false;
        if (root == null) {// to cater case like a root.left has node but root.right is null
            return res;
        }
        if (root.left == null && root.right == null) {
            if (targetSum - root.val == 0) {
                res = true;
                return res;
            }
            else {
                return res;
            }
        }
        res = hasPathSum(root.left, targetSum - root.val);
        if (!res) {
            res = hasPathSum(root.right, targetSum - root.val);
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
