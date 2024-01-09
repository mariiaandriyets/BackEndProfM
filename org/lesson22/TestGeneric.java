package com.proftelran.org.lesson22;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("I like ");
        String text = (String) list.get(0); //+ "generics!";
        System.out.println(text);
    }
}
