package com.company;

public class Amazon_ColumnName {
    String colName (long n)
    {
        // your code here
        long temp = n;
        String ans="";
        while(temp>0)
        {
            ans=charOf(temp%26)+ans;
            temp = (temp-1)/26;
        }
        return ans;

    }
    public char charOf(long val){
        if(val==0)
            return('Z');
        else
            return((char)(64+val));

    }
}
