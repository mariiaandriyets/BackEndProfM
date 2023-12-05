package com.proftelran.homework.homeworkseventeen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskTwo {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("hello", "world", "i", "am", "here");
        List<String> sortedList = stringList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
