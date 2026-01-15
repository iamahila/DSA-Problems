package com.arrays.Intermediate;

import java.util.*;

public class TopKElements {
    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        int k = 2;

        Map<Integer, Integer> freqMap = new HashMap<>();
                //1 -> 3, 2 -> 2, 3 -> 1
        for(int i=0; i<nums.length; i++){
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }

        //bucket sort
        // consider same num appeared 6 times -> length of array.
        // then if we mention the bucket size as 6 we cant get 6th index. for size 6 we have only 5 index.

        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for(Map.Entry<Integer, Integer> map : freqMap.entrySet()){
            int freq = map.getValue();
            if(buckets[freq] == null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(map.getKey());
        }

        int[] result = new int[k];

        int index = 0;

        for(int i = buckets.length - 1; i>=0 && index<k; i--){

           if(buckets[i] != null){
               for(int num: buckets[i]){
                   result[index++] = num;
                   if(index == k) break;
               }
           }

        }

        System.out.println(Arrays.toString(result));



    }
}
