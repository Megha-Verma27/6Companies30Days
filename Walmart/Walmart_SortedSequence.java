package com.company;

import java.util.ArrayList;

public class Walmart_SortedSequence {
    ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        // add code here.
        ArrayList<Integer> list =new ArrayList<>();
        if(n<3)
            return list;
        int[] left = new int[n];
        left[0] = arr.get(0);
        for(int i=1; i<n; i++)
        {
            left[i] = Math.min(left[i-1], arr.get(i));
        }
        int[] right = new int[n];
        right[n-1]= arr.get(n-1);
        for(int i=n-2; i>=0; i--)
        {
            right[i] = Math.max(right[i+1], arr.get(i));
        }
        for(int i=0; i<n; i++)
        {
            if(arr.get(i)>left[i] && arr.get(i)<right[i])
            {
                list.add(left[i]);
                list.add(arr.get(i));
                list.add(right[i]);
                return list;
            }
        }
        return list;
    }
}
