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
