package com.company;
import java.util.*;
public class Adobe_SmallestRangeInKLists {
    class element implements Comparable<element> {
        int value;
        int row;
        int index;

        element(int value, int row, int index) {
            this.value = value;
            this.row = row;
            this.index = index;
        }

        public int compareTo(element obj) {
            return this.value - obj.value;
        }
    }
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<element> pq = new PriorityQueue<element>();
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.size(); i++)
        {
            pq.add(new element(nums.get(i).get(0), i, 0));
            if(max<nums.get(i).get(0))
                max=nums.get(i).get(0);
        }
        int s = (max-pq.peek().value)+1;
        int left = pq.peek().value;
        int right = max;
        while(true)
        {
            element temp = pq.poll();
            if(temp.index+1<nums.get(temp.row).size())
            {
                int val = nums.get(temp.row).get(temp.index+1);
                if(val>max)
                {
                    max=val;
                }
                pq.add(new element(val, temp.row, temp.index+1));
                if(max-pq.peek().value+1<s)
                {
                    s=max-pq.peek().value+1;
                    left=pq.peek().value;
                    right= max;
                }
            }
            else
                break;
        }
        int[] ans = new int[2];
        ans[0]=left;
        ans[1]=right;
        return ans;

    }

}
