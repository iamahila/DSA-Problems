package com.pattern;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numOfStars = 0;
        for(int i=0; i<=(2*n-1); i++){
            if(i<=n){
                numOfStars = i;
            }
            else{
                numOfStars = 2*n-i;
            }
            for(int j=0; j<numOfStars; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
