package com.proftelran.homework.homework7;

public class IteratorAppTwoHomework {
    public static void main(String[] args) {
        int [] intArray = {9,0,7,5,3};

        IteratorTwoHomework iterator = new IteratorTwoHomework(intArray);
        while (iterator.hasNext(intArray)) {
            System.out.print(iterator.next() + " ");
        }
    }
}
