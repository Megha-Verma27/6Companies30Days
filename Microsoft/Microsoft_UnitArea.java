package com.company;

public class Microsoft_UnitArea {
    boolean visited[][];
    public int dfs(int[][] grid , int r , int c)
    {
        if(r<0||c<0||r>=grid.length||c>=grid[r].length||visited[r][c]||grid[r][c]==0)
            return 0;
        visited[r][c]=true;
        int s=1;
        for(int i=r-1; i<=r+1; i++)
        {
            for(int j = c-1; j<=c+1; j++)
            {
                if(i!=r || j!=c)
                {
                    s+=dfs(grid, i, j);
                }
            }
        }
        return s;
    }
    public int findMaxArea(int[][] grid)
    {
        // Code here
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        visited = new boolean[m][n];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(grid[i][j]==1)
                {
                    int size = dfs(grid, i, j);
                    ans= Math.max(ans, size);
                }
            }
        }
        return ans;

    }
}
