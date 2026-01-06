package com.arrays.basics;

import java.util.Arrays;

public class RotateArrayInNPlaces {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 4, 5, 7};
        int n = arr.length;
        int d = 3;

        d = d % n;
        if (d == 0) return;

        //rotateBruteApproach(arr, n, d);
        rotateArrayOptimal(arr, n, d);

    }

    private static void rotateBruteApproach(int[] arr, int n, int d) {
        //temp initialization
        int temp[] = new int[d];
        for(int i=0; i<d; i++){
            temp[i] = arr[i];
        }
        System.out.println(Arrays.toString(temp));

        for(int i = d; i<n; i++){
            arr[i-d] = arr[i];
        }

        System.out.println(Arrays.toString(arr));

        for(int i = n-d; i<n; i++){
            arr[i] = temp[i-(n-d)];
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void rotateArrayOptimal(int[] arr, int n, int d){
        rotateArray(arr, 0, d-1);
        rotateArray(arr, d, n-1);
        rotateArray(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] rotateArray(int[] arr, int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }


}
//Brute:
//TC: O(d) + O(n-d) + O(d) = O(n+d)
//SC: O(d) -> extra space