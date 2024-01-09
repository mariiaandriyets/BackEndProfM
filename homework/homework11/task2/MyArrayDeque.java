package com.proftelran.homework.homework11.task2;

import com.proftelran.org.lesson8.Node;

public class MyArrayDeque implements MyDeque {
    private Integer[] elements;
    private int head;
    private int tail;
    private int count;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayDeque() {
        this.elements = new Integer[DEFAULT_CAPACITY];
        this.head = -1;
        this.tail = -1;
        this.count = 0;
    }

    @Override
    public void addToHead(Integer element) {
        grow();
        if (isEmpty()) {
            tail = head = 0;
        }else {
            head = (head -1 + elements.length) % elements.length;
        }
        elements[head] = element;
        count++;
    }

    @Override
    public void addToTail(Integer element) {
        grow();
        if (isEmpty()) {
            tail = head = 0;
        } else {
            tail = (tail + 1) % elements.length;
        }
        elements[tail] = element;
        count++;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public Integer removeHead() {
        if (isEmpty()) {
            return 0;
        }
        Integer removed = elements[head];
        if (head == tail) {
            head = tail = -1;
        } else {
            head = (head + 1) % elements.length;
        }
        count--;
        return removed;
    }

    @Override
    public Integer removeTail() {
       if (isEmpty()) {
           return 0;
       }
       Integer removed = elements[tail];
       if (head == tail) {
           head = tail = -1;
       } else {
           tail = (tail - 1 + elements.length) % elements.length;
       }
       count--;
       return removed;
    }

    @Override
    public Integer peekHead() {
       if (isEmpty()) {
           return 0;
       }
       return elements[head];
    }

    @Override
    public Integer peekTail() {
        if (isEmpty()) {
            return 0;
        }
        return elements[tail];
    }

    public void grow () {
        if (count == elements.length) {
            int length = elements.length;
            Integer[] grow = new Integer[(int) (length * 1.5)];
            int index = 0;
            for (int i = head; i!= tail; i = (i+1) % elements.length) {
                 grow[index++] = elements[i];
            }
            grow[index] = elements[tail];
            head = 0;
            tail = index;
            elements = grow;

        }
    }
}
