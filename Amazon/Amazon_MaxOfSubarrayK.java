package com.company;
import java.util.*;
public class Amazon_MaxOfSubarrayK {
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        Deque<Integer> q = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<k; i++)
        {

            while(!q.isEmpty()&&arr[q.peekLast()]<arr[i])
            {
                q.pollLast();
            }
            if(!q.isEmpty()&&arr[q.peekLast()]>=arr[i])
            {
                q.addLast(i);
            }
            else if(q.isEmpty())
            {
                q.addLast(i);
            }
        }
        list.add(arr[q.peekFirst()]);
        for(int i=k; i<n; i++)
        {
            if(q.peekFirst()==i-k)
                q.pollFirst();
            while(!q.isEmpty()&&arr[q.peekLast()]<arr[i])
            {
                q.pollLast();
            }
            if(!q.isEmpty()&&arr[q.peekLast()]>=arr[i])
            {
                q.addLast(i);
            }
            else if(q.isEmpty())
            {
                q.addLast(i);
            }
            list.add(arr[q.peekFirst()]);

        }
        return list;
    }
}
