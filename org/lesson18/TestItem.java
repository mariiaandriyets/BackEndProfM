package com.proftelran.org.lesson18;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestItem {
    public static void main(String[] args) {
        List<Item> itemList = Arrays.asList(
                new Item("New", 33.5),
                new Item("City", 14),
                new Item("Window", 13),
                new Item("Phone", 43),
                new Item("Milk", 15),
                new Item("Table", 30),
                new Item("Sun", 11),
                new Item("Door", 14),
                new Item("Paper", 43),
                new Item("Phone", 31)
        );
        //print unique names to console only unique with price > 20
        itemList.stream()
                .filter(x -> x.getPrice() > 20)
                .map(x -> x.getName())
                .distinct()
                .forEach(i -> System.out.println(i));

        // collect () - terminal
        Stream<String> distinct = itemList.stream()
                .filter(x -> x.getPrice() > 20)
                .map(x -> x.getName())
                .distinct();
        List<String> collect = distinct.collect(Collectors.toList());

        Set<String> nameSet = itemList.stream()
                .filter(x -> x.getPrice() > 20)
                .map(x -> x.getName())
                .collect(Collectors.toSet());
        System.out.println(nameSet);
        // collect
        //Collectors.toSet() - Set
        //Collectors.toList() - List
        //Collectors.toMap() - Map
        //Collectors.joining() - collect to string

        String stringOne = itemList.stream()
                .filter(x -> x.getPrice() > 20)
                .map(x -> x.getName())
                .collect(Collectors.joining());
        System.out.println("Joining stream: " + stringOne);

        String stringTwo = itemList.stream()
                .filter(x -> x.getPrice() > 20)
                .map(x -> x.getName())
                .collect(Collectors.joining(" "));
        System.out.println("Joining stream: " + stringTwo);


    }
}
