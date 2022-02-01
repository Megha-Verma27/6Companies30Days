package com.company;

public class Intuit_MinimumSumPartition {
    public int minDifference(int arr[], int n)
    {
        // Your code goes here
        int sum=0;
        for(int i=0; i<n; i++)
        {
            sum+=arr[i];
        }
        boolean[][] dp = new boolean[n+1][sum+1];
        for(int i=0; i<=n; i++)
        {
            dp[i][0]=true;
        }
        for(int i=1; i<=sum; i++)
        {
            dp[0][i]=false;
        }
        for(int i=1; i<=n; i++)
        {
            for(int j = 1; j<=sum; j++)
            {
                if(arr[i-1]<=j)
                {
                    dp[i][j]= dp[i-1][j-arr[i-1]]||dp[i-1][j];
                }
                else
                    dp[i][j]= dp[i-1][j];
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<=sum; i++)
        {
            if(dp[n][i]==true){
                if(min>Math.abs(sum-2*i))
                {
                    min=Math.abs(sum-2*i);
                }
            }
        }
        return min;
    }
}
