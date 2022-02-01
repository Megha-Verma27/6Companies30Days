package com.company;
import java.util.*;
public class Microsoft_PrerequisiteTask {
    public boolean canFinish(int num, int[][] pre) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] in = new int[num];
        for(int i=0; i<num; i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<pre.length; i++)
        {
            adj.get(pre[i][1]).add(pre[i][0]);
            in[pre[i][0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<num; i++)
        {
            if(in[i]==0)
                q.add(i);
        }
        int c=0;
        while(!q.isEmpty())
        {
            int temp = q.poll();
            c++;
            for(int ch: adj.get(temp))
            {
                in[ch]--;
                if(in[ch]==0)
                    q.add(ch);
            }
        }
        if(c==num)
            return true;
        return false;
    }
}
