package com.company;

import java.text.SimpleDateFormat;
import java.util.Random;

public class ThreadLocalMain implements Runnable{
    private static ThreadLocal<SimpleDateFormat> format = ThreadLocal.withInitial(()->new SimpleDateFormat("yyyyMMdd HHmm "));

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalMain obj = new ThreadLocalMain();
        for (int i =0 ;i < 10; i++){
            Thread t = new Thread(obj, ""+i);
            Thread.sleep(new Random().nextInt(1000));
            t.start();
        }
    }

    @Override
    public void run() {
        System.out.println("Thread name=" + Thread.currentThread().getName() + "default format:" + format.get().toPattern());
        try{
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        format.set(new SimpleDateFormat());
        System.out.println("Thread name=" + Thread.currentThread().getName() + "format:" + format.get().toPattern());
    }
}
