package com.proftelran.org.lesson4;

public class ParentTest {
    public static void main(String[] args) {
        Parent parent;
        parent = new ChildOne();
        parent.printGreetings();

        parent = new ChildTwo();
        parent.printGreetings();

        parent = new MiddleChild();
        parent.printGreetings();
        parent.printThanks();
        parent.printWishes();
        parent.name = "Alex";
        System.out.println(parent.name);



    }
}
