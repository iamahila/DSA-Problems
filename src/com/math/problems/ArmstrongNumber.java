package com.math.problems;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int value = n;
        int count = 0;
        while(value > 0){
            count++;
            value = value / 10;
        }
        System.out.println("Digit count"+ count);

        int sum = 0;
        int temp = n;

        while(temp > 0){
            int processVal = temp % 10;
            double powResult = Math.pow(processVal, count);
            sum = (int) (sum + powResult);
            temp = temp / 10;
        }
       boolean isArmstrong = sum == n;
        System.out.println(isArmstrong);
    }
}
//TC: O(d) , d -> number of digits
//SC: O(1)