package com.proftelran.homework.homework1;

public class HomeworkOneApp {
    public static void main(String[] args) {

        Person Oleg = new Person();
        Oleg.setName("Oleg");
        Oleg.setFullName("Oleg Romanov");
        Oleg.setAge(68);
        Oleg.move();
        Oleg.talk();

        Person Olga = new Person("Olga", "Olga Smirnoff", 45);
        Olga.move();
        Olga.talk();

        System.out.println(Oleg);
        System.out.println(Olga);



    }
}
