package com.math.problems;

import java.util.Scanner;

public class FindLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(n % 10);
    }
}
