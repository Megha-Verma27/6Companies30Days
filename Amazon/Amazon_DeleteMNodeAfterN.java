package com.company;

public class Amazon_DeleteMNodeAfterN {
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    static void linkdelete(Node head, int m, int n)
    {
        // your code here
        Node temp = head;
        int c=1;
        while(temp!=null)
        {
            while(temp!=null && c!=m)
            {
                temp = temp.next;
                c++;
            }
            int d=0;
            if(temp==null)
                break;
            Node pre = temp;
            while(pre!=null&&pre.next!=null&&d!=n)
            {
                pre=pre.next;
                d++;
            }
            if(pre!=null)
            {
                temp.next=pre.next;
            }
            else
            {

            }
            if(temp!=null)
                temp=temp.next;
            c=1;
        }
    }
}
