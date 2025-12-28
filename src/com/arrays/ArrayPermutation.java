package com.arrays;

import java.util.Arrays;

//LC: 1920
public class ArrayPermutation {
    public static void main(String[] args) {
        //Input: [0,2,1,5,3,4]
    }

    public int[] buildArray(int[] nums) {
        int[] newArray = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            newArray[i] = nums[nums[i]];
        }

        return newArray;
    }
}
