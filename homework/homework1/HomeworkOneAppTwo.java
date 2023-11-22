package com.proftelran.homework.homework1;

public class HomeworkOneAppTwo {
    public static void main(String[] args) {

        Phone Iphone1 = new Phone();
        Iphone1.receiveCall("Mary");
        Iphone1.getNumber(764987372);

        Phone Iphone2 = new Phone();
        Iphone2.receiveCall("Mikhail");
        Iphone2.getNumber(736290384);

        Phone Iphone3 = new Phone();
        Iphone3.receiveCall("John");
        Iphone3.getNumber(793726384);

        System.out.println("Iphone1 features: " + Iphone1.getNumber() + " " + Iphone1.getModel() + " " + Iphone1.getWeight());
        System.out.println("Iphone2 features: " + Iphone2.getNumber() + " " + Iphone2.getModel() + " " + Iphone2.getWeight());
        System.out.println("Iphone3 features: " + Iphone3.getNumber() + " "  + Iphone3.getModel() + " " + Iphone3.getWeight());





    }
}

