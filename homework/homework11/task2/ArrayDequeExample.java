package com.proftelran.homework.homework11.task2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDequeExample {
    public static void main(String[] args) {
        MyArrayDeque myArrayDeque = new MyArrayDeque();
        myArrayDeque.addToHead(8);
        myArrayDeque.addToHead(9);
        myArrayDeque.addToHead(765);
        myArrayDeque.addToTail(4);
        myArrayDeque.addToTail(8658);
        myArrayDeque.addToTail(33);

        System.out.println("ArrayDeque: first = " + myArrayDeque.peekHead() + " last = " + myArrayDeque.peekTail());
        System.out.println("Remove head: " + myArrayDeque.removeHead());
        System.out.println("Remove tail: " + myArrayDeque.removeTail());
        System.out.println("ArrayDeque: first = " + myArrayDeque.peekHead() + " last = " + myArrayDeque.peekTail());


    }
}
