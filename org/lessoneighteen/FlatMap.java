package com.proftelran.org.lessoneighteen;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        //1. Arrays.stream
      int [][] arr = {{1,2,3}, {17,13,15}, {7,8,23}};
        Arrays.stream(arr).flatMapToInt(Arrays::stream).forEach(x -> System.out.print(x + " "));
        System.out.println();

        String [][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        //2. Stream.of
        Stream.of(array)//Stream<String[]>
                .flatMap(x -> Stream.of(x)) //Stream<String>
                .filter(x ->!"a".equals(x)) //filter
                .forEach(x -> System.out.print(x + " ")); //sout





    }
}
