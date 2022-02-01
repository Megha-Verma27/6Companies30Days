package com.company;
import java.util.*;
public class Microsoft_StockSpan {
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        Stack<Integer> s= new Stack<>();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            while(!s.isEmpty()&&price[s.peek()]<=price[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                arr[i]=i+1;
            }
            else
            {
                arr[i] = i-s.peek();
            }
            s.push(i);
        }
        return arr;
    }
}
