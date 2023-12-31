package com.proftelran.org.lesson2;

public class LessonTwoApp {
    public static void main(String[] args) {

        Cat cat = new Cat(15);
        cat.voice();
        cat.setColor("White");

        WildCat wildCat = new WildCat(4);
        wildCat.voice();
        wildCat.setColor("Black");

        LittleCat littleCat = new LittleCat(7);
        littleCat.voice();
        littleCat.jump();
        littleCat.setColor("Color");

        LittleCat littleCatTwo = new LittleCat(7);
        littleCatTwo.voice();
        littleCatTwo.setColor("Yellow");

        SeaCat seaCat = new SeaCat(6);
        seaCat.voice();
        seaCat.setColor("Blue");
        seaCat.setHeight(20);
        seaCat.swim();

        System.out.println("Cat color = " + cat.getColor());
        System.out.println("WildCat color = " + wildCat.getColor());
        System.out.println("LittleCat color = " + littleCat.getColor());
        System.out.println("LittleCatTwo color = " + littleCatTwo.getColor());
        System.out.println("SeaCat color = " + seaCat.getColor());


    }
}
