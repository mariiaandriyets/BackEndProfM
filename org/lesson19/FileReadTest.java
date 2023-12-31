package com.proftelran.org.lesson19;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileReadTest {
    public static void main(String[] args) {
        //try {
          //здесь может быть проблема - exception
        //} catch(Exception e)
        // handle exception
        //}

        //String pathToFile = "/Users/mac/IdeaProjects/BackEndProfM/src/main/java/com/proftelran/org/lessonnineteen/file.txt";
        String pathToFile = "/Users/mac/IdeaProjects/BackEndProfM/src/main/java/com/proftelran/org/lessonnineteen";
        try {
            FileInputStream fileInputStream = new FileInputStream (pathToFile + "/file.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(pathToFile + "/fileNew.txt");
            int data = fileInputStream.read();
            while (data!= -1) {
//                System.out.print((char) data);
                fileOutputStream.write(data);
                data = fileInputStream.read();
            }
            fileInputStream.close();
            fileOutputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
