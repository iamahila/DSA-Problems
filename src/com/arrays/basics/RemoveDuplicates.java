package com.arrays.basics;

//Remove Duplicates in Sorted Array
public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4, 4 ,6};

        //two pointers approach

        int i = 0;


        for(int j=0; j<arr.length; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }

        System.out.println(i+1);

    }
}
