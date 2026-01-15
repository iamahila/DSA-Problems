package com.arrays.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Count Elements With Maximum Frequency
public class CountFrequencyOfElements {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,4};

        Map<Integer, Integer> values = new HashMap<>();

        for(int num : arr){
            values.put(num, values.getOrDefault(num, 0) + 1);
        }

        int max = 0;
        for(Map.Entry<Integer, Integer> map: values.entrySet()){
            max = Math.max(max, map.getValue());
        }

        int count = 0;
        for(Map.Entry<Integer, Integer> map: values.entrySet()){
            if(map.getValue() == max)
                count++;
        }

        System.out.println(count*max);


    }
}
