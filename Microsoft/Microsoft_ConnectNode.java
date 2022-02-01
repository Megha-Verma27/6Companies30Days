package com.company;


import java.util.*;
public class Microsoft_ConnectNode {
    class Node{
        int data;
        Node left;
        Node right;
        Node nextRight;
        Node(int data)
        {
            this.data =data;
            left=null;
            right=null;
            nextRight = null;
        }
    }
    public void connect(Node root)
    {
        // Your code goes here.
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        //root.nextRight = null;
        while(!q.isEmpty())
        {
            int s = q.size();
            ArrayList<Node> list = new ArrayList<>();
            for(int i=0; i<s; i++)
            {
                Node temp = q.poll();
                list.add(temp);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            int i=0;
            for(; i<list.size()-1; i++)
            {
                Node ch =list.get(i);
                ch.nextRight= list.get(i+1);
            }
            Node e = list.get(i);
            e.nextRight=null;

        }
    }
}
