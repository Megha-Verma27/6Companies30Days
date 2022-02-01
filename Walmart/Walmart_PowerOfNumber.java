package com.company;

public class Walmart_PowerOfNumber {
    long power(int x,int y)
    {
        //Your code here
        long temp;
        if( y == 0)
            return 1;
        temp = power(x, y / 2);
        if (y % 2 == 0)
            return (temp%1000000007*temp%1000000007);
        else
            return (x%1000000007*temp%1000000007*temp%1000000007);

    }
}
