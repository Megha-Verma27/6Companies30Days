package com.company;

import java.util.Arrays;

public class Intuit_NoOfProvices {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
        int c=0;
        for(int i=0; i<n; i++)
        {
            if(!visited[i])
            {
                c++;
                dfs(isConnected, visited, i, n);
            }
        }
        return c;
    }
    public void dfs(int[][] isConnected, boolean[] visited, int i, int n)
    {
        visited[i]=true;
        for(int j=0; j<n; j++)
        {
            if(isConnected[i][j]==1 && !visited[j])
            {
                dfs(isConnected, visited, j, n);
            }
        }
    }
}
