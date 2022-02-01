package com.company;
import java.util.*;

public class Microsoft_BridgeEdge {
    static boolean check ;
    static void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int[] tin, int[] low, int parent , int node , int timer, int[] arr)
    {
        visited[node]=true;
        tin[node]=timer++;
        low[node] = tin[node];
        for(int it : adj.get(node))
        {
            if(it==parent)
                continue;
            if(!visited[it])
            {
                dfs(adj, visited, tin , low, node, it, timer, arr);
                low[node] = Math.min(low[node], low[it]);
                if(low[it]>tin[node])
                {
                    int[] temp = new int[2];
                    temp[0]=it;
                    temp[1]=node;
                    Arrays.sort(temp);
                    //System.out.println(temp[0]+" "+temp[1]);
                    if(arr[0]==temp[0] && arr[1]==temp[1]){
                        check= true;
                    }

                }
            }
            else
            {
                low[node] = Math.min(low[node], tin[it]);
            }
        }

    }
    static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
        // code here
        int[] tin = new int[V];
        int[] low = new int[V];
        boolean[] visited = new boolean[V];
        //Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];
        arr[0]=c;
        arr[1]=d;
        Arrays.sort(arr);
        Arrays.fill(visited, false);
        int timer =0;
        check = false;
        for(int i=0; i<V; i++)
        {
            if(!visited[i])
            {
                dfs(adj, visited, tin , low, -1, i, timer, arr);
                if(check)
                    return 1;

            }
        }
        return 0;



    }
}
