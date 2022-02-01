package com.company;

public class Amazon_CountWayToNthStair {
    Long countWays(int n)
    {
        int[] arr = new int[n+1];
        arr[0]=1; arr[1]=1;
        for(int i=2; i<=n; i++)
        {
            arr[i]=arr[i-2]+1;
        }
        return (long)arr[n];
    }
}
