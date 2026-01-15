package com.arrays.Intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int arr1[] = {2,6,5,8,11};
        int n = 14;

        //bruteForceApproach(arr1, n);
        //int result[] = betterApproach(arr1, n);
        int result[] = optimalApproach(arr1, n);
        System.out.println(Arrays.toString(result));

    }

    private static void bruteForceApproach(int arr[], int n){
        for(int i=0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == n){
                    System.out.println(i +" "+ j);
                    return;
                }
            }
        }
    }

    private static int[] betterApproach(int arr[], int n){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i], i);
            int sub = n - arr[i];
            if(map.containsKey(sub)){
                return new int[]{i, map.get(sub)};
            }
        }
        return new int[]{-1, -1};
    }

    private static int[] optimalApproach(int arr[], int n){
        //2 pointer
        int valueArray[][] = new int[arr.length][2];

        int left = 0;
        int right = arr.length-1;

        for(int i=0; i<arr.length; i++){
            valueArray[i][0] = arr[i];
            valueArray[i][1] = i;
        }

        Arrays.sort(valueArray, Comparator.comparingInt(a -> a[0]));

        while(left < right){
            int sum = valueArray[left][0] + valueArray[right][0];

            if(sum == n){
                return new int[]{valueArray[left][1], valueArray[right][1]};
            }
            else if(sum < n){
                left = left+1;
            }
            else{
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
