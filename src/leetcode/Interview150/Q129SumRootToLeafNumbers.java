package leetcode.Interview150;

public class Q129SumRootToLeafNumbers {
    int ans = 0;
    
    public int sumNumbers(TreeNode root) {
        int hold = 0;
        sum(root, hold);
        return ans;
    }

    public void sum(TreeNode node, int hold) {
        if (node.left == null && node.right == null) {
            hold *= 10;
            hold += node.val;
            ans += hold;
            return;
        }
        hold *= 10;
        hold += node.val;
        if (node.left != null) {
            sum(node.left, hold);
        }
        if (node.right != null) {
            sum(node.right, hold);
        }
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