package com.proftelran.org.lesson23.exceptiontest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestUncheckedHandle {
    public static void main(String[] args) {

        System.out.println("Start code");
        mathOperation(0,5);
        System.out.println("End code");
        System.out.println("Input 1 or 2 to continue our application");
        int inputOption = getInputOption();
        if (inputOption == 1 || inputOption == 2){
            System.out.println("Continue");
        } else {
            System.out.println("End of application");
        }

    }
    private static void mathOperation (int x, int y) {
        try {
            int z = y/x;
            System.out.println("Division y/x = " + z);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero, try another data");
        }
    }

    private static int getInputOption () {
        try ( Scanner scanner = new Scanner(System.in)){
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }
}
