package com.company;

public class Adobe_KDistinctWord {
    public int kvowelwords(int n, int k) {
        // code here
        long[][] dp = new long[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                if (i == 0) {
                    dp[i][j] = 1;
                } else {
                    if (j == 0) {
                        dp[i][j] = (dp[i - 1][k] * 21) % 1000000007;
                    } else {
                        dp[i][j] = ((dp[i - 1][k] * 21) % 1000000007 + (dp[i - 1][j - 1] * 5) % 1000000007) % 1000000007;
                    }
                }

            }

        }
        return (int) dp[n][k];
    }
}
