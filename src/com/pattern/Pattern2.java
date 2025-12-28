package com.pattern;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        for(int i=0; i<value; i++){
            for(int j=0; j<value; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
