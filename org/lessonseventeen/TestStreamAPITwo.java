package com.proftelran.org.lessonseventeen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamAPITwo {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Oleg", "Maxim", "Ivan", "Petr");
        //(S, S , S , S) -> (St, St, St, St)
        //(S, S, S, S) -> (St, S, I, Sr) !!! incorrect

        List<Student> studentList = nameList.stream()
                .map(name -> new Student(name)).collect(Collectors.toList());
        System.out.println(studentList);

        List<String> collect = studentList.stream()
                .map(student -> student.getName()).collect(Collectors.toList());
        System.out.println(collect);

        List<String> lowerCaseNames = nameList.stream()
                .map(s -> s.toLowerCase()).collect(Collectors.toList());
        System.out.println(lowerCaseNames);

        //flatmap
        List<Integer> one = Arrays.asList(1, 2, 3);
        List<Integer> two = Arrays.asList(4, 5, 6);
        List<Integer> three = Arrays.asList(7, 8 , 9);

        List<List<Integer>> list = Arrays.asList(one, two, three);

        list.stream()
                .flatMap(x -> x.stream())
                .map(x -> x*2)
                .forEach(x -> System.out.print(" " + x));
        System.out.println();

        List<Integer> integerList = list.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        System.out.println(integerList);


    }
}
