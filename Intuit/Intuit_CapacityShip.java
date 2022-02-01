package com.company;

public class Intuit_CapacityShip {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0, n = weights.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            if(max<weights[i])
                max=weights[i];
            sum+=weights[i];
        }
        int low = max, high = sum;
        int res=-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(isPossible(mid, weights, days))
            {
                res = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return res;
    }
    public boolean isPossible(int mid, int[] arr, int k)
    {
        int c=1, sum=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>mid)
                return false;
            if(sum+arr[i]<=mid)
            {
                sum+=arr[i];
            }
            else
            {
                c++;
                sum=arr[i];
            }
        }
        if(c>k)
            return false;
        return true;
    }
}
