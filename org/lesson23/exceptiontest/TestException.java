package com.proftelran.org.lesson23.exceptiontest;

import java.io.FileNotFoundException;
import java.io.FileReader;

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

        //Example unchecked exception
        int x = 0;
        int y = 10;
        mathOperation(x,y);

    }
    private static void mathOperation (int x, int y) {
        int z = y/x;
        System.out.println("Division y/x = " + z);

    }

}
