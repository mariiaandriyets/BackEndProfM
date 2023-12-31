package com.proftelran.org.lesson3;

public class Whale extends SeaAnimal implements Flyable,Eatable{


    @Override
    public boolean canEat() {
        return false;
    }

    @Override
    public void fly() {
        System.out.println("I am whale and I can fly");
    }

    private boolean hasTail;

    public Whale(String name) {
        super(name);
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }



    @Override
    public boolean eat(String plants) {
        return false;
    }

    @Override
    public void see() {

    }

    @Override
    public void swim() {

    }
}
