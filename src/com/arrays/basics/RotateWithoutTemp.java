package com.arrays.basics;

import java.util.Arrays;

public class RotateWithoutTemp {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

       // leftRotateBrute(arr, 3);
        rightRotateBrute(arr, 3);
    }

    private static void leftRotateBrute(int arr[] , int d){

        int n = arr.length;
        for(int i=0; i<d; i++){
            int first = arr[0];

            for(int j=1; j<=n-1; j++){
                arr[j-1] = arr[j];
            }

            arr[n-1] = first;

        }

        System.out.println(Arrays.toString(arr));
    }

    private static void rightRotateBrute(int arr[], int d){
        int n = arr.length;

        //{1, 2, 3, 4, 5, 6, 7};
        //{5, 6, 7, 1, 2, 3, 4};

        for(int i=0; i<d; i++){
            int last = arr[n-1];

            for(int j=n-1; j>0; j--){
                arr[j]= arr[j-1];
            }
            arr[0] = last;
        }

        System.out.println(Arrays.toString(arr));
    }

}
