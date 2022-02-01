package com.company;

public class Amazon_LongestMountain {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int in =0, dc=0, max=0;
        for(int i=0; i<n-1; i++)
        {
            if(arr[i]<arr[i+1])
            {
                if(dc!=0)
                {
                    in=0;
                    dc=0;
                }
                in++;
            }
            else if(arr[i]>arr[i+1])
            {
                if(in!=0){
                    dc++;
                }
            }
            else
            {
                in=0; dc=0;
            }
            if(in!=0 &&dc!=0)
            {
                max=Math.max(max, in+dc+1);
            }

        }
        return max;

    }
}
