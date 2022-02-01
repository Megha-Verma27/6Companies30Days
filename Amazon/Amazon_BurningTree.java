package com.company;

public class Amazon_BurningTree {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static int maxDepth(Node n)
    {
        if(n==null)
            return 0;
        return 1+Math.max(maxDepth(n.left), maxDepth(n.right));
    }
    static int ret;
    public static int traverse(Node n, int target)
    {
        if(n==null)
            return 0;
        if(n.data==target)
            return 1;
        int val = traverse(n.left, target);
        if(val!=0)
        {
            ret = Math.max(ret, val+maxDepth(n.right));
            return val+1;
        }
        val = traverse(n.right, target);
        if(val!=0)
        {
            ret = Math.max(ret, val+maxDepth(n.left));
            return val+1;
        }
        return 0;
    }
    public static int minTime(Node root, int target)
    {
        // Your code goes here
        ret =0;
        traverse(root, target);
        return ret;
    }
}
