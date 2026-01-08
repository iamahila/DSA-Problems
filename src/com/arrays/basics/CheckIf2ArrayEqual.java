package com.arrays.basics;

import java.util.HashMap;
import java.util.Map;

public class CheckIf2ArrayEqual {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 2};
        int arr2[] = {2, 1, 2, 3};

        Map<Integer, Integer> values = new HashMap<>();

        if(arr1.length != arr2.length) System.out.println("Not equal");

        for(Integer num: arr1){
            values.put(num, values.getOrDefault(num, 0) + 1);
        }

        for(Integer num: arr2){
            if(!values.containsKey(num)) System.out.println("Not equal");

            values.put(num, values.get(num) - 1);

            if(values.get(num) == 0){
                values.remove(num);
            }
        }

        if(values.isEmpty())
            System.out.println("Equal");
        else
            System.out.println("Not equal");

    }
}
