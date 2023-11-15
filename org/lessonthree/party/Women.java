package com.proftelran.org.lessonthree.party;

public class Women extends Guest implements LikeDance{
    @Override
    public void dance() {
        System.out.println("I am " + super.getName() + " and I want to dance");
    }
    public Women(String name, int age) {
        super(name, "F", age);
    }
}
