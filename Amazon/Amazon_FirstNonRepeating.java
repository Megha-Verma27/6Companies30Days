package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Amazon_FirstNonRepeating {
    public String FirstNonRepeating(String str)
    {

        int[] charCount = new int[26];
        String ans="";
        Queue<Character> q = new LinkedList<Character>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            charCount[ch - 'a']++;
            while (!q.isEmpty()) {
                if (charCount[q.peek() - 'a'] > 1)
                    q.remove();
                else {
                    break;
                }
            }
            if (q.isEmpty())
                ans+='#';
            else
                ans+=q.peek();
        }
        return ans;
    }
}
