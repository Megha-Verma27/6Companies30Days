package com.company;
import java.util.*;
public class DecodeString {
    static String decodedString(String str){
        // code here
        Stack<Character> s = new Stack<>();
        String temp="";
        for(char ch: str.toCharArray())
        {
            if(ch==']')
            {
                temp ="";
                while(!s.isEmpty()&&s.peek()!='[')
                {
                    temp=s.pop()+temp;
                }
                if(!s.isEmpty()&&s.peek()=='[')
                    s.pop();
                String num="";
                while(!s.isEmpty()&&Character.isDigit(s.peek()))
                {

                    num=s.pop()+num;

                }
                int n = Integer.parseInt(num);
                temp = temp.repeat(n);
                for(int i=0; i<temp.length(); i++)
                {
                    s.push(temp.charAt(i));
                }
            }
            else
            {
                s.push(ch);
            }
        }
        return temp;

    }
}
