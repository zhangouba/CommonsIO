package com.qst.Thread;

public class Te {
    public static void main(String[] args)  {
     Thread.yield();
        try {
            Thread.sleep(2020);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
