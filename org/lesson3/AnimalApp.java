package com.proftelran.org.lesson3;

public class AnimalApp {
    public static void main(String[] args) {
        Whale whale = new Whale("Whale");
        Elephant elephant = new Elephant("Slon");

        System.out.println("I am a whale, my name is " + whale.getName());
        System.out.println("I am an elephant, my name is " + elephant.getName());

        Bird bird = new Bird();

        Flyable[] flyables = {bird, whale};
        Eatable[] eatables = {bird, whale};


        for (Flyable flyable : flyables) {
            flyable.fly();
        }

        for (Eatable eatable: eatables) {
           if (eatable.canEat()) {
               System.out.println("Eat me");
           }
        }


    }
}

