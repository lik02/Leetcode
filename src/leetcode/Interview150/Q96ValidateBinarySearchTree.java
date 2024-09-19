package leetcode.Interview150;

public class Q96ValidateBinarySearchTree {
    boolean ans = true;
    long prev = -99999999999999L;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return ans;
        }
        isValidBST(root.left);
        if (root.val > prev) {
            prev = root.val;
        }
        else {
            ans = false;
        }
        isValidBST(root.right);
        return ans;
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