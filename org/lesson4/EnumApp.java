package com.proftelran.org.lesson4;

import java.util.Scanner;

public class EnumApp {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input current day: ");
        String dayAsString = scanner.nextLine().toUpperCase();
        Day input = Day.valueOf(dayAsString);
        switch (input) {
            case FRIDAY:
                System.out.println("It's Friday");
                break;

            case MONDAY:
                System.out.println("blyat");
                break;
            default:
                System.out.println("other");

        }

    }
    public static void printAllDays () {
        Day [] values = Day.values();
        for (Day value : values) {
            System.out.println(value);
        }
    }





}
