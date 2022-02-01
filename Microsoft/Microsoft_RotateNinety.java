package com.company;

public class Microsoft_RotateNinety {
    static void rotate(int matrix[][])
    {
        // Code Here
        int n = matrix.length;
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        int high = n-1, mid=(n-1)/2;
        for(int i=0; i<=mid; i++)
        {
            for(int j=0; j<n; j++)
            {
                int temp =matrix[i][j];
                matrix[i][j]=matrix[high-i][j];
                matrix[high-i][j]=temp;
            }
        }
    }
}
