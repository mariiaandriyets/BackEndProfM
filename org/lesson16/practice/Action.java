package com.proftelran.org.lesson16.practice;

@FunctionalInterface
public interface Action {
    void action(int code, HttpCodes enumCode);
}
