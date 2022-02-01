package com.company;

public class Walmart_divideTwoInteger {
    public int divide(int dividend, int divisor) {

        if(dividend == Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        int sign =1;
        if(dividend<0&&divisor<0 || dividend>=0&&divisor>0)
            sign=1;
        else
            sign =-1;
        int q = 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        while(dividend - divisor >= 0) {
            int temp = divisor;
            int c=0;
            while (dividend - temp >= 0) {
                temp = temp << 1;
                c++;
            }
            temp = divisor;
            dividend = dividend - (temp << c-1);
            q += 1 << c-1;
        }
        if(sign == -1)
            return -q;
        return q;


    }
}
