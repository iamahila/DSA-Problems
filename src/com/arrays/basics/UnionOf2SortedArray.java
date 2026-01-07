package com.arrays.basics;

import java.util.*;

public class UnionOf2SortedArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 4, 5};
        int arr2[] = {2, 2, 4, 4, 6, 7};

        //bruteforce(arr1, arr2);
        optimalApproach2Pointer(arr1, arr2);
    }

    private static void optimalApproach2Pointer(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;
        List<Integer> result = new ArrayList<>();

        while(i < n && j < m){

            if(arr1[i]<=arr2[j]){
                if(result.isEmpty() || result.getLast() != arr1[i]){
                    result.add(arr1[i]);
                }
                i++;
            }
            else{
                if(result.isEmpty() || result.getLast() != arr2[j]){
                    result.add(arr2[j]);
                }
                j++;
            }
        }

        while(i < n){
            if(result.isEmpty() || result.getLast() != arr1[i]){
                result.add(arr1[i]);
            }
            i++;
        }

        while(j < m){
            if(result.isEmpty() || result.getLast() != arr2[j]){
                result.add(arr2[j]);
            }
            j++;
        }
        System.out.println(Arrays.toString(result.toArray()));
    }

    private static void bruteforce(int arr1[], int arr2[]){
        LinkedHashSet<Integer> values = new LinkedHashSet<>();
        for(int i=0; i<arr1.length; i++){
            values.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            values.add(arr2[i]);
        }

        //System.out.println(values.toString());

        int i = 0;
        int union[] = new int[values.size()];
        for(Integer val : values){
            union[i] = val;
            i++;
        }

        System.out.println(Arrays.toString(union));
    }
}
