package leetcode.Interview150;

import java.util.ArrayList;

public class Q173BinarySearchTreeIterator {
    TreeNode root;
    ArrayList<Integer> list;
    int index;

    public Q173BinarySearchTreeIterator(TreeNode root) {
        this.root = root;
        list = new ArrayList<>();
        index = 0;
        inorderTraversal(root);
    }
    
    public int next() {
        return list.get(index++);
    }
    
    public boolean hasNext() {
        if (index < list.size()) {
            return true;
        }
        return false;
    }

    public void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        list.add(node.val);
        inorderTraversal(node.right);
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