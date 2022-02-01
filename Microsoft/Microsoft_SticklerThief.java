package com.company;

public class Microsoft_SticklerThief {
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int[] dp = new int[n];
        dp[0] = arr[0];
        if(n>1){
            dp[1]= Math.max(arr[1], arr[0]);
        }
        for(int i=2; i<n; i++)
        {
            dp[i]= Math.max(dp[i-1], dp[i-2]+arr[i] );
        }
        return dp[n-1];
    }
}
