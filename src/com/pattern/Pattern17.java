package com.pattern;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            char c = 'E';
            for(int j=i; j>=0; j--){
                System.out.print((char)(c - j) + " ");
            }
            System.out.println();
        }
    }
}
