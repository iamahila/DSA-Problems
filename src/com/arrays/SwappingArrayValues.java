package com.arrays;

import java.util.Arrays;

public class SwappingArrayValues {
    public static void main(String[] args) {
        int[] arr = {0,12,15,18,22};
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
