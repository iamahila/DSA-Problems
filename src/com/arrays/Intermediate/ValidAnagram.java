package com.arrays.Intermediate;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";

        boolean isValid = isValidAnagramBrute(s1, s2);
        System.out.println(isValid);
    }

    private static boolean isValidAnagramBrute(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i=0; i<c1.length; i++){
            if(c1[i] != c2[i])
                return false;
        }

        return true;

    }

    private static boolean isValidAnagramOptimal(String s1, String s2){
        if(s1.length() != s2.length())
            return false;


        int count[] = new int[26];//ascii a - 97 (decimal),   A - 65

        for(int i=0; i<s1.length(); i++){
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for(int a: count){
            if(a != 0){
                return false;
            }
        }

        return true;
    }
}
