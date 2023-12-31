package com.proftelran.org.lesson9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestAppSetExampleThree {
    public static void main(String[] args) {
        int [] ints = {1,4,5,3,6,9,2,4,5,9,2};
        boolean duplicate = hasDuplicate(ints);
        System.out.println("This array " + Arrays.toString(ints) +
                " has duplicate : " + duplicate);
        boolean duplicateOptimized = hasDuplicateOptimized(ints);
        System.out.println("This array " + Arrays.toString(ints) +
                " has duplicate : " + duplicateOptimized);

    }
    private static boolean hasDuplicate(int[] ints) {
        Set<Integer> integerSet = new HashSet<>();
        for(int i = 0; i < ints.length; i++) {
            int temp = ints[i];
            if(integerSet.contains(temp)) {
                return true;
            }
           integerSet.add(temp);
        }
        return false;
    }

    private static boolean hasDuplicateOptimized(int[] ints) {
        Set<Integer> integerSet = new HashSet<>();
        for(int value : ints) {
            if(!integerSet.add(value)) {
                return true;
            }
        }
        return false;
    }
}
