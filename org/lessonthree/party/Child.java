package com.proftelran.org.lessonthree.party;

public class Child extends Guest implements Sleep{

    @Override
    public void sleep() {
        System.out.println("I am " + super.getName() + " and I want to sleep");
    }

    public Child(String name, String gender, int age) {
        super(name, gender, age);
    }
}
