package com.qst.Thread;

public class Lambda   {



    public static void main(String[] args) {
       new Thread(()->{
           for (int i=0;i<20;i++){
               System.out.println("一边听歌");
           }
       }
       ).start();
    }
    public  static  void  te(){
        new Thread(()->{
            System.out.println("");
        }).start();
    }
}
