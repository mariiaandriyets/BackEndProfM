package com.proftelran.org.lesson18;

import java.util.stream.Stream;

public class StringAppTest {
    public static void main(String[] args) {
        String [][] array = {{"Hello", "World"}, {"Hello", "Java"},
                {"Hello", "Student"}, {"Welcome", "to", "Tel-Ran"}};
        //count words
        //count unique words
        long countOne = Stream.of(array).flatMap(x -> Stream.of(x)).count();
        System.out.println(countOne);
        long countTwo= Stream.of(array).flatMap(x -> Stream.of(x)).distinct().count();
        System.out.println(countTwo);



    }
}
