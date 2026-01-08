package com.arrays.basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FindMissingAndRepeatingNumber {
    public static void main(String[] args) {
        int arr[] = {4, 3, 6, 2, 1, 1};
        int n = 6;

        //bruteApproach(arr, n);
        mathematicalSolution(arr, n);



    }

    private static void bruteApproach(int arr[], int n){

        HashMap<Integer, Integer> values = new HashMap<>();


        for(int i=0; i<arr.length; i++){
            values.put(arr[i], values.getOrDefault(i, 0) + 1);
        }

        int missing = -1;
        int repeating = -1;

        for(int i=1; i<=n; i++){
            if(!values.isEmpty() && Objects.nonNull(values.get(i)) && values.get(i) > 1){
                repeating = i;
            }

            if(!values.containsKey(i)){
                missing = i;
            }
        }

        System.out.println(values.toString());

        System.out.println("Missing: " + missing);
        System.out.println("Repeating: " + repeating);
    }

    private static void mathematicalSolution(int arr[], int n){
        long sn = ((long) n * (n+1)) /2 ;
        long s2n = (n * (n+1) * (2L *n + 1)) / 6;
        long s = 0L;
        long s2 = 0L;

        for(int i=0; i<arr.length; i++){
            s = s + arr[i];
            s2 = s2 + ((long) arr[i] * arr[i]);
        }

        System.out.println("s: " +s);
        System.out.println("s2: " +s2);
        System.out.println("sn: " +sn);
        System.out.println("s2n: " +s2n);

        long xMy = s - sn;
        long xPy = (s2 - s2n) / xMy;
        System.out.println("xMy: " +xMy);
        System.out.println("xPy: " +xPy);

        long x = (xMy + xPy) / 2;
        long y = xPy - x;

        System.out.println(x + " " + y);
    }
}
