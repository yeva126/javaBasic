package com.company;

public class Mainoo {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;
        try{
            System.out.println("start");
            a = a/b;
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("end");
    }
}
