package com.company;

import java.util.*;

public class PrintAnagramTogether {
    public List<List<String>> Anagrams(String[] word) {
        // Code here
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(String str : word)
        {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String s = String.valueOf(arr);
            //System.out.println(s);
            if(!map.containsKey(s))
            {
                map.put(s, new ArrayList<>());
                map.get(s).add(str);
            }
            else
            {
                map.get(s).add(str);
            }
        }

        List<List<String>> list = new ArrayList<>();
        for (Map.Entry<String, ArrayList<String >> ee : map.entrySet()) {
            String key = ee.getKey();
            List<String > values = ee.getValue();
            list.add(values);
        }
        return list;
    }
}
