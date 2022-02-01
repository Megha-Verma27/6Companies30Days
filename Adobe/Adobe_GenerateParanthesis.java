package com.company;

import java.util.*;

public class Adobe_GenerateParanthesis {
    private static int N;
    private static List<String> list;

    public void generateParenthesis(String s, int len, int sum){
        if(len == 2*N && sum==0){
            list.add(s); return ;
        }
        if(len == 2*N)return ;
        if(sum<=N)generateParenthesis(s+"(", len+1, sum+1);
        if(sum>0)generateParenthesis(s+")", len+1, sum-1);
    }

    public List<String> generateParenthesis(int n) {
        N=n;
        list = new ArrayList<String>();
        generateParenthesis("", 0 , 0);
        return list;
    }
}
