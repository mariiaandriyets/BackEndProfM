package com.proftelran.org.lesson15;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {

        //Consumer - accept (variable)

        Consumer<Integer> multiplayerAsLambda = integer ->
                System.out.println("Result int * 2 = " +  (integer*2));
        multiplayerAsLambda.accept(6);

        //Multiply all values by 2
        List<Integer> integerList = Arrays.asList(2, 4 ,5 ,6 ,7 ,8,3);
        Consumer<List<Integer>> modify = integerList1 -> {
            for (int i = 0; i<integerList1.size(); i++) {
                integerList1.set(i, integerList1.get(i) *2);
            }
        };
        modify.accept(integerList);
        System.out.println(integerList);
    }
}
