package com.company;
import java.util.*;
public class Microsoft_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> list = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        int top = 0, down = m-1, right = n-1, left=0, i=0, j=0;
        int t = n*m;
        while(top<=down && left<=right)
        {
            i=top;
            for(j=left; list.size()!=t&&j<=right; j++)
            {
                list.add(arr[i][j]);
            }
            //list.add(100);
            top++;
            j=right;
            for(i=top; list.size()!=t&&i<=down; i++)
            {
                list.add(arr[i][j]);
            }
            //list.add(200);
            right--;
            i=down;
            for(j=right; list.size()!=t&&j>=left; j--)
            {
                list.add(arr[i][j]);
            }
            //list.add(300);
            down--;
            j=left;
            for(i=down; list.size()!=t&&i>=top; i--)
            {
                list.add(arr[i][j]);
            }
            //list.add(400);
            left++;

        }
        return list;
    }
}
