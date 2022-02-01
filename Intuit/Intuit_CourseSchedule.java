package com.company;

import java.util.*;


public class Intuit_CourseSchedule {
    public int[] findOrder(int num, int[][] pre) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<num; i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        int[] indegree = new int[num];
        for(int i=0; i<pre.length; i++)
        {
            adj.get(pre[i][1]).add(pre[i][0]);
            indegree[pre[i][0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<num; i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        int c=0;
        while(!q.isEmpty())
        {
            int temp = q.poll();
            c++;
            list.add(temp);
            for(int ch:adj.get(temp))
            {
                indegree[ch]--;
                if(indegree[ch]==0)
                    q.add(ch);
            }
        }
        int[] ans = new int[num];
        if(c==num){
            for(int i=0; i<num; i++){
                ans[i]=list.get(i);
            }
            return  ans;
        }
        return new int[0];

    }
}
