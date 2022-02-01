package com.company;
import java.util.*;
public class Microsoft_WordPhoneDigit {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> list = new ArrayList<>();
        if(digits.length()==0)
        {
            return list;
        }
        backtrack(map, digits.toCharArray(), 0, new StringBuilder(), list);
        return list;
    }
    public void backtrack(Map<Character, String> map, char[] arr , int pos, StringBuilder str, List<String> list)
    {
        if(str.length()==arr.length)
        {
            list.add(str.toString());
            return;
        }
        String s = map.get(arr[pos]);
        for(int i=0; i<s.length(); i++)
        {
            str.append(s.charAt(i));
            backtrack(map, arr, pos+1,str , list);
            str.deleteCharAt(str.length()-1);
        }
    }
}
