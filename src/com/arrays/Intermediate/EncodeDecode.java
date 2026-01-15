package com.arrays.Intermediate;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {
    public static void main(String[] args) {
        String[] str = {"neet", "code", "love", "you"};

        StringBuilder result = new StringBuilder();

        for(int i=0; i<str.length; i++){
            result.append(str[i].length()).append("#").append(str[i]);
        }
        System.out.println(result);

        int i = 0;
        List<String> values = new ArrayList<>();

        while(i < result.length()){
            int j= i;
            while(result.charAt(j) != '#'){
                j++;
            }

            int len = Integer.parseInt(result.substring(i, j));
            System.out.println(len);
            j++;

            String str1 = result.substring(j, j + len);
            values.add(str1);

            //4#neet4
            //0123456

            i = j + len;

        }

        System.out.println(values);
    }
}
