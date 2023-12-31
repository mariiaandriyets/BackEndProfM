package com.proftelran.org.lesson5;

import java.util.Arrays;

public class AppArrayTwo {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3}, {4,5,6,9,0},{7}};
        printArray(arr);
        int [] inner = arr[1];
        inner[2] = 15;
        printArray(arr);
        int [] arrUnsort = {2,4,7,8,9,0,4};
        Arrays.sort(arrUnsort);
        System.out.println(Arrays.toString(arrUnsort));
    }

    private static void printArray(int[][] arr) {
        for (int [] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
