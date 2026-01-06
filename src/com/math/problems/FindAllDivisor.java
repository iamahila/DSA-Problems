package com.math.problems;

import java.util.Scanner;

public class FindAllDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        for(int i=1; i*i <= value; i++){
            if(value % i == 0){
                System.out.print(i + " ");
                if(i != (value / i)){
                    System.out.print((value / i) + " ");
                }
            }
        }
    }
}
//TC: O(square root of n)
//SC: O(1)
