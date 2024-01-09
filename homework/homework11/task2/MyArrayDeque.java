package com.proftelran.homework.homework11.task2;

import com.proftelran.org.lesson8.Node;

public class MyArrayDeque implements MyDeque {

    private static final int DEFAULT_CAPACITY = 10;

    private Integer[] elements;
    private int headIndex;
    private int tailIndex;
    private int countOfElements;

    @Override
    public void addToTail(Integer element) {

    }

    public MyArrayDeque() {
        elements = new Integer[DEFAULT_CAPACITY];
    }

    public int getHeadIndex (int a, int b) {
        for (a = b-1; a>0; a--) {
        }
        return a;
    }
    @Override
    public void addToHead(Integer [] element) {
        if (element == null) {
           throw new NullPointerException();
        }
        Integer[] integer = elements;
        for (int i = element.length; i<0; i--) {
            elements[getHeadIndex(headIndex, elements.length)] = element[i];
        }
    }
    public void print () {
            for (Integer integer : elements) {
                    System.out.println(integer);
                }
        }

//    public void insert(int key, String value) {
//        Node newNode = new Node(key, value);
//        if (root == null) { // if tree doesn't exist
//            root = newNode;
//            return;
//        }
//
//        Node current = root; // вершина
//        Node parent = null;
//
//        while (true) {
//            parent = current;
//            if (key == current.getKey()) {
//                return;
//            }
//            if (key < current.getKey()) { // go left
//                current = current.getLeft();
//                if(current == null) {
//                    parent.setLeft(newNode);
//                    return;
//                }
//            } else { // go right
//                current = current.getRight();
//                if (current == null) {
//                    parent.setRight(newNode);
//                    return;
//                }
//            }
//        }

//    @Override
//    public void addToTail(Integer element) {
//        Integer[] integers = new Integer[DEFAULT_CAPACITY];
//        if (elements == null) {
//            elements = integers;
//            return;
//        }
//        if ()
//        headIndex = 0;
//        if (elements[headIndex] != null) {
//            tailIndex = headIndex+1;
//            elements[tailIndex] = element;
//            headIndex++;
//        }
//    }

    public void pushToTail(int data){
     data = 0;
    }
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Integer removeHead() {
        return null;
    }

    @Override
    public Integer removeTail() {
        return null;
    }

    @Override
    public Integer peekHead() {
        return null;
    }

    @Override
    public Integer peekTail() {
        return null;
    }

    private void grow(){
        //elements * 1.5


    }
}
