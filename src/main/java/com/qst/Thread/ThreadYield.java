package com.qst.Thread;

public class ThreadYield implements  Runnable{
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
        Thread.yield();
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadYield y=new ThreadYield();
        new Thread(y,"01").start();
        new Thread(y,"02").start();
    }
}
