package com.company;

public class Adobe_AmendSentence {
    public String amendSentence(String s){
        //code here

        char[] arr = s.toCharArray();
        String ans ="";
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>='a'&&arr[i]<='z')
            {
                ans+=arr[i];
            }
            else
            {
                if(i!=0)
                    ans=ans+' '+(char)(arr[i]+32);
                else
                    ans= ans+(char)(arr[i]+32);
            }
        }
        return ans;
    }
}
