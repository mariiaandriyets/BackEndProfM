package com.proftelran.homework.homeworksix;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListString {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Six");
        stringList.add("Seven");
        stringList.add("Five");
        stringList.add("Seven");
        stringList.add("Two");
        System.out.println(stringList);

        List<String> lengthOfStringELement = lengthOfElements(stringList);
        System.out.println(lengthOfStringELement);

        List<String> uniqueElements =  stringList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueElements);
    }

    private static List<String> lengthOfElements (List<String> stringList) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i<stringList.size(); i++) {
          String value = stringList.get(i);
          String o = String.valueOf(value.length());
          newList.add(i, o);
        }
        return newList;
    }
}
