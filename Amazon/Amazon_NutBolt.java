package com.company;

import java.util.HashMap;
import java.util.Map;

public class Amazon_NutBolt {
    void matchPairs(char nuts[], char bolts[], int n) {
        // code here
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(map.get(nuts[i])==null)
                map.put(nuts[i],1);
            else
                map.put(nuts[i], map.get(nuts[i])+1);
        }
        String str = "!#$%&*@^~";
        int i=0;
        for(char ch: str.toCharArray())
        {
            if(map.get(ch)!=null)
            {
                int x=map.get(ch);
                while(x!=0)
                {
                    nuts[i]=ch;
                    i++;
                    x--;
                }
            }
        }
        for(int j=0; j<n; j++)
        {
            bolts[j]=nuts[j];
        }
    }
}
