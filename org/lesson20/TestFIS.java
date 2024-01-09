package com.proftelran.org.lesson20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TestFIS {
    //FileInputStream
    //FileOutputStream

    public static void main(String[] args) throws IOException {
        String pathToFile = "/Users/mac/IdeaProjects/BackEndProfM/src/main/java/com/proftelran/org/lesson20";
        FileInputStream fileInputStream = null;
        try {
             fileInputStream = new FileInputStream(pathToFile + "/fileone.txt");
            System.out.println("Available bytes in file " + fileInputStream.available());
            fileInputStream.skip(5);
            while (fileInputStream.available() > 0) {
                System.out.print(" " + (char)fileInputStream.read());
            }
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println(" We have a problem " + e.getMessage() + ", cause " +
                    e.getCause());
        }

        System.out.println();

        try {
            System.out.println(fileInputStream.available());
        } catch (IOException e) {
            System.out.println("Try to used closed stream");
            e.printStackTrace();
        }

        FileReader fileReader;
        try {
            fileReader = new FileReader(pathToFile + "/fileone.txt");
            char[] chars = new char[20];
            int count = 0;
            while (fileReader.ready()) {
                int read = fileReader.read(chars);
                System.out.println(Arrays.toString(chars) + " count chars = " + read);
                count++;
            }
            System.out.println("Number of reads " + count);
        } catch (IOException e) {
            System.out.println(" We have a problem " + e.getMessage());
            e.printStackTrace();
        }
    }
}
