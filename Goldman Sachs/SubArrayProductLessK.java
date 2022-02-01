package com.company;

public class SubArrayProductLessK {
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        int l =0, r=0,c=0;
        long p =1;
        for(int i=0; i<n; i++)
        {
            p=p*a[i];
            if(p<k)
            {
                c+=(r-l+1);
            }
            else
            {
                while(l<r&&p>=k)
                {
                    p=p/a[l];
                    l++;
                }
                if(p<k)
                {
                    c+=(r-l+1);
                }

            }
            r++;
        }
        return c;
    }
}
