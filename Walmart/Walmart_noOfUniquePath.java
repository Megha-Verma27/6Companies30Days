package com.company;

import java.util.Arrays;

public class Walmart_noOfUniquePath {
    public static int path(int i, int j, int[][] dp, int a, int b)
    {
        if(i==(a-1) && j==(b-1))
            return 1;
        if(i>=a || j>=b)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        return dp[i][j]=path(i+1, j, dp, a, b)+path(i, j+1, dp, a,b);
    }
    public static int NumberOfPath(int a, int b)
    {
        //Your code here
        int[][] dp = new int[a][b];
        for(int[] ch : dp)
        {
            Arrays.fill(ch, -1);
        }

        int ans = path(0, 0, dp, a, b);
        return ans;

    }
}
