package com.company;

public class RunLengthEncoding {
    String encode(String str)
    {
        //Your code here
        int c=1;
        String ans="";
        for(int i=0; i<str.length()-1; i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                c++;
            }
            else
            {
                ans=ans+str.charAt(i)+Integer.toString(c);
                c=1;
            }
        }
        ans=ans+str.charAt(str.length()-1)+Integer.toString(c);
        return ans;
    }
}
