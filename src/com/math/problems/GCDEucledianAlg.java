package com.math.problems;

public class GCDEucledianAlg {
    public static void main(String[] args) {
        gcdUsingLoop(18, 12);
        System.out.println(gcdRecursion(44, 28));

    }
    private static void gcdUsingLoop(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);

        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }

    private static int gcdRecursion(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);

       if(b == 0){
           return a;
       }

       return gcdRecursion(b, a % b);

    }
}
//loop
//TC: O(log(min(a,b)))
//SC: O(1)

//recursion
// Time Complexity: O(log(min(a, b)))
// Space Complexity: O(log(min(a, b)))


/**
 *
 * “The Euclidean algorithm takes the most steps when the inputs are consecutive Fibonacci numbers,
 *  because each modulo reduces the problem size by the smallest possible amount.”
 */