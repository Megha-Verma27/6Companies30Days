package com.company;

import java.util.ArrayList;

public class Microsoft_GenerateBinaryNum {
    static ArrayList<String> generate(int N)
    {
        // Your code here
        ArrayList<String> list = new ArrayList<>();
        for(int i=1; i<=N; i++)
        {
            list.add(Integer.toBinaryString(i));
        }
        return list;
    }
}
