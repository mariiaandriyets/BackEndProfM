package com.proftelran.org.lesson15;

import java.util.*;

public class TestFuncInterfaceOne {
    public static void main(String[] args) {
        MultiplayerImpl multiplayer = new MultiplayerImpl();
        multiplayer.multiply(10);

        //анонимный класс
        Multiplayer multiplayerTwo = value -> System.out.println("Result value * 5 = " + (value *= 10));

        multiplayerTwo.multiply(4);

        Printer printer = () -> System.out.println("Hello");
        // () говорят о том, что метод ничего не принимает

        Printer printer1 = new Printer() {
            @Override
            public void print() {
                System.out.println();
            }
        };

        PrinterAddon printerAddon = (one, two) -> System.out.println(" " + one + " " + two);

        printerAddon.print("Hello", "World");

        //Comparator<Integer> sortByAge = (o1, o2) -> Integer.compare(o1, o2);

        Comparator<Book> sortByAge = (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge());
        List<Book> bookList = Arrays.asList(new Book(), new Book());

         Collections.sort(bookList, sortByAge);


    }
}
