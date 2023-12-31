package com.proftelran.org.lesson16;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FITest {
    public static void main(String[] args) {

     // convert string to upper case
     //1
        String strOne = "String";
      Consumer<String> toUpper = str -> System.out.println(str.toUpperCase());
      toUpper.accept(strOne);
      //2
        Function<String, String> stringFunction = s -> s.toUpperCase();
        System.out.println(stringFunction.apply(strOne));

        Supplier<String>  stringSupplier = () -> strOne.toUpperCase();
        String s = stringSupplier.get();
        System.out.println(s);

        Person alex = new Person("alex");
        System.out.println(alex);

        Consumer<Person> personConsumer = person -> person.setName(person.getName().toUpperCase());
        personConsumer.accept(alex);
        System.out.println(alex);






    }
}
