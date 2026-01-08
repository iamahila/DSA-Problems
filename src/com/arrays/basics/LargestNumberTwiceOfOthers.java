package com.arrays.basics;

import java.util.HashMap;
import java.util.Map;

public class LargestNumberTwiceOfOthers {
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 3};

        int max = 0;
        int slargest = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                slargest = max;
                max = arr[i];
            }
            if(arr[i] > slargest && arr[i] < max){
                slargest = arr[i];
            }
        }

        System.out.println(2 * slargest == max);

    }
}
