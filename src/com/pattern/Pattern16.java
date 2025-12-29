package com.pattern;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            char c = 'A';
            for(int j=0; j<=(n-i-1); j++){
                System.out.print(" ");
            }
            for(int j=0; j<(2*i+1); j++){
                System.out.print(c);
                if(j>=i) c = (char) (c - 1);
                else c = (char) (c + 1);
            }
            for(int j=0; j<=(n-i-1); j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
