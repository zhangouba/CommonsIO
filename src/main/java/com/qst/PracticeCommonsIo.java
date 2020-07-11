package com.qst;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class PracticeCommonsIo {
    public static void main(String[] args) throws IOException {
//        File file=new File("commonsIO");
//        file.createNewFile();
//     String s="i will study English at late 1 hour";
//        OutputStream outputStream=new FileOutputStream("commonsIO");
//        outputStream.write(s.getBytes());

      List<String> list=FileUtils.readLines(new File("commonsIO"),"UTF-8");
      for (String name:list){
          System.out.println(name);
      }

    }
}
