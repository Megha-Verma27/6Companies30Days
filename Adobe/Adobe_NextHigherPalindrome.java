package com.company;

import java.util.Arrays;

public class Adobe_NextHigherPalindrome {
    public String nextPalin(String N)
    {
        //complete the function here
        int n = N.length();
        int t=n/2-1;
        String temp = N.substring(0,t+1);
        char[] arr = temp.toCharArray();
        int left = -1;
        for(int i = arr.length-1; i>=1; i--)
        {
            if(arr[i]>arr[i-1])
            {
                left = i-1;
                break;
            }
        }
        if(left == -1)
            return "-1";
        char min = Character.MAX_VALUE;
        int right = -1;
        for(int i=left+1; i<arr.length; i++)
        {
            if(arr[i]>arr[left]&&arr[i]<min)
            {
                min = arr[i];
                right = i;
            }
        }
        char tp = arr[left];
        arr[left]= arr[right];
        arr[right]=tp;
        Arrays.sort(arr, left+1, arr.length);
        String ans = new String(arr);
        String reverse ="";
        for(int i=arr.length-1; i>=0; i--)
        {
            reverse+=arr[i];
        }
        if(n%2==0)
        {
            ans=ans+reverse;
        }
        else
        {
            ans=ans+N.charAt(t+1)+reverse;
        }
        return ans;

    }
}
