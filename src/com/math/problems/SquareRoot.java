package com.math.problems;

import java.util.Scanner;

//Binary search
public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int left = 1;
        int right = n;
        int ans = 1;

        while (left <= right){
            int mid = left + (right - left)/2;
            if((long) mid * mid <= n){
                ans = mid;
                left = mid+1;
            }
            else{
                right = mid - 1;
            }
        }

        System.out.println(ans);

    }
}
