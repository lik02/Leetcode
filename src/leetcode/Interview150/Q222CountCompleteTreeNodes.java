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

public class Q222CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = leftHeight(root);
        int right = rightHeight(root);
        if (left == right) {
            return (int)Math.pow(2, left) - 1;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
    public int leftHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return leftHeight(root.left) + 1;
    }

    public int rightHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return rightHeight(root.right) + 1;
    }

    // public int countNodes(TreeNode root) {
    //     int res = 0;
    //     if (root == null) {
    //         return res;
    //     }
    //     res++;
    //     res += countNodes(root.left);
    //     res += countNodes(root.right);
    //     return res;
    // }
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

/*
 * case 1: full tree
 * case 2: complete tree 
 * -> level above leaf is full
 * -> leaf is filled from left to right
 * level is the nodes
 * depth is path
 * full binary tree has formula for numbers of node = 2^h - 1
 */