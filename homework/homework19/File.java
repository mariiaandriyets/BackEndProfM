package com.proftelran.homework.homework19;

import java.io.*;

public class File {
    public static void main(String[] args) {
        String filePath = "/Users/mac/IdeaProjects/BackEndProfM/src/main/java/com/proftelran/homework/homework19";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath + "/myFile.txt");
            String string = "This is my first experience when I myself work with IO API. I can do everything!";
            fileOutputStream.write(string.getBytes());
            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
