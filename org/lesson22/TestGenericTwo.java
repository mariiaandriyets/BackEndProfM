package com.proftelran.org.lesson22;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestGenericTwo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Java");
        list.add(2);
        for (Object str : list) {
            System.out.println((String) str);
        }
        List<String> stringList= new ArrayList<>();
       stringList.add("Java");

    }
}
