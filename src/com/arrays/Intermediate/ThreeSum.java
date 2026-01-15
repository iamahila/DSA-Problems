package com.arrays.Intermediate;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = bruteApproach(arr);
        System.out.println(result);
    }

    private static List<List<Integer>> bruteApproach(int arr[]){
        Set<List<Integer>> values = new HashSet<>();

            for(int i=0; i<arr.length; i++){
                for(int j=i+1; j<arr.length; j++){
                    for(int k=j+1; k<arr.length; k++){
                         if(arr[i] + arr[j] + arr[k] == 0){
                             List<Integer> val = Arrays.asList(arr[i], arr[j], arr[k]);
                             Collections.sort(val);
                             values.add(val);
                         }
                    }
                }
            }

        return new ArrayList<>(values);
    }

    private static List<List<Integer>> twoPointerApproach(int arr[]){

        Arrays.sort(arr);
        Set<List<Integer>> values = new HashSet<>();
        for(int i=0; i<arr.length; i++){

            if(i > 0 && arr[i] == arr[i-1]) continue;

            int left = i+1;
            int right = arr.length - 1;


            while(left < right){

                int sum = arr[i] + arr[left] + arr[right];

                if(sum == 0){
                    List<Integer> triplets = Arrays.asList(arr[i], arr[left], arr[right]);
                    left++;
                    right--;

                    Collections.sort(triplets);
                    values.add(triplets);

                    while(left<right && arr[left]==arr[left-1]) left++;
                    while(left<right && arr[right]==arr[right+1]) right--;
                }

                if(sum < 0){
                    left++;
                }

                if(sum > 0){
                    right--;
                }
            }
        }
        return new ArrayList<>(values);
    }
}