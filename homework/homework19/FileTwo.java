package com.proftelran.homework.homework19;

import java.io.File;

public class FileTwo {
    public static void main(String[] args) {
        String path = "/Users/mac/Desktop";
        try {
            File file = new File(path + "/example.txt");
            boolean exists = file.exists();
            System.out.println(exists);
            boolean delete = file.delete();
            System.out.println("fileTwo.txt delete ? " + delete);
        }
        catch (Exception e) {
            System.err.println(e);
        }


    }
}
