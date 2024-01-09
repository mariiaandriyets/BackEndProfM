package com.proftelran.org.lesson23.custom;

public class CustomApp {
    public static void main(String[] args) {
        generateChecked(0);
        System.out.println("All ok after checked exception");

        try {
            generateUnchecked(0);
        } catch (CustomUncheckedException e) {
            System.out.println("Handle unchecked exception");
        }

        System.out.println("All ok after checked exception");

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
    private static void generateUnchecked(int value) throws CustomUncheckedException {
        if (value == 0) {
            throw new CustomUncheckedException();
        }
    }
}
