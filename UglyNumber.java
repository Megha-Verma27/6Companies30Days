package com.company;

public class UglyNumber {
    long getNthUglyNo(int n) {
        // code here
        long[] dp = new long[n+1];
        dp[1]=1;
        int p2=1, p3=1, p5=1;
        for(int i=2; i<=n; i++)
        {
            long a = 2*dp[p2];
            long b = 3*dp[p3];
            long c = 5*dp[p5];
            long min = Math.min(a, Math.min(b,c));
            dp[i]=min;
            if(min==a)
                p2++;
            if(min==b)
                p3++;
            if(min==c)
                p5++;
        }
        return dp[n];
    }
}
