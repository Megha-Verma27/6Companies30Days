package com.company;

public class Walmart_MaximumHeightTree {
    static int height(int n){
        // code here
        int sq = (int)Math.sqrt(n*2);
        //System.out.println(sq);
        if(sq*(sq+1)<=2*n)
        {
            return sq;
        }
        return sq-1;

    }
}
