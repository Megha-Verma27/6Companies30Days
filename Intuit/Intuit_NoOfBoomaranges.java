package com.company;

import java.util.HashMap;

public class Intuit_NoOfBoomaranges {
    public int numberOfBoomerangs(int[][] points) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = points.length;
        int ans=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==j)
                    continue;
                int dis = getDistance(points[i], points[j]);
                map.put(dis, map.getOrDefault(dis, 0)+1);
            }
            for(Integer dis : map.values())
            {
                ans+=dis*(dis-1);
            }
            map.clear();
        }
        return ans;

    }
    public int getDistance(int[] p1, int[] p2)
    {
        int a = p1[0] - p2[0];
        int b = p1[1] - p2[1];

        return a*a + b*b;
    }
}
