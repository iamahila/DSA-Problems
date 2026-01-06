package com.arrays.basics;

import java.util.Arrays;

public class RotateArrayRight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int d = 3;

        if (n == 0) return;

        d = d % n;
        if (d == 0) return;

      //  rotateBrute(arr, n, d);
        rotateOptimal(arr, n, d);
    }

    private static void rotateBrute(int arr[], int n, int d){
        int[] temp = new int[d];

        for(int i=0; i<d; i++){
            temp[i] = arr[n-d+i];
        }
        System.out.println(Arrays.toString(temp));

        for(int i=n-d-1; i>=0; i--){
            arr[i+d] = arr[i];
        }
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i<d; i++){
            arr[i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void rotateOptimal(int[] arr, int n, int d) {


        reverse(arr, 0, n - d - 1);
        reverse(arr, n - d, n - 1);
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
