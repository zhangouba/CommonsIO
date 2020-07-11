package com.qst.Thread;

public class DeadThread {
    public static void main(String[] args) {
        human h=new human(0,"王菲");
        human h1=new human(1,"谢霆锋");
        Thread t=new Thread(h,"王菲");
        Thread t1=new Thread(h1,"谢霆锋");

        t.start();
        t1.start();
    }
}

class Wc{

}
class Bath{

}
class human implements Runnable{
    int number;
    String name;

    public human(int number, String name) {
        this.number = number;
        this.name = name;
    }

    Wc wc=new Wc();
    Bath bath=new Bath();
    @Override
    public void run() {
        te();
    }
    public void te(){
        if (number==0){
            synchronized (wc){
                System.out.println(Thread.currentThread().getName()+"上厕所");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (bath){
                    System.out.println(Thread.currentThread().getName()+"洗澡");
                }
            }
        }
        else{
            synchronized (bath){
                System.out.println(Thread.currentThread().getName()+"洗澡");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (wc){
                    System.out.println(Thread.currentThread().getName()+"上厕所");
                }
            }

        }

    }

}