package com.proftelran.org.lesson16;

import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class TestSupplier {
    public static void main(String[] args) {
        Random randomOne = new Random();
        int i = randomOne.nextInt();

        IntSupplier intSupplier = () -> randomOne.nextInt();
        System.out.println(intSupplier.getAsInt());

        Random randomTwo = new Random();
        double v = randomTwo.nextDouble();

        DoubleSupplier doubleSupplier = () -> randomTwo.nextDouble();
        System.out.println(doubleSupplier.getAsDouble());

        Random randomThree = new Random();
        long o = randomThree.nextLong();

       LongSupplier longSupplier = () -> randomThree.nextLong();
        System.out.println(longSupplier.getAsLong());

        Random randomFour = new Random();
        boolean p = randomTwo.nextBoolean();

        BooleanSupplier booleanSupplier = () -> randomFour.nextBoolean();
        System.out.println(booleanSupplier.getAsBoolean());

    }
}
