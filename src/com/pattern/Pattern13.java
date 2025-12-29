package com.pattern;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            for(char j = 'A'; j <= 'A'+i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
