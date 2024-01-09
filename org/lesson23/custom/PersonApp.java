package com.proftelran.org.lesson23.custom;

import com.proftelran.org.lesson23.Person;

import java.util.HashMap;
import java.util.Map;

public class PersonApp {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        int key = 5;
        try {
            checkPerson(map, key);
        } catch (PersonNotFoundException exception) {
            System.out.println(exception.getMessage());
        }


        System.out.println(map.get(key));
    }

    private static void checkPerson ( Map<Integer, Person> map, int key) {
        if (!map.containsKey(key)){
            throw new PersonNotFoundException("Person with id "+ key + " not found ");
        }
    }
}
