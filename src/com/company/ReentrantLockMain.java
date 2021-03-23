package com.company;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockMain implements Runnable{
    /*//公平锁
    private static ReentrantLock lock = new ReentrantLock(true);*/
    //非公平锁
    private static ReentrantLock lock = new ReentrantLock(true);
    @Override
    public void run() {
        while (true){
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName()+"get lock");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        ReentrantLockMain reentrantLockMain = new ReentrantLockMain();
        Thread th1 = new Thread(reentrantLockMain);
        Thread th2 = new Thread(reentrantLockMain);
        th1.start();
        th2.start();
    }
}
