package com.company;

import java.util.Arrays;

public class Adobe_PotOfGold {
    public static int help(int i, int j, int[] arr, int[][] dp)
    {
        if(i>j)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int x = arr[i]+Math.min(help(i+2, j, arr, dp), help(i+1, j-1, arr, dp));
        int y = arr[j]+Math.min(help(i, j-2, arr, dp), help(i+1, j-1, arr, dp));
        return dp[i][j]= Math.max(x, y);
    }
    public static int maxCoins(int A[],int n)
    {
        //add code here.
        int[][] dp = new int[n][n];
        for(int[] ch : dp)
        {
            Arrays.fill(ch, -1);
        }
        return help(0, n-1, A, dp);

    }
}
