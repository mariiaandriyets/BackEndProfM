package com.proftelran.org.lesson23.exceptiontest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TestException {
    // Throwable

    // 1. Errors - не трогаем и не обрабатываем
    // 2. Exceptions - пробуем обработать, создаем свои, генерируем
    // работаем только с пунктом 2

    // Checked - проверяемые (проверяются при компиляции и требуют обработки)
    // Unchecked - непроверяемые, появляются в рантайме и не требуют обработки на этапе компиляции

    // Пользовательские исключения - extends from RuntimeException

    public static void main(String[] args) {
        //Example checked exception
        try {
            FileReader fileReader = new FileReader("//user/user/one.txt");
        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
            //exception.printStackTrace();
        }

        //Example unchecked exception with scanner
        int x = 0;
        int y = 10;

        Scanner scanner = new Scanner(System.in);
        int result = -1;
        while (result != 9) {
            result = scanner.nextInt();
            System.out.println(y/result);
        }

        //Example unchecked exception with x and y variable
        mathOperation(x,y);

    }
    private static void mathOperation (int x, int y) {
        int z = y/x;
        System.out.println("Division y/x = " + z);

    }

}
