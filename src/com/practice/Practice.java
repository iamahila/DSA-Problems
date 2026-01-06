package com.practice;

public class Practice {
    public static void main(String[] args) {
        powerOfNums(2, 10);
    }

    private static void powerOfNums(int x, int n){
        int ans = 1;
           while(n > 0){
               if(n % 2 == 1){
                   ans = ans * x;
               }
               x = x * x;
               n = n / 2;
           }
           System.out.println(ans);
    }
}
