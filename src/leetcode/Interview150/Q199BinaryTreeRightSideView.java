package leetcode.Interview150;

import java.util.ArrayList;
import java.util.List;

public class Q199BinaryTreeRightSideView {
    List<Integer> list = new ArrayList<>();
    int height = 0;

    public List<Integer> rightSideView(TreeNode root) {
        mechanism(root, 0);
        return list;
    }

    public void mechanism(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level >= height) {
            list.add(root.val);
            height++;
        }
        mechanism(root.right, level + 1);
        mechanism(root.left, level + 1);
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