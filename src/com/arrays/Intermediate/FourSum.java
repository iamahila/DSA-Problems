package com.arrays.Intermediate;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int nums[] = {1000000000,1000000000,1000000000,1000000000};
        int n = -294967296;

        List<List<Integer>> values = optimalApproach(nums, n);
        System.out.println(values);

    }

    private static List<List<Integer>> optimalApproach(int nums[], int n){
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){

            if(i>0 && nums[i] == nums[i-1]) continue;


            for(int j=i+1; j<nums.length; j++){



                if(j> i+1 && nums[j] == nums[j-1]) continue;


                int left = j+1;
                int right = nums.length - 1;

                while(left < right){

                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if(sum == n){
                        List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
                        left++;
                        right--;
                        result.add(quad);

                        while(left < right && nums[left] == nums[left - 1]) left++;
                        while(left < right && nums[right] == nums[right + 1]) right--;

                    }

                   else if(sum < n)
                        left++;
                    else
                        right--;

                }

            }
        }

        return result;

    }
}
