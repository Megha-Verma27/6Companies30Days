package com.company;
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
};

public class Intuit_constructQuadTree {
    public Node construct(int[][] grid) {
        return construct(grid, 0, 0, grid.length);
    }


    public Node construct(int[][] grid, int row, int col, int length)
    {
        if(length == 1)
            return new Node(grid[row][col] == 1, true);
        int half = length/2;

        Node nodeTopLeft = construct(grid, row, col, half);

        Node nodeTopRight = construct(grid, row, col+half, half);
        Node nodeBottomLeft = construct(grid, row+half, col, half);
        Node nodeBottomRight = construct(grid, row+half, col+half, half);
        if(nodeTopLeft.val == nodeTopRight.val && nodeBottomLeft.val == nodeBottomRight.val && nodeTopLeft.val == nodeBottomLeft.val
                && nodeTopLeft.isLeaf && nodeTopRight.isLeaf && nodeBottomLeft.isLeaf && nodeBottomRight.isLeaf)
        {
            return new Node(nodeTopLeft.val, true);
        }
        return new Node(grid[row][col] == 1, false, nodeTopLeft, nodeTopRight, nodeBottomLeft, nodeBottomRight);
    }


}
