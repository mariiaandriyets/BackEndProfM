package com.proftelran.org.lesson23;

import java.util.Arrays;
import java.util.List;

public class TestWildCard {
    public static void main(String[] args) {

        StudentPerson alex = new StudentPerson("Alex");
        StudentPerson oleg = new StudentPerson("Oleg");

        Person maxim = new Person("Maxim");

        List<Person> people = Arrays.asList(alex,oleg, maxim);

        List<StudentPerson> studentPeople = Arrays.asList(alex, oleg);

        checkPerson(studentPeople);
        addPerson(people);


    }

    // ? extends SomeClass - принимает тип данных который является наследником класса
    // ? super SomeClass - принимает тип данных который является родителем класса
    //List<? extends Object> == === List<?>
    //PECS - Producer Extends Consumer Super

    //people - Producer. аргумент продюсер и используем extends

    private static void checkPerson(List<? extends Person> people) {
        for (Person person : people) {
            System.out.println("Check person " + person);
        }
    }
    // people - Consumer. аргумент является потребителем и используем super
    private static void addPerson (List<? super StudentPerson> people) {
        StudentPerson petr = new StudentPerson("Petr");
        people.add(petr);
    }
}
