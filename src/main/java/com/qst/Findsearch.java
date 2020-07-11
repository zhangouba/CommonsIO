package com.qst;

import java.util.Arrays;
import java.util.Scanner;

public class Findsearch {

    public static void main(String[] args) {
        int a[]={2,34,6,8,1,23,7,8,99,43,6,2,7,65};
        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        Scanner scanner=new Scanner(System.in);
        int innumber=scanner.nextInt();

        int low=0;
        int hight=a.length;
        while (low<hight){
            int temp= (low+hight)/2;
            if (innumber>a[temp]){
                low=temp+1;
            }
            if (innumber<a[temp]){
                hight=temp-1;
            }
            if (innumber==a[temp]){
                System.out.println(temp);
                System.out.println(a[temp]);
                break;
            }
        }

    }

}
