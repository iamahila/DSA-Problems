package com.math.problems;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int counter = 0;
        int val = n;
        while(val > 0){
            val = val / 10;
            counter++;
        }
        System.out.println(counter);
    }
}
