package com.company.leetCode;

import java.util.*;

public class JZ29 {
    public static char firstUniqChar(String s) {
        if(s.length() == 0){
            return ' ';
        }
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), -1);
            }else{
                map.put(s.charAt(i), i);
            }
        }
        for(int i = 0; i < s.length(); i++){
            if (map.get(s.charAt(i)) != -1){
                return s.charAt(i);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
