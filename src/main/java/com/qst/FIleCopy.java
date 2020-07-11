package com.qst;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FIleCopy {

    public static void main(String[] args) {
        try {
            FileUtils.copyFile(new File("desk.png"),new File("desk1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
