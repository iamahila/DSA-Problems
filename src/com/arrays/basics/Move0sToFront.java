package com.arrays.basics;

import java.util.Arrays;



public class Move0sToFront {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 0, 0, 4, 5, 0, 6, 0};

        //bruteMove0s(arr);
        optimalApproachMove0s(arr);
    }

    private static void optimalApproachMove0s(int[] arr) {
        int j = 0;

       // int arr[] = {1, 2, 3, 0, 0, 4, 5, 0, 6, 0};

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void bruteMove0s(int[] arr) {
        //step1 fetch non 0s to temp

        int temp[] = new int[arr.length];

        int counter = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                temp[counter] = arr[i];
                counter++;
            }
        }

        for(int i=0; i<temp.length; i++){
            arr[i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}

//Brute - TC: O(n)+O(n) = O(2n), Space = O(n)
//Optimal - TC: O(n), space = O(1)
