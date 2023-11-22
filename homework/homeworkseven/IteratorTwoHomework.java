package com.proftelran.homework.homeworkseven;

public class IteratorTwoHomework {

   private int [] integers;
   int index = 0;

    public IteratorTwoHomework(int[] integers) {
        this.integers = integers;
    }

    public boolean hasNext(int [] integers) {
        this.integers = integers;
        if (index == integers.length) {
            return false;
        }
        return true;
    }

    public int next () {
        return integers[index++];
    }


}