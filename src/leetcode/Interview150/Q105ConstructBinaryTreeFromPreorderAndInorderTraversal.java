package leetcode.Interview150;

public class Q105ConstructBinaryTreeFromPreorderAndInorderTraversal {
    int index = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode(preorder[index]);
        buildTree(preorder, inorder, root);
        return root;
    }

    public void buildTree(int[] preorder, int[] inorder, TreeNode node) {
        if (inorder.length <= 1) {
            return;
        }
        int hold = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == node.val) {
                hold = i;
                break;
            }
        }
        int[] inorderLeft = new int[hold];
        if (inorderLeft.length != 0) {
            System.arraycopy(inorder, 0, inorderLeft, 0, hold);
            node.left = new TreeNode(preorder[++index]);
            buildTree(preorder, inorderLeft, node.left);
        }
        int[] inorderRight = new int[inorder.length - 1 - hold];
        if (inorderRight.length != 0) {
            System.arraycopy(inorder, hold + 1, inorderRight, 0, inorderRight.length);
            node.right = new TreeNode(preorder[++index]);
            buildTree(preorder, inorderRight, node.right);
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