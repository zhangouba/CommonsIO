package com.qst.Thread;

public class ThreadJoin {
    public static void main(String[] args) {
        Father f=new Father();
        new Thread(f).start();
    }
}

class Father implements  Runnable{

    @Override
    public void run() {
        System.out.println("我醒了，准备去学习");
        System.out.println("但是我发现我被锁屋子里面了");
        Thread thread=new Thread(new Son());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("门开了，去学习");
        System.out.println("感谢我胖儿子");

    }
}

class Son implements Runnable{

    @Override
    public void run() {
        System.out.println("接到爸爸电话");
        System.out.println("回家给爸爸开门");
        for (int i=10;i>0;i--){
            System.out.println("还剩下"+i+"秒");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("终于到了，开门");
    }
}
