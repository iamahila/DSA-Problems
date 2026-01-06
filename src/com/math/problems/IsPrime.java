package com.math.problems;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

       System.out.println(findIsPrime(n));


    }

    private static boolean findIsPrime(int n){
        if(n <= 1){
           return false;
        }

        for(int i=2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}
//TC: O(square root of N)
//SC: O(1)