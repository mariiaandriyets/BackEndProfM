package com.proftelran.org.lesson19;

import java.io.*;
import java.util.Scanner;

public class BufferFileTest {
    public static void main(String[] args) throws Exception { //BAD IDEA
        String pathToFile = "/Users/mac/IdeaProjects/BackEndProfM/src/main/java/com/proftelran/org/lessonnineteen";
        FileInputStream fileInputStream = new FileInputStream (pathToFile + "/file.txt");

        InputStream in = fileInputStream;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
       reader.lines().forEach(System.out::println);
       fileInputStream.close();
       reader.close();
        System.out.println();

        FileInputStream fileInputStreamTwo = new FileInputStream (pathToFile + "/file.txt");
        Scanner scanner = new Scanner(fileInputStreamTwo);
       while (scanner.hasNext()) {
           System.out.println(scanner.next());
       }
       scanner.close();
       fileInputStreamTwo.close();


    }
}
