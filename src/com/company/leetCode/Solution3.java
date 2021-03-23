package com.company.leetCode;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public static int lengthOfLongestSubstring(String s) {
        int end = 0, len = Integer.MIN_VALUE, i = 0, j = 0;
        if (s.length() == 0){
            return 0;
        }
        char[] ch = new char[s.length()];
        ch[j++] = s.charAt(end++);
        if (end == s.length()){
            return 1;
        }
        while(end < s.length()){
            ch[j++] = s.charAt(end++);
            int start = i;
            for(int m = i; m < j-1; m++){
                if(ch[m] == s.charAt(j-1)){
                    len = len > (j - i - 1)? len : (j - i - 1);
                    i = m+1;
                    break;
                }
            }
            if (start == i){
                len = len > (j - i)? len : (j - i);
            }
        }
        return len == Integer.MIN_VALUE? s.length():len;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abbbdsa"));
    }
}
