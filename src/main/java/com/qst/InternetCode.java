package com.qst;

import java.io.*;
import java.net.URL;

public class InternetCode {
    public static void main(String[] args) throws IOException {
        URL url =new URL("http://www.dianping.com/");
       InputStream is= url.openStream();

        BufferedReader br=new BufferedReader(new InputStreamReader(is,"UTF-8"));
        String stu=null;
        while ((stu=br.readLine())!=null){
            System.out.println(stu);
        }
    }
}
