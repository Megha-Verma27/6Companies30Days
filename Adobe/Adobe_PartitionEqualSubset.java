package com.company;

public class Adobe_PartitionEqualSubset {
    public Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        boolean[][] dp = new boolean[N+1][sum+1];
        for(int i=1; i<=sum; i++)
        {
            dp[0][i]=false;
        }
        for(int i=0; i<=N; i++)
        {
            dp[i][0]=true;
        }
        for(int i=1; i<=N; i++)
        {
            for(int j=1; j<=sum; j++)
            {
                if(arr[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j-arr[i-1]]||dp[i-1][j];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        if(dp[N][sum]==true)
            return true;
        return false;
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n = nums.length;
        for(int i=0; i<n; i++)
        {
            sum+=nums[i];
        }
        if(sum%2!=0)
            return false;
        else
        {
            if(isSubsetSum(n, nums, sum/2))
                return true;
        }
        return false;
    }
}
