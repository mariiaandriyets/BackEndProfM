package com.proftelran.org.lesson20.task;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMergeFiles {
    public static void main(String[] args) {
        String pathToFile = "/Users/mac/IdeaProjects/BackEndProfM/src/main/java/com/proftelran/org/lesson20/task";
        List<String> result = new ArrayList<>();
        String inputNames = "A_B_C_D";
        TestMergeFiles mergeFiles = new TestMergeFiles();
        String[] names = inputNames.split("_");
        Arrays.stream(names).forEach(name -> {
            result.add(mergeFiles.getDataFromFile(pathToFile + "/" + name + ".txt"));
        });
        System.out.println(result);
        String pathToOutFile = pathToFile +"/outputFile.txt";
        mergeFiles.writeDataToFile(pathToOutFile,
        result.stream().collect(Collectors.joining(" ")));
    }
    private void writeDataToFile(String path, String content) {
        try ( FileWriter writer = new FileWriter(path)){

            writer.write(content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private String getDataFromFile(String path) {
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader(path)){
            while (reader.ready()) {
                sb.append( (char) reader.read());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
