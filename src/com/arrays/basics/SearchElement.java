package com.arrays.basics;

public class SearchElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 23, 44, 120};
        int n = 23;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == n){
                System.out.println(i);
            }
        }

    }
}
