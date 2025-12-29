package com.pattern;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        pattern1(n);
        pattern2(n);

    }

    private static void pattern1(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<(n-i); j++){
                System.out.print("*");
            }
            for(int j=0; j<(2*i); j++){
                System.out.print(" ");
            }
            for(int j=0; j<(n-i); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            for(int j=0; j<2*(n-i-1); j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
