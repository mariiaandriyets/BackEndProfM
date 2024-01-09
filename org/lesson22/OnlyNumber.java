package com.proftelran.org.lesson22;

import com.proftelran.homework.homework12.tasktwo.Storage;

public class OnlyNumber<T extends Number> { //Может принимать типы данных всех наследников Number
    private T number;
    public OnlyNumber(T number) {
        this.number = number;
    }
    public void print() {
        System.out.println(number);
    }
}
