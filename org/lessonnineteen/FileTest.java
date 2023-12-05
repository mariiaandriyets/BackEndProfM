package com.proftelran.org.lessonnineteen;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        //1.Create a file
        String path = "/Users/mac/IdeaProjects/BackEndProfM/src/main/java/com/proftelran/lessonnineteen";
        File file = new File(path + "/file.txt");
        //2.File exists
        boolean exists = file.exists();
        System.out.println("file exists " + exists);
        //3.Directory or file
        System.out.println("File is directory " + file.isDirectory());
        File fileDirectory = new File(path);
        System.out.println("fileDirectory is directory " + fileDirectory.isDirectory());
        File fileNewDir = new File(path + "/newdirectory");
        System.out.println("fileNewDir exists " + fileNewDir.exists());
        boolean created = fileNewDir.mkdir();
        System.out.println("Was created " + created);
    }
}
