package com.company;

public class Walmart_RemoveColor {
    public boolean winnerOfGame(String colors) {
        char[] arr = colors.toCharArray();
        int n = arr.length;
        int c=0, d=0, a=0, b=0;
        int i=0;

        while(i<n)
        {
            while(i<n&&arr[i]=='A')
            {
                c++;
                i++;
            }
            if(c>=3)
            {
                a+=c-2;
            }
            c=0;
            while(i<n&&arr[i]=='B')
            {
                d++;
                i++;
            }
            if(d>=3)
            {
                b+=d-2;
            }
            d=0;
        }
        if(a>b)
            return true;
        return false;
    }
}
