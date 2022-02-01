package com.company;

public class Intuit_findMissingNo {
    public int missingNumber(String s)
    {
        //add code here.
        int n = s.length();
        int c=0;
        int ans=-1;
        int x=0;
        for(int i=1; i<=6&&n>=i; i++)
        {
            int j=i;
            int k=i;
            int prev = Integer.parseInt(s.substring(0, 0+i));
            x=0;
            ans=-1;
            while(j+k<=n)
            {
                if(prev== 9 || prev==99||prev==999||prev==9999||prev==99999||prev==999999)
                {
                    k++;
                }
                int cur=-1;
                if(j+k<=n){
                    cur = Integer.parseInt(s.substring(j, j+k));
                    //System.out.println(cur);
                }
                else
                {
                    x=1;
                    break;
                }
                if(cur==prev+1)
                {
                    prev=cur;
                }
                else if(c==0&&cur==prev+2)
                {
                    c=1;
                    ans=prev+1;
                    prev=cur;
                }
                else
                {
                    if(prev== 8 || prev==98||prev==998||prev==9998||prev==99998||prev==999998)
                    {
                        k++;
                        cur = Integer.parseInt(s.substring(j, j+k));
                        if(c==0&&cur==prev+2)
                        {
                            c=1;
                            ans=prev+1;
                            prev=cur;
                        }
                    }
                    else{
                        x=1;
                        break;
                    }
                }
                j=j+k;

            }
            if(x==0 && ans!=-1)
                return ans;
        }
        return -1;

    }
}
