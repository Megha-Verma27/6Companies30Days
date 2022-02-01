package com.company;

public class Intuit_WordSearch {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(board[i][j]==word.charAt(0)&&dfs(i, j, 0, board, word))
                    return true;
            }
        }
        return false;
    }
    public boolean dfs(int i, int j, int count, char[][] arr, String word)
    {
        if(count == word.length())
            return true;
        if(i<0 || i>=arr.length || j<0 || j>=arr[0].length || word.charAt(count)!=arr[i][j])
            return false;
        char temp = arr[i][j];
        arr[i][j]= ' ';
        boolean found = dfs(i-1, j, count+1, arr, word) || dfs(i+1, j, count+1, arr, word)||
                dfs(i, j-1, count+1, arr, word)||dfs(i, j+1, count+1, arr, word);
        arr[i][j]=temp;
        return found;
    }
}
