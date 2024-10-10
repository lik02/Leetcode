

public class Q427ConstructQuadTree {
    public Node construct(int[][] grid) {
        return dfs(grid, 0, 0, grid.length);
    }

    public Node dfs(int[][] grid, int r, int c, int step) {
        boolean allSame = true;
        for (int i = r; i < r + step; i++) {
            for (int j = c; j < c + step; j++) {
                if (grid[r][c] != grid[i][j]) {
                    allSame = false;
                    break;
                }
            }
        }
        if (allSame) {
            return new Node(grid[r][c] == 1 ? true : false, true);
        }
            Node topLNode = dfs(grid, r, c, step / 2);
            Node topRNode = dfs(grid, r, c + (step / 2), step / 2);
            Node bottomLNode = dfs(grid, r + (step / 2), c, step / 2);
            Node bottomRNode = dfs(grid, r + (step / 2), c + (step / 2), step / 2);
            return new Node(grid[r][c] == 1 ? true : false, false, topLNode, topRNode, bottomLNode, bottomRNode);
    }

    // public void build(int[][] grid, int r, int c, int horizontalBound, int verticalBound, Node head) {
    //     int hold = grid[r][c];
    //     Node topLNode = new Node(true, true);
    //     for (int i = r; i < r + horizontalBound; i++) {
    //         for (int j = c; j < c + verticalBound; j++) {
    //             if (grid[i][j] != hold) {
    //                 build(grid, r, c, horizontalBound / 2, verticalBound / 2, topLNode);
    //                 topLNode.isLeaf = false;
    //             }
    //         }
    //     }
    //     topLNode.val = hold == 1 ? true : false;
    //     head.topLeft = topLNode;

    //     hold = grid[r][c + verticalBound];
    //     Node topRNode = new Node(true, true);
    //     for (int i = r; i < r + horizontalBound; i++) {
    //         for (int j = c + verticalBound; j < c + verticalBound + verticalBound; j++) {
    //             if (grid[i][j] != hold) {
    //                 build(grid, r, c + verticalBound, horizontalBound / 2, verticalBound / 2, topRNode);
    //                 topRNode.isLeaf = false;
    //             }
    //         }
    //     }
    //     topRNode.val = hold == 1 ? true : false;
    //     head.topRight = topRNode;

    //     hold = grid[r + horizontalBound][c];
    //     Node bottomLNode = new Node(true, true);
    //     for (int i = r + horizontalBound; i < r + horizontalBound + horizontalBound; i++) {
    //         for (int j = c; j < c + verticalBound; j++) {
    //             if (grid[i][j] != hold) {
    //                 build(grid, r + horizontalBound, c, horizontalBound / 2, verticalBound / 2, bottomLNode);
    //                 bottomLNode.isLeaf = false;
    //             }
    //         }
    //     }
    //     bottomLNode.val = hold == 1 ? true : false;
    //     head.bottomLeft = bottomLNode;

    //     hold = grid[r + horizontalBound][c + verticalBound];
    //     Node bottomRNode = new Node(true, true);
    //     for (int i = r + horizontalBound; i < r + horizontalBound + horizontalBound; i++) {
    //         for (int j = c + verticalBound; j < c + verticalBound + verticalBound; j++) {
    //             if (grid[i][j] != hold) {
    //                 build(grid, r + horizontalBound, c + verticalBound, horizontalBound / 2, verticalBound / 2, bottomRNode);
    //                 bottomRNode.isLeaf = false;
    //             }
    //         }
    //     }
    //     bottomRNode.val = hold == 1 ? true : false;
    //     head.bottomRight = bottomRNode;
    // }
}

class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}