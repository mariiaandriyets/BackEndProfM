package com.proftelran.homework.homework7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorAppOneHomework {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<10000000; i++) {
           list.add(i);
        }

        //1
        long startOne = System.currentTimeMillis();
        for (int element : list) {
            int temp = element;
        }
        System.out.println();
        long endOne = System.currentTimeMillis();
        System.out.println("Time for execute is " + (endOne-startOne));

        //2
        System.out.println();
        long startTwo = System.currentTimeMillis();
        for (int i = 0; i<list.size(); i++) {
        int temp = list.get(i);
        }
        System.out.println();
        long endTwo = System.currentTimeMillis();
        System.out.println("Time for execute is " + (endTwo-startTwo));

        //3
        System.out.println();
        long startThree = System.currentTimeMillis();
        int o = list.size();
        for (int i = 0; i<o; i++) {
            int temp = list.get(i);
        }
        System.out.println();
        long endThree = System.currentTimeMillis();
        System.out.println("Time for execute is " + (endThree-startThree));

        //4
        System.out.println();
        long startFour = System.currentTimeMillis();
        int p = list.size();
        for (int i = p-1; i>=0; i--) {
            int temp = list.get(i);
        }
        System.out.println();
        long endFour = System.currentTimeMillis();
        System.out.println("Time for execute is " + (endFour-startFour));

        //5
        System.out.println();
        long startFive = System.currentTimeMillis();
        Iterator<Integer> iteratorOne = list.iterator();
        while (iteratorOne.hasNext()) {
            int next = iteratorOne.next();
        }
        System.out.println();
        long endFive = System.currentTimeMillis();
        System.out.println("Time for execute is " + (endFive-startFive));

        //6
        System.out.println();
        long startSix = System.currentTimeMillis();
        ListIterator<Integer>iteratorTwo = list.listIterator();
        while (iteratorTwo.hasNext()) {
        }
        System.out.println();
        long endSix = System.currentTimeMillis();
        System.out.println("Time for execute is " + (endSix-startSix));
    }
}
