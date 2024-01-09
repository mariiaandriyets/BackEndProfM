package com.proftelran.org.lesson22;

public class OnlyNumberTest {
    public static void main(String[] args) {
        OnlyNumber<Integer> integerOnlyNumber = new OnlyNumber<>(1);
//        OnlyNumber<String> hello = new OnlyNumber<>("Hello"); compile error
        OnlyNumber  numberOne = new OnlyNumber<>(4);
        OnlyNumber numberTwo = new OnlyNumber(2L);
//        OnlyNumber numberThree = new OnlyNumber("A"); compile error
    }
}
