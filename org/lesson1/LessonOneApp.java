package com.proftelran.org.lesson1;

//UpperCamelCase

public class LessonOneApp {
    public static void main(String[] args) {

       Dog shepherd = new Dog();
       shepherd.setColor("White");
       shepherd.setAge(30);
       shepherd.setBreed("shepherd");

       Dog angryDog = new Dog();
       angryDog.setBreed("bull");
       angryDog.setColor("Black");
       angryDog.setAge(10);

       Dog littleDog = new Dog("chihuahua", "red");
       littleDog.setAge(5);

        Dog topDog = new Dog("top dog", 4, "red", 10);


        System.out.println(shepherd);
        System.out.println(angryDog);
        System.out.println(littleDog);
        System.out.println(topDog);

        System.out.println("Shepherd's color is " + shepherd.getColor());




    }
}
