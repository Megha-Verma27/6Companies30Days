package com.company;
import java.util.*;
public class Intuit_AtlanticPacificWaterFlow {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        List<List<Integer>> result = new ArrayList<>();
        if(heights.length == 0 || heights[0].length == 0){
            return result;
        }

        int row = heights.length;
        int col = heights[0].length;

        boolean[][] pacific = new boolean[row][col];
        boolean[][] atlantic = new boolean[row][col];

        //traverse from first and last column
        for(int i =0 ; i< row; i++){
            dfs(heights, pacific, Integer.MIN_VALUE, i, 0);
            dfs(heights, atlantic, Integer.MIN_VALUE, i, col-1);
        }

        //traverse from first and last row
        for(int j =0 ; j< col; j++){
            dfs(heights, pacific, Integer.MIN_VALUE, 0, j);
            dfs(heights, atlantic, Integer.MIN_VALUE, row-1, j);
        }

        for(int i =0 ; i< row; i++){
            for(int j =0 ; j< col; j++){
                if(pacific[i][j] && atlantic[i][j]){
                    result.add(Arrays.asList(new Integer[]{i,j}));
                }
            }
        }

        return result;
    }

    public void dfs(int[][] heights, boolean[][] visited,int height, int x, int y  ){
        if(x < 0 || x >= heights.length || y< 0 || y>= heights[0].length || heights[x][y] < height || visited[x][y] ){
            return;
        }
        visited[x][y] = true;

        dfs(heights, visited, heights[x][y], x+1, y);
        dfs(heights, visited, heights[x][y], x-1, y);
        dfs(heights, visited, heights[x][y], x, y+1);
        dfs(heights, visited, heights[x][y], x, y-1);

    }
}
