package com.proftelran.homework.homework22;

import com.proftelran.homework.homework19.File;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class TaskTwoApp {
    public static void main(String[] args) {

        FileReader fileReader;
        String path = "/Users/mac/IdeaProjects/BackEndProfM/src/main/java/com/proftelran/homework/homework22";
        try {
            fileReader = new FileReader(path + "/file.txt");
            char[] chars = new char[1088];
            int count = 0;
            StringBuilder sb = new StringBuilder();
            while (fileReader.ready()) {
                int read = fileReader.read(chars);
              Map<Character, List<Integer>> map = new HashMap<>();
              for (int i = 0; i<chars.length; i++) {
                  char currentChar = chars[i];
                  map.computeIfAbsent(currentChar,k-> new ArrayList<>()).add(i);
              }
              for (Map.Entry<Character, List<Integer>> entry : map.entrySet()) {
                  System.out.println(entry.getKey() + " : " + entry.getValue());
              }
              writeToFile(path + "/encoded.txt",map );

                count++;
            }
            fileReader.close();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void writeToFile (String path, Map<Character, List<Integer>> map) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (Map.Entry<Character,List<Integer>> entry : map.entrySet()) {
                writer.write(entry.getKey() + "" + entry.getValue());
                writer.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
