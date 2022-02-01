package com.company;

import java.util.HashMap;

public class Adobe_longestAP {
    int lengthOfLongestAP(int[] nums, int n) {
        // code here
        if(n==1)
            return 1;
        HashMap<Integer, Integer>[] map = new HashMap[n];
        for(int i=0; i<n; i++)
        {
            map[i]=new HashMap<>();
        }
        int max = Integer.MIN_VALUE;
        for(int i=1; i<n; i++)
        {
            for(int j=0; j<i; j++)
            {
                int diff = nums[i]-nums[j];
                int a = map[i].getOrDefault(diff, 0);
                int b = map[j].getOrDefault(diff, 0);
                int ans = b+1;
                map[i].put(diff, ans);
                if(max<ans+1)
                {
                    max=ans+1;
                }
            }
        }

        return max;
    }
}
