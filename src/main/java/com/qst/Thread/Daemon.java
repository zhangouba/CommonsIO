package com.qst.Thread;

public class Daemon {

    public static void main(String[] args) {
        Person p=new Person();
        God g=new God();
        Thread t=new Thread(p);
        Thread t1=new Thread(g);
        t.start();
        t.setPriority(5);
        t1.setDaemon(true);
        t1.start();
        t1.setPriority(10);

     }
}

class Person implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("fuck  Person");
        }
    }


} class God implements Runnable {
    @Override
    public void run() {
        while (true){
            System.out.println("i hope you will keep mysterious");
        }
    }
}