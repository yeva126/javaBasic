package com.company;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        while(sc.hasNext()){
            String ab = sc.nextLine();
            if(ab.equals("")) {
                break;
            }
            System.out.println(ab);
        }
        sc.close();
    }
}
