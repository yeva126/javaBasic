package com.company;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

    int ticket = 0;

    public static void main(String[] args) {
        ReentrantLockDemo reentrantLockDemo = new ReentrantLockDemo();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                synchronized (this){
                    while (reentrantLockDemo.ticket <= 100){
                        notifyAll();
                        System.out.println(Thread.currentThread().getName() + ":" + reentrantLockDemo.ticket++);
                        try {
                            if (reentrantLockDemo.ticket > 100){
                                return;
                            }
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        Thread th1 = new Thread(run, "t1");
        Thread th2 = new Thread(run, "t2");
        Thread th3 = new Thread(run, "t3");
        th1.start();
        th2.start();
        th3.start();
    }
}
