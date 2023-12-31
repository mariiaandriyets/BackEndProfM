package com.proftelran.org.lesson23.custom;

public class CustomApp {
    public static void main(String[] args) {
        generateChecked(0);
        generateUnchecked(0);

    }
    private static void generateChecked (int value) {
        if(value == 0) {
            try {
                throw new CustomCheckedException();
            } catch (CustomCheckedException e) {
                e.printStackTrace();
            }
        }
    }
    private static void generateUnchecked(int value) {
        if (value == 0) {
            throw new CustomUncheckedException();
        }
    }
}
