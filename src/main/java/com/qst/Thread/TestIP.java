package com.qst.Thread;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestIP {


    public static void main(String[] args) throws UnknownHostException {
        InetAddress address=InetAddress.getByName("www.lizifu.club");
        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());

         address=InetAddress.getLocalHost();
        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());
        System.out.println(1024/0.5/60);
    }
}
