package com.arrays.basics;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {177, 2, 8, 4, 23, 496, 12, 48};

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && secondLargest < arr[i]){
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);

    }
}
//third largest, same find 1, 2 then use same approach to find 3rd largest.

//TC: O(N)
//SC: O(1)