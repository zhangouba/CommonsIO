package com.qst.Thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ThreadPhotoDownload implements Runnable {

    String UR;
    String AIM;
    public static void main(String[] args) {
        ThreadPhotoDownload t=new ThreadPhotoDownload("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1567217525&di=15c00ae21120b35ec4f6b8a5a396228c&imgtype=jpg&er=1&src=http%3A%2F%2Fpic13.nipic.com%2F20110409%2F7119492_114440620000_2.jpg"
        ,"photo01.png");
        ThreadPhotoDownload t1=new ThreadPhotoDownload("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1566622806094&di=7acbd8fefb69a7061c475ae60c8c462a&imgtype=0&src=http%3A%2F%2Fpic24.nipic.com%2F20120922%2F10898738_143746326185_2.jpg"
                ,"photo02.png");
        ThreadPhotoDownload t2=new ThreadPhotoDownload("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1566622806091&di=a7ffbdd1ac67b9e5ca19da05d9811e54&imgtype=0&src=http%3A%2F%2Fimg4q.duitang.com%2Fuploads%2Fitem%2F201404%2F12%2F20140412153248_VE8BM.jpeg"
        ,"photo03.png");
        Thread thread=new Thread(t);
        Thread thread1=new Thread(t1);
        Thread thread2=new Thread(t2);
        thread.start();
        thread1.start();
        thread2.start();
    }

    public ThreadPhotoDownload(String UR, String AIM) {
        this.UR = UR;
        this.AIM = AIM;
    }

    public  static void Dounloadmethod(String URL, String path){
        try {
            FileUtils.copyURLToFile(new URL(URL),new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        Dounloadmethod( UR, AIM);
        System.out.println(Thread.currentThread().getName());
        System.out.println(AIM);
    }
}
