package com.qst;

import java.util.Arrays;
import java.util.Scanner;

public class UseCount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();

         String count[]= str.split(" ");
         int cou[]=new int[count.length];
        for (int i=0;i<count.length;i++){
            cou[i]=Integer.valueOf(count[i]);
      }
        System.out.println(Arrays.toString(cou));

        String two=scanner.nextLine();

        String money[]=two.split(" ");
        int meon[]=new int[money.length];
        for (int y=0;y<money.length;y++){
            meon[y]=Integer.valueOf(money[y]);
        }
       // System.out.println(Arrays.toString(meon));

               Arrays.sort(meon);

       // System.out.println(Arrays.toString(meon));
        int temp=0;
        for (int z=0;z<meon.length;z++){
            temp=temp+meon[z];
            if (temp==cou[1]){

                temp=temp-meon[z];
                System.out.println(z+1);
                break;
            }
            if (temp>cou[1]){
                System.out.println(z);
                break;
            }
        }
    }
}
