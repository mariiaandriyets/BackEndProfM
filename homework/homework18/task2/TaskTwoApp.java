package com.proftelran.homework.homework18.task2;

import java.util.Arrays;
import java.util.List;

public class TaskTwoApp {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "b5", "a2", "b4");
        System.out.println("min element from collection " + list.stream().min((o1, o2) -> o1.compareTo(o2)).get());
    }
}
