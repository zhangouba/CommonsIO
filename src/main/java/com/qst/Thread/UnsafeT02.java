package com.qst.Thread;

public class UnsafeT02 {
    public static  void main(String[] args) {
         Account account=new Account(1000,"你的账户");

        Draw draw=new Draw(account,500,"我");
        Draw draw1=new Draw(account,800,"你");

         Thread t=new Thread(draw,"男人");
         Thread t1=new Thread(draw1,"女人");

         t.start();t1.start();

    }
}

class Account {
    Integer count;
    String name;

    public Account(Integer count, String name) {
        this.count = count;
        this.name = name;
    }
}

class Draw implements  Runnable {
    Account account;
    int menoy;
    int packtool;
    String usrnamel;

    public Draw(Account account, int menoy, String usrnamel) {
        this.account = account;
        this.menoy = menoy;
        this.usrnamel = usrnamel;
    }

    public void run() {
        te();
    }

    public synchronized void te() {
        if (menoy > account.count) {
            return;
        }
        synchronized (account) {
            if (menoy > account.count) {
                return;
            }
            account.count -= menoy;
            packtool += menoy;
            System.out.println(Thread.currentThread().getName() + "取了" + menoy);
            System.out.println(Thread.currentThread().getName() + "账户余额" + account.count + "  口袋的钱为" + packtool);
        }
    }
}