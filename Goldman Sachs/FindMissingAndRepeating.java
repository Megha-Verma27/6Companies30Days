package com.company;

public class FindMissingAndRepeating {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int[] flag = new int[n];
        int[]b=new int[2];
        for(int i=0; i<n; i++)
        {
            if(flag[arr[i]-1]!=1)
            {
                flag[arr[i]-1]=1;
            }
            else
            {
                b[0]=arr[i];
            }
        }
        for(int i=0; i<n; i++)
        {
            if(flag[i]!=1)
            {
                b[1]=i+1;
            }
        }
        return b;
    }
}
