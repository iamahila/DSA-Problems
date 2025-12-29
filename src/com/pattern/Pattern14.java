package com.pattern;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i =n; i>0; i--){
            for(char ch = 'A'; ch < 'A' + i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}
