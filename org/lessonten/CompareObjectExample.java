package com.proftelran.org.lessonten;

import java.util.HashSet;
import java.util.Set;

public class CompareObjectExample {
    public static void main(String[] args) {
        Cat catOne = new Cat("Alex", 7);
        Cat catTwo = new Cat("Oleg", 9);

        boolean equals = catOne.equals(catTwo); //false
        boolean equals1 = catOne.equals(catOne);// true

        Set<Cat> catSet = new HashSet<>();
        catSet.add(catOne);
        catSet.add(catTwo);





    }
}
