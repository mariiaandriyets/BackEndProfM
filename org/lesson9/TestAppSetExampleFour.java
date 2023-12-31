package com.proftelran.org.lesson9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestAppSetExampleFour {
    public static void main(String[] args) {
        List<String> str = List.of("One", "Two", "One", "Three", "Four", "Three");
        System.out.println("Duplicate objects: " + getDuplicateList(str));
    }

    private static List<String> getDuplicateList(List<String> stringList) {
        Set<String> set = new HashSet<>();
        List<String> duplicateList = new ArrayList<>();
        for (String value : stringList) {
            if (!set.add(value)) {
                duplicateList.add(value);
            }
        }
        return duplicateList;
    }
}
