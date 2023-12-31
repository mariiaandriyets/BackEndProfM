package com.proftelran.org.lesson3;

public class Bird implements Flyable,Eatable{

    @Override
    public void fly() {
        System.out.println("I am bird and I can fly");
    }

    @Override
    public boolean canEat() {
        return true;
    }
}
