package com.company;

public class Microsoft_CountSubTree {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data =data;
            left=null;
            right=null;
        }
    }
    int c=0;
    int sum(Node root, int x)
    {
        if(root==null)
            return 0;
        int s= sum(root.left, x)+sum(root.right, x)+root.data;
        if(s==x)
            c++;
        return s;
    }

    int countSubtreesWithSumX(Node root, int X)
    {
        //Add your code here.
        c=0;
        sum(root, X);
        return c;

    }
}
