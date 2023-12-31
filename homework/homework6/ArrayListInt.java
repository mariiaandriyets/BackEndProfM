package com.proftelran.homework.homework6;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInt {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(7);
        integerList.add(988);
        integerList.add(399);
        System.out.println(integerList);

        List<Integer> doubleList = doubleList(integerList);
        System.out.println(doubleList);

        List<Integer> onlyOddNumbers = oddNumbers(integerList);
        System.out.println(onlyOddNumbers);
    }

    private static List<Integer> doubleList(List<Integer> integerList) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            Integer o = integerList.get(i);
            newList.add(o * 2);
        }
       return newList;
    }

    private static List<Integer> oddNumbers (List<Integer> integerList) {
        List<Integer> newList = new ArrayList<>();
        for (Integer value : integerList) {
            if (value%2 == 0) {
            newList.add(value);
            } else {

            }
        }
        return newList;
    }
}
