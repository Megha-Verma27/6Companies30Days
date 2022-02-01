package com.company;

public class Walmart_TransferSumTree {
    class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=null;
            right=null;
        }
    }

    public int post(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int l= post(root.left);
        int r =post(root.right);
        int sum = l+r;
        int temp = root.data;
        root.data=sum;
        return temp+sum;

    }
    public void toSumTree(Node root){
        //add code here.
        post(root);
    }
}
