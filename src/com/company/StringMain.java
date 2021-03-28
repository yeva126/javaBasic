package com.company;

public class StringMain {
    public static void a(String a){
        a += "a";
        System.out.println(a);
    }
    public static void a(StringBuilder a){
        a.append("a");
        System.out.println(a);
    }
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String ab = "ab";
        StringBuilder abb = new StringBuilder("oo");
        //a(ab);
        a(abb);
        //System.out.println(ab);
        System.out.println(abb);
        //System.out.println("a"+"b" == ab);
        //System.out.println(3*2==6);

    }
}
