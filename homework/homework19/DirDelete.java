package com.proftelran.homework.homework19;

import java.io.File;


public class DirDelete {
    public static void main(String[] args) {
        String s = "/Users/mac/IdeaProjects/BackEndProfM/src/main/java/com/proftelran/homework/homework19/directory.txt";
        try {
          deleteDir(new File(s));

        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
    private static void deleteDir (File dir) {
       if (!dir.exists()) {
           return;
       }
       File [] files = dir.listFiles();
       if (files != null) {
           for (File file : files) {
               if (file.isDirectory()) {
                   deleteDir(file);
               } else if (!file.delete()){
                   System.out.println("No file to delete: " + file.getAbsolutePath());
               }
           }
       }

    }
}
