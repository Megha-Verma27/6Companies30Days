package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class Adobe_Elections {
    public static String[] winner(String arr[], int n)
    {
        // add your code
        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        HashMap<String, Integer> map = new HashMap<>();
        String[] ans = new String[2];
        for(int i=0; i<n; i++)
        {
            if(map.get(arr[i])==null)
            {
                map.put(arr[i], 1);
            }
            else
            {
                map.put(arr[i], map.get(arr[i])+1);

            }
            if(max<map.get(arr[i]))
            {
                max=map.get(arr[i]);
                ans[0]=arr[i];
                ans[1]=Integer.toString(max);
            }
        }
        return ans;

    }
}
