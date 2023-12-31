package com.proftelran.org.lesson19;

import java.io.File;
import java.util.Arrays;

public class FileTest {
    public static void main(String[] args) {
        //1. Create a file
        String path = "/Users/mac/IdeaProjects/BackEndProfM/src/main/java/com/proftelran/org/lessonnineteen";
        File file = new File(path + "/file.txt");
        System.out.println();

        //2. File exists
        boolean exists = file.exists();
        System.out.println(exists);
        System.out.println();

        //3. Directory or file
        System.out.println("File is directory " + file.isDirectory());
        System.out.println();

        //Diretory is directory
        File fileDirectory = new File(path);
        System.out.println("fileDirectory is directory " + fileDirectory.isDirectory());
        System.out.println();

        //4.Create directory - newdirectory
        File fileNewDir = new File(path + "/newdirectory");
        System.out.println("fileNewDir exists " + fileNewDir.exists());
        boolean created = fileNewDir.mkdir();
        System.out.println("Was created " + created);
        System.out.println();

        //Length of file
        System.out.println("Length of file " + file.length());
        System.out.println();

        //5.File delete
        File fileToDelete = new File(path + "/fileNew.txt");
        boolean delete = fileToDelete.delete();
        System.out.println("fileTwo.txt delete ? " + delete);
        System.out.println();

        //6.List of files
        String[] list = fileDirectory.list();
        System.out.println(Arrays.toString(list));
        System.out.println();

        //7. List of files
        File[] files = fileDirectory.listFiles();
        for (File elementFile : files) {
            System.out.println(elementFile.getName() + " " + elementFile.length());
        }
    }
}
