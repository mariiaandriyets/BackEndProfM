package com.proftelran.org.lesson23.exceptiontest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExceptionSecond {
    public static void main(String[] args)  {
        //1. use try-catch
        int data = getData();

        //2. throws in signature method and handle in parent method
        try {
            int dataTwo = getDataAdditional();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }

    private static int getData(){
        //1. use try-catch
        try {
            FileInputStream fileInputStream = new FileInputStream("//user/user/one.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static int getDataAdditional() throws IOException {
        //FileNotFoundException
            FileInputStream fileInputStream = new FileInputStream("//user/user/one.txt");
            //IOException
        int read = fileInputStream.read();
        return 0;
    }

    private static int getDataAdditionalTwo(){
       //Exception -> IOException -> FileNotFoundException

        try {
            //FileNotFoundException
            FileInputStream fileInputStream = new FileInputStream("//user/user/one.txt");
            //IOException
            int read = fileInputStream.read();
            //Блоки выполняются сверху вниз
        } catch (FileNotFoundException e) {
            System.out.println("File not found try another file");
        } catch (IOException e) {
            System.out.println("Try again");
        } catch (Exception e) {
            System.out.println("Get all exception");
        }
        return 0;
    }
}
