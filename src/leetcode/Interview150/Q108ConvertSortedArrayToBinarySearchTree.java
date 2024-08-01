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

public class Q108ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        TreeNode root = new TreeNode(nums[nums.length / 2]);
        int[] left = new int[nums.length / 2];
        System.arraycopy(nums, 0, left, 0, nums.length / 2);
        root.left = sortedArrayToBST(left);
        if (nums[nums.length - 1] != root.val) {// [1,2] and [1,2,3] root is 2, but first case don't have right subtree
            int[] right = null;
            if (nums.length % 2 == 0) {
                right = new int[(nums.length / 2) - 1];
                System.arraycopy(nums, (nums.length / 2) + 1, right, 0, (nums.length / 2) - 1);
            }
            else {
                right = new int[nums.length / 2];
                System.arraycopy(nums, (nums.length / 2) + 1, right, 0, nums.length / 2);
            }
            root.right = sortedArrayToBST(right);
        }
        return root;
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
