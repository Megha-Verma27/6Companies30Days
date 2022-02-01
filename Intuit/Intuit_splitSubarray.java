package com.company;

public class Intuit_splitSubarray {
    public int splitArray(int[] nums, int m) {
        int n = nums.length;
        int max= Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<n; i++)
        {
            if(max<nums[i])
                max=nums[i];
            sum+=nums[i];
        }
        int low= max , high = sum;
        int res=-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(isPossible(mid, nums, m))
            {
                res=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return res;
    }
    public boolean isPossible(int mid, int[] arr, int m)
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
                sum=arr[i];
                c++;
            }
        }
        if(c>m)
            return false;
        return true;
    }
}
