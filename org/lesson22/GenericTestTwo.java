package com.proftelran.org.lesson22;

public class GenericTestTwo<T, U>{

    private T objOne;
    private U objTwo;

    public GenericTestTwo(T objOne, U objTwo) {
        this.objOne = objOne;
        this.objTwo = objTwo;
    }

    public void print() {
        System.out.println(objOne);
        System.out.println(objTwo);
    }
}
