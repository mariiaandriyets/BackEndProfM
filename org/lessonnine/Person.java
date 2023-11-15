package com.proftelran.org.lessonnine;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
