package com.proftelran.homework.homeworkseventeen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskOne {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Johnson", "Smith", "Kramer", "Kaulas", "Martines");
        List<String> surnameWithK = stringList.stream().filter(s -> s.contains("K")).collect(Collectors.toList());
        System.out.println(surnameWithK);


    }
}
