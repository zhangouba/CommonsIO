package com.qst.Thread;

public class Test01 {
    public static void main(String[] args) {
        father f=new father();
        Sons sons=new Sons(f);
        sons.te();
    }
}

class  father{
    int number=10;
}
class Sons{
    public Sons(com.qst.Thread.father father) {
        this.father = father;
    }

    father father;
      public  void  te(){
          System.out.println(father.number);
      }
}