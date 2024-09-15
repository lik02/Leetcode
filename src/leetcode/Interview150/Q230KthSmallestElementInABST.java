package leetcode.Interview150;

public class Q230KthSmallestElementInABST {
    int ans;
    int cnt = 0;
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return ans;
        }
        kthSmallest(root.left, k);
        cnt++;
        if (cnt == k) {
            ans = root.val;
        }
        kthSmallest(root.right, k);
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