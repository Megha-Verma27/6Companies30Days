package com.company;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int l =0, r=0;
        int n = nums.length;
        int sum=0, min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++)
        {
            sum+=nums[i];
            while(sum>=target)
            {
                if(min>(r-l+1))
                    min=(r-l+1);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        if(min==Integer.MAX_VALUE)
            return 0;
        return min;
    }
}
