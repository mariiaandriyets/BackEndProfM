package com.proftelran.org.lessontwo;

public class SeaCat extends BigCat{
    public void swim(){
        System.out.println("I can swim");
    }

    @Override
    public void voice() {
        System.out.println("Hello I'm sea cat");
    }

    public SeaCat(int age) {
        super(age);
    }
}
