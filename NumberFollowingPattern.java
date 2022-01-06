package com.company;
import java.util.*;

public class NumberFollowingPattern {
    static String printMinNumberForPattern(String S){
        // code here
        String result = "";

        Stack<Integer> s = new Stack<Integer>();

        for (int i = 0; i <= S.length(); i++) {

            s.push(i + 1);

            if (i == S.length() || S.charAt(i) == 'I') {

                while (!s.empty()) {

                    result += String.valueOf(s.peek());

                    s.pop();
                }
            }
        }

        return result;

    }
}
