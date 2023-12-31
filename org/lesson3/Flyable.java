package com.proftelran.org.lesson3;

public interface Flyable {
    void fly();

    default void canFly() {
        System.out.println("");
    }
}
