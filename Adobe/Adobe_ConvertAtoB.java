package com.company;

import java.util.ArrayList;

public class Adobe_ConvertAtoB {
    static int minInsAndDel(int[] A, int[] B, int N, int M) {
        // code here
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int c=0;
        for(int i=0; i<A.length; i++)
        {
            if(delete(B, 0, B.length-1, A[i])!=-1)
            {
                a.add(A[i]);
            }
            else
            {
                c++;
            }
        }
        if(a.size()==0)
        {
            return c+B.length;
        }
        list.add(a.get(0));
        for(int i=1; i<a.size(); i++)
        {
            if(list.get(list.size()-1)<a.get(i))
                list.add(a.get(i));
            else
            {
                int index = upperBound(list, 0, list.size()-1, a.get(i));
                if(list.size()==0)
                {
                    list.add(0, a.get(i));
                }
                else list.set(index, a.get(i));
            }
        }
        int temp = a.size()-list.size();
        c=c+temp;
        temp = B.length-list.size();
        c+=temp;
        return c;
    }
    static int delete(int[] b, int low, int high, int val)
    {
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(b[mid]==val)
                return mid;
            else if(b[mid]<val)
                low=mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
    static int upperBound(ArrayList<Integer> list , int low, int high, int val)
    {
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            int t = list.get(mid);
            if(t==val)
                return mid;
            else if(t<val)
                low=mid+1;
            else
                high = mid-1;
        }
        return low;
    }
}
