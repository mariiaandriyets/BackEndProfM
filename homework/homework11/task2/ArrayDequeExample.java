package com.proftelran.homework.homework11.task2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        MyArrayDeque myArrayDeque = new MyArrayDeque();

        Integer [] k = {9,7,5,3};
        myArrayDeque.addToHead(k);
      myArrayDeque.print();

    }
}
