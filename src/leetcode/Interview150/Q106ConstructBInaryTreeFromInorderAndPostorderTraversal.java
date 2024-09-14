package leetcode.Interview150;

public class Q106ConstructBInaryTreeFromInorderAndPostorderTraversal {
    int index = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index = postorder.length - 1;
        TreeNode root = new TreeNode(postorder[index]);
        buildTree(inorder, postorder, root);
        return root;
    }

    public void buildTree(int[] inorder, int[] postorder, TreeNode node) {
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
        int[] arrRight = new int[inorder.length - 1 - hold];
        if (arrRight.length != 0) {
            System.arraycopy(inorder, hold + 1, arrRight, 0, arrRight.length);
            node.right = new TreeNode(postorder[--index]);
            buildTree(arrRight, postorder, node.right);
        }
        int[] arrLeft = new int[hold];
        if (arrLeft.length != 0) {
            System.arraycopy(inorder, 0, arrLeft, 0, hold);
            node.left = new TreeNode(postorder[--index]);
            buildTree(arrLeft, postorder, node.left);
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