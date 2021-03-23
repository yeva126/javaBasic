package com.company.leetCode;

public class Solution125 {
    public static boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (Character.isLetterOrDigit(s.charAt(i))){
                stringBuilder.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        StringBuilder stringBuilder1 = stringBuilder.reverse();
        return stringBuilder1.equals(stringBuilder);
    }

    /*public static boolean isPalindrome(String s) {
        String str = new String();
        for (int i = 0; i < s.length(); i++){
            if ((s.charAt(i)>= 48 && s.charAt(i) <= 57) || (s.charAt(i)>= 65 && s.charAt(i) <= 90) || (s.charAt(i)>= 97 && s.charAt(i) <= 122)){
                str += s.charAt(i);
            }
        }
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if (!isQuaify(str.charAt(start++), str.charAt(end--))){
                return false;
            }
        }
        return true;
    }

    public static boolean isQuaify(char a, char b){
        if (a == b || a==(b-32) || b==(a-32)){
            return true;
        }
        return false;
    }*/



    public static void main(String[] args) {
        boolean res = isPalindrome("OP");
        System.out.println(res);
    }
}
