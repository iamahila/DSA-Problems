package com.pattern;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int start = 0;
        for(int i=0; i<n; i++){
            if(i%2 == 0) start = 1;
            else start = 0;
            for(int j=0; j<=i; j++){
                System.out.print(start + " ");
                start = 1-start;
            }
            System.out.println();
        }
    }
}
