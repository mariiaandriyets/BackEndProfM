package com.proftelran.homework.homework19;

import java.io.File;


public class DirDelete {
    public static void main(String[] args) {
        String path = "/Users/mac/IdeaProjects/BackEndProfM/src/main/java/com/proftelran/homework/homework19";
        try {
            File file = new File(path + "/newdir");
           file.mkdir();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try {
            File file = new File(path + "/dir");
            file.mkdir();
            String pathTwo = "/Users/mac/IdeaProjects/BackEndProfM/src/main/java/com/proftelran/homework/homework19/dir";
            File fileTwo = new File(pathTwo + "/dirdir");
            fileTwo.mkdir();
            boolean b = deleteDir(file);
            System.out.println(b);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private static boolean deleteDir (File file) {
        if (file.isDirectory() && file.exists()) {
           file.delete();
        }
        return true;
    }
}
