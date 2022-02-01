package com.company;

import java.util.ArrayList;

public class Adobe_LeaderOfArray {
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        int max = Integer.MIN_VALUE;
        max= arr[n-1];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(max);
        for(int i=n-2; i>=0; i--)
        {
            if(arr[i]>=max)
            {
                max=arr[i];
                list.add(0, max);
            }
        }
        return list;
    }
}
