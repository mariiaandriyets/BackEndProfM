package com.proftelran.org.lessonfive;

import java.util.Arrays;

public class AppReference {
    public static void main(String[] args) {
        int count = 5;
        System.out.println("Count before = " + count);
        changeCount(count);
        System.out.println("Count after = " + count);

        count = changeCountWithReturn(count);

        int [] arrayOne = {1,2,3,4,5};
        System.out.println("Print array before " + Arrays.toString(arrayOne));
       changeArray(arrayOne);
        System.out.println("Print array after" + Arrays.toString(arrayOne));

        Person alex = new Person("Alex");
        changePerson(alex);
        System.out.println("Person name " + alex);

    }

    private static void changePerson(Person oleg) {
     oleg.setName("oleg");
    }
    private static void changeArray(int [] arrayOne) {
        arrayOne[0] = 10;
        System.out.println("Print array from method " + Arrays.toString(arrayOne));

    }

    public static void changeCount(int count) {
        count+=10;
        System.out.println("Count from method = " + count);
    }

    public static int changeCountWithReturn(int count) {
        count+=10;
        System.out.println("Count from method = " + count);
        return count;
    }
}
