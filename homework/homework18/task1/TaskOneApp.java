package com.proftelran.homework.homework18.task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskOneApp {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        List<String> sortedListOne = list.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(sortedListOne);
        List<String> sortedListTwo = list.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
        System.out.println(sortedListTwo);

    }
}
