package com.proftelran.homework.homework22;

import com.proftelran.homework.homework19.File;

import java.io.*;
import java.util.*;

public class TaskTwoApp {
    public static void main(String[] args) {

        String path = "/Users/mac/IdeaProjects/BackEndProfM/src/main/java/com/proftelran/homework/homework22";
            Map<Character, StringBuilder> encode = encode(path + "/file.txt");
            writeToFile(path + "/encoded.txt" , encode);
        Map<Character, StringBuilder> read = read(path + "/encoded.txt");
        String decode = decode(read);
        writeDecoded(decode, path + "/decoded.txt");


    }

    private static Map<Character, StringBuilder> encode (String path)  {
        HashMap<Character, StringBuilder> map = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line;
            int index = 0;
            while ((line = reader.readLine()) != null) {
                char[] chars = line.toCharArray();
                for (Character el : chars) {
                    map.computeIfAbsent(el ,k-> new StringBuilder()).append(index).append(",");
                    index++;
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return map;
    }
    private static void writeToFile (String path, Map<Character, StringBuilder> map) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (Map.Entry<Character,StringBuilder> entry : map.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static Map<Character, StringBuilder> read (String path) {
        Map<Character, StringBuilder> map = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = reader.readLine()) != null) {
                String [] strings = line.split(": ");
                char el = strings[0].charAt(0);
                StringBuilder indexes = new StringBuilder(strings[1]);
                map.put(el, indexes);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    private static String decode (Map <Character, StringBuilder> map) {
        char[] decodedText = new char[1088];
        for (Map.Entry<Character, StringBuilder> entry : map.entrySet()) {
            char symbol = entry.getKey();
            String[] indexes = entry.getValue().toString().split(",");

            for (String index : indexes) {
                int i = Integer.parseInt(index);
                decodedText[i] = symbol;
            }
        }
        return new String(decodedText);
    }
    private static void writeDecoded (String decodedText, String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(decodedText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
