package com.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

       // traditionReverse(arr);
        twoPointerReverse(arr);

    }

    private static void traditionReverse(int[] arr){
        int[] reversedArray = new int[arr.length];
        System.out.println("Original: " + Arrays.toString(arr));
        int count = 0;
        for(int i=arr.length-1; i>=0; i--){
            reversedArray[count] = arr[i];
            count++;
        }
        System.out.println("Reversed: " + Arrays.toString(reversedArray));
    }

    private static void twoPointerReverse(int[] arr){
        //{1, 2, 3, 4, 5}

        int left = 0;
        int right = arr.length-1;


        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));

    }
}
