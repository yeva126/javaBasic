package com.company;

public class StaticMain {
    public StaticMain(){
        System.out.println("默认构造方法！---");
    }
    {
        System.out.println("非静态方法块！---");
    }
    static {
        System.out.println("静态方法块！---");
    }
    private static void test(){
        System.out.println("静态方法中的内容！----");
        {
            System.out.println("静态方法中的代码块！---");
        }
    }

    public static void main(String[] args) {
        StaticMain test = new StaticMain();
        //StaticMain.test();
    }
}
