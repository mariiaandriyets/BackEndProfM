package com.proftelran.org.lessonnine;

import homework.homework1.Person;

import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public class TestAppSetExampleOne {
    public static void main(String[] args) {
        //Set -> SortedSet -> TreeSet

        SortedSet<String> sortedSet = new TreeSet<>();
        //add - add element to Set
        sortedSet.add("A");
        sortedSet.add("B");
        sortedSet.add("A");
        sortedSet.add("F");
        sortedSet.add("C");

        System.out.println(sortedSet);

        //last and first - get last and first elements from sorted set (use interface SortedSet)
        System.out.println("Last element is " +  sortedSet.last());
        System.out.println("First element is " +  sortedSet.first());

        //contains - check that element exists in set
        System.out.println("Contains " + sortedSet.contains("E"));
        System.out.println("Contains " + sortedSet.contains("B"));

        //remove - delete element from the set
        sortedSet.remove("B");
        System.out.println(sortedSet);

        System.out.println("Iterate with foreach: ");
        for (String value : sortedSet) {
            System.out.print(" " + value);
        }


    }
}
