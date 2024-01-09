package com.proftelran.org.lesson22;

public class GenericTestApp {
    public static void main(String[] args) {
        TestString objOne = new TestString("Hello");
        System.out.println(objOne.getObj());

        TestInteger objTwo = new TestInteger(5);
        System.out.println(objTwo.getObj());

        GenericTest<String> objectThree = new GenericTest<>("Hello");
        System.out.println(objectThree.getObj());

        GenericTest<Integer> objectFour = new GenericTest<>(5);
        System.out.println(objectFour.getObj());

        GenericTest<Double> objectFive = new GenericTest<>(5.5);
        System.out.println(objectFive.getObj());

        GenericTestTwo<String, Integer> objectSix = new GenericTestTwo<>("Hello", 6);
        objectSix.print();

    }
}
