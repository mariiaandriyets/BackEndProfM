package com.proftelran.org.lessonfifteen;

@FunctionalInterface
// функциональный интерфейс может содержать только ОДИН абстрактный метод, который можно переопределить
        // -> лямбда выражение, которое инициализирует некий метод некого функционального интерфейса
public interface Multiplayer {
    void multiply(int value);

    default void printHello() {
        System.out.println("Hello");
    }

    static void printWelcome () {
        System.out.println("Welcome");
    }
}
