package com.proftelran.homework.homework22;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class TaskOneApp {
    public static void main(String[] args) {


        Storage<Character> digitStorage = new Storage<>();
        Storage<Character> characterStorage = new Storage<>();
        FileReader fileReader;
        FileWriter fileCharacterWriter;
        FileWriter fileDigitWriter;
        try {
            //task1
            String path = "/Users/mac/IdeaProjects/BackEndProfM/src/main/java/com/proftelran/homework/homework22";
            fileReader = new FileReader(path + "/file.txt");
           char[] chars = new char[1088];
           int count = 0;
            while (fileReader.ready()) {
                int read = fileReader.read(chars);
                int[] charCounts = new int[256];
                for (Character element : chars) {
                    charCounts[element]++;
                }
                int charCount = 0;
                for (int i = 0; i < charCounts.length; i++) {
                    if (charCounts[i] > 0) {
                        if (Character.isDigit((char) i)) {
                            digitStorage.addElement((char)i, charCounts[i]);
                        } else {
                            characterStorage.addElement((char)i, charCounts[i]);
                        }
                    }
                }

                count++;
            }

            Map<Character, Integer> digitMap = digitStorage.getElements();
            System.out.println(digitMap);
            printMap(digitMap);
            System.out.println();
            Map<Character, Integer> characterMap = characterStorage.getElements();
            System.out.println(characterMap);
            printMap(characterMap);

            //task2
           writeDataToFile(path+"/customHash.txt", characterMap);
           writeDigitDataToFile(path + "/customNumbers.txt", digitMap);


        } catch (IOException e) {
            System.out.println("File not found" + e.getMessage());
        }
    }

    public static <T> void printMap(Map<T, Integer> map) {
        map.forEach((key, value) -> {
            System.out.println("Character = " + key + " , count = " + value);
        });
    }
    private static void writeDataToFile(String path, Map <Character, Integer> map) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            for(Map.Entry<Character, Integer> entry : map.entrySet()){
               writer.write(entry.getKey() + "" + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void writeDigitDataToFile(String path, Map <Character, Integer> map) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            for(Map.Entry<Character, Integer> entry : map.entrySet()){
                writer.write(entry.getKey() + "_" + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


