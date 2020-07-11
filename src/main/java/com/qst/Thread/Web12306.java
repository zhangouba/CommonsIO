package com.qst.Thread;

public class Web12306 implements  Runnable  {
     static  boolean  flag=true;
     private static int number=100;
    public static void main(String[] args) {
        Web12306 web12306=new Web12306();
        new Thread(web12306,"码农").start();
        new Thread(web12306,"码huang").start();
        new Thread(web12306,"shabi").start();
        new Thread(web12306,"ng").start();
    }

    @Override
    public void run() {
        while (flag){
            te();
        }
    }

    public synchronized static  void  te() {
       if (number<=0){
           flag=false;
             return;
          }
            System.out.println(Thread.currentThread().getName() + "----->" + number--);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

