package com.math.problems;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int val = n;
        int reversed = 0;
        while(val > 0){
            reversed = reversed * 10 + (val % 10);
            val = val / 10;

        }
        System.out.println(reversed);

    }
}
