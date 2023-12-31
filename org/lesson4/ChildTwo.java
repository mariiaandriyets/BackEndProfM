package com.proftelran.org.lesson4;

public class ChildTwo extends Parent {
    @Override
    public void printGreetings() {
        System.out.println("Hello I am child two");


    }

    public void printAll() {
        printGreetings();
        printThanks();
        printWishes();
    }


}
