package com.proftelran.org.lesson22;

public class GenericMethodTest {
    public static void main(String[] args) {

      printClassName("Hello");
      printClassName(5);
      printClassName(1.0);

      printClassNameTwo("Hello again");
      printClassNameTwo(6);
      printClassNameTwo(1.5);

    }
    private static void printClassName(Object e){
        System.out.println(e.getClass().getName() + " = " + e);
    }

    private static <T> void printClassNameTwo(T e){
        System.out.println(e.getClass().getName() + " = " + e);
    }

}
