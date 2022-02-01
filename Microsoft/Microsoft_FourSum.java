package com.company;

import java.util.*;

public class Microsoft_FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1; j<nums.length; j++){
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                int low = j+1;
                int high = nums.length-1;
                while(low<high){
                    int total = nums[i]+nums[j]+nums[low]+nums[high];
                    if(total == target){
                        list.add(List.of(nums[i], nums[j], nums[low], nums[high]));
                        low++;
                        high--;
                        while(high>low && nums[low] == nums[low-1]) low++;
                        while(high>low && nums[high] == nums[high+1]) high--;
                    }else if(total > target){
                        high--;
                    }else{
                        low++;
                    }
                }
            }
        }
        return list;
    }
}
