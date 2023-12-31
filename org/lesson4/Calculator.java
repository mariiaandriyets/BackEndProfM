package com.proftelran.org.lesson4;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(multiply(2,2));
        System.out.println(multiply(2.2,3.3));
        System.out.println(multiply(2,3,5));

    }

    private static int multiply(int a, int b) {
        return a*b;
    }
    private static int multiply(int a, int b, int c) {
        return a*b;
    }
    private static double multiply(double a, double b) {
        return (a*b);
    }


}
