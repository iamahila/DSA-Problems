package com.arrays.Intermediate;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String s[] = {"eat","tea","tan","ate","nat","bat"};

       // bruteForceApproach(s);
        optimalApproach(s);

    }

    private static void bruteForceApproach(String str[]){

        boolean isVisited[] = new boolean[str.length];
        List<List<String>> groups = new ArrayList<>();
        for(int i=0; i<str.length; i++){
             if(isVisited[i]) continue;

             List<String> group = new ArrayList<>();
             group.add(str[i]);
             isVisited[i] = true;

             for(int j= i+1; j<str.length; j++){
                 if(!isVisited[j] && isValidAnagram(str[i], str[j])){
                     group.add(str[j]);
                     isVisited[j] = true;
                 }
             }

             groups.add(group);

        }

        System.out.println(groups);

    }

    private static boolean isValidAnagram(String s1, String s2){

        if(s1.length() != s2.length()) return false;

        int count[] = new int[26];

        for(int i=0; i<s1.length(); i++){
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for(int i: count){
            if(i!=0){
                return false;
            }
        }

        return true;
    }

    private static void optimalApproach(String[] str){
        Map<String, List<String>> values = new HashMap<>();

        for(int i=0; i<str.length; i++){
            char[] ch = str[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            values.computeIfAbsent(s, k->new ArrayList<>()).add(str[i]);
        }

        System.out.println(values.values());
    }

}
