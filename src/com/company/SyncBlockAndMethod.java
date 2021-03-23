package com.company;

public class SyncBlockAndMethod {
    public void syncTask(){
        synchronized (this){
            System.out.println("hello");
        }
    }
    public synchronized void syncsTask(){
        System.out.println("hello again");
    }
}
