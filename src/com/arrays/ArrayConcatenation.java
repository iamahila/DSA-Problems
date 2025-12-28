package com.arrays;

//1929
public class ArrayConcatenation {
    public static void main(String[] args) {
        ArrayConcatenation arrayConcatenation = new ArrayConcatenation();
        arrayConcatenation.getConcatenation(new int[]{1,2,1});
    }

    public int[] getConcatenation(int[] nums) {
        int numsLength = 2 * (nums.length);
        int[] newArray = new int[numsLength];

        int counter = 0;

        while(counter < numsLength){
            if(counter < nums.length){
                newArray[counter] = nums[counter];
            }
            else{
                int newIndex = counter - nums.length;
                newArray[counter] = nums[newIndex];
            }
            counter++;
        }

        return newArray;

    }
}
