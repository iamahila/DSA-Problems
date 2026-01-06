package com.math.problems;

import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(findIsPalindrom(n));

    }
    private static boolean findIsPalindrom (int n){

        int temp = n;
        int reversed = 0;
        while(temp > 0){
            reversed = reversed * 10 + (temp % 10);
            temp = temp / 10;

        }
        System.out.println(reversed);
        return n == reversed;
    }
}
//TC: O(d)
//SC: O(1)

//reversed can be changed to long eg: 4999 to 9994 (example)