package com.arrays;

public class MaxArrayValue {
    public static void main(String[] args) {
        int [] values = {12, 15, 323, 82};
        max(values);
        maxValueWithinRange(values, 0, 1);
    }

    private static void max(int[] values){
        int max = values[0];
        for(int i=0; i<values.length; i++){
            if(values[i] > max){
                max = values[i];
            }
        }

        System.out.println(max);
    }

    private static void maxValueWithinRange(int[] arr, int index1, int index2){
        int max = arr[index1];
        for(int i=index1; i<=index2; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
