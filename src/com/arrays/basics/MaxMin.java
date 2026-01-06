package com.arrays.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {177, 2, 8, 4, 23, 496, 12, 48};
        streamApproach(arr);
        optimalApproach(arr);


    }

    private static void streamApproach(int[] arr){
        //stream

        int min = Arrays.stream(arr)
                .boxed()
                .min(Integer::compareTo).get();

        int max = Arrays.stream(arr)
                .boxed()
                .max(Integer::compareTo).get();

        System.out.println(min +" " + max);
    }

    private static void optimalApproach(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
           if(arr[i] > max){
               max = arr[i];
           }
           else if(arr[i] < min){
               min = arr[i];
           }
        }

        System.out.println(min + " " + max);
    }
}

//TC: O(n)
//SC: O(1)
