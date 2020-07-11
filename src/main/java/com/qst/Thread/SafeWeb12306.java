package com.qst.Thread;

public class SafeWeb12306 {
    public static void main(String[] args) {

        Customer customer=new Customer(10);
        Customer customer1=new Customer(15);
        Web123 w=new Web123(15,customer,customer1);
        new Thread(w).start();


    }
}

class Web123 implements  Runnable{
    int temp=0;
    Integer count;
    Customer[] customer;

    public Web123(Integer count,Customer...customer) {
        this.count = count;
        this.customer = customer;
    }

    @Override
    public void run() {
        te();
    }
    public  synchronized void  te(){
        while (temp<customer.length){

        if (
             customer[temp].neednumber>count
         ){
            System.out.println("票数不足");
            return;
         }
         count-=customer[temp].neednumber;
        System.out.println(Thread.currentThread().getName()+"成功购买了"+customer[temp].neednumber);
        System.out.println("余票为"+count);
            temp++;
    }
}}

class Customer {
    int neednumber;

    public Customer(int neednumber) {
        this.neednumber = neednumber;
    }
}
