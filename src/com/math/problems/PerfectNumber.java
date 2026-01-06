package com.math.problems;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 1;

        for(int i = 2; i*i<=n; i++){
            if(n % i == 0){
                sum = sum + i;
                if(i != (n/i)){
                    sum = sum + (n/i);
                }
            }
        }

        if (n <= 1) {
            System.out.println(false);
            return;
        }

        boolean isPerfectNumber = sum == n;
        System.out.println(isPerfectNumber);
    }
}
//TC: O(square root of n)
//SC: O(1)

//edge case, 1 is not perfect number. so add below code:

/**
 * if (n <= 1) {
 *     System.out.println(false);
 *     return;
 * }
 */