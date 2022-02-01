package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Walmart_KthLargest {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> queue = new PriorityQueue<String>(new Comparator<String>(){
            public int compare(String s1, String s2){
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }else{
                    return s1.length() > s2.length()? 1: -1;
                }
            }
        });
        for(String str: nums){
            queue.add(str);
            if(queue.size() > k){
                queue.poll();
            }
        }
        return queue.poll();
    }
}
