package com.company;
import java.util.*;
public class Adobe_subarraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here

        int sum =0;
        int l=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            sum+=arr[i];
            while(sum>s)
            {
                sum-=arr[l];
                l++;
            }
            if(sum==s)
            {

                list.add(l+1);
                list.add(i+1);
                return list;
            }
        }
        list.add(-1);
        return list;
    }
}
