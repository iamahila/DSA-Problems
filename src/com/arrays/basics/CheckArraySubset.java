package com.arrays.basics;

import java.util.Arrays;

public class CheckArraySubset {
    public static void main(String[] args) {
        int arr1[] = {1,3,4,5,2};
        int arr2[] = {2,4,3,1,7,5,15};

        if(arr1.length > arr2.length) System.out.println("Not subset");

        //bruteApproach(arr1, arr2);
        binarySearchApproach(arr1, arr2);
    }

    private static void bruteApproach(int arr1[], int arr2[]){
        for(int i=0; i<arr1.length; i++){
            boolean present = false;
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    present = true;
                    break;
                }
            }

            if(!present) System.out.println("Not subset");
        }
        System.out.println("subset");
    }

    private static void binarySearchApproach(int arr1[], int arr2[]){

        Arrays.sort(arr2);


        for(int i=0; i<arr1.length; i++){
            int start = 0;
            int end = arr2.length - 1;
            boolean present = false;

            while(start<=end){
                int mid = start + (end - start) / 2;

                if(arr2[mid] == arr1[i]){
                    present = true;
                    break;
                }

                else if(arr2[mid] < arr1[i])
                    start = mid+1;

                else
                    end = mid - 1;
            }

            if(!present){
                System.out.println("Not subset");
                break;
            }
        }

        System.out.println("subset");
    }
}
