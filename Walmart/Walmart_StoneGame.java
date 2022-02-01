package com.company;

import java.util.Arrays;

public class Walmart_StoneGame {
    int help(int i, int j, int[] piles, int[][] dp)
    {
        if(i>j)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        return dp[i][j]= Math.max(piles[i]-help(i+1, j, piles, dp), piles[j]-help(i, j-1, piles, dp));
    }
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n];
        for(int[] ch: dp){
            Arrays.fill(ch, -1);
        }
        return help(0, n-1, piles, dp)>0;
    }
}
