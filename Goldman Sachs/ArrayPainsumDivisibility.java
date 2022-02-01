package com.company;

public class ArrayPainsumDivisibility {
    public boolean canPair(int[] nums, int k) {
        // Code here
        int[] arr = new int[k];
        for(int i=0; i<nums.length; i++)
        {
            arr[nums[i]%k]++;
        }
        for(int i=1; i<=k/2; i++)
        {
            if(arr[i]!=arr[k-i])
                return false;
        }
        if(arr[0]%2!=0)
            return false;
        return true;

    }
}
