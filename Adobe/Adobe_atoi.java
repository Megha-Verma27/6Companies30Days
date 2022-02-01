package com.company;

import java.util.ArrayList;

public class Adobe_atoi {
    int atoi(String str) {
        // Your code here
        int ans = 0;
        int i=0;

        if(str.charAt(0)=='-')
        {
            i++;
        }
        for(; i<str.length();i++)
        {
            if(str.charAt(i)>='0'&&str.charAt(i)<='9')
            {
                ans = ans*10 + (str.charAt(i)-'0');
            }
            else
            {
                return -1;
            }
        }
        if(str.charAt(0)=='-')
        {
            ans = ans*(-1);
        }
        return ans;

    }

}
