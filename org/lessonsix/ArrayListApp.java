package com.proftelran.org.lessonsix;

import com.proftelran.org.lessonsix.hwr.CreditCard;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2); //добавить значение в конец списка
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(1,6); // добавляет значение под конкретным номером
        System.out.println(list);
        System.out.println("Size of list = " + list.size()); //size() real size of the list
        System.out.println(list.get(1)); //get(int index) - get element by index

        for (int i = 0; i<list.size(); i++) {
            System.out.println("ELement on index " + i + " = " + list.get(i));
        }
        for (Integer element : list) {
            System.out.println("Element = " + element);
        }
        list.remove(1);
        list.remove(Integer.valueOf(5));
        System.out.println(list);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        System.out.println(stringList);
        stringList.remove(0);

//        CreditCard cardOne = new CreditCard(1000, null);
//        CreditCard cardTwo = new CreditCard(2000, null);

        ArrayList<CreditCard> creditCardList = new ArrayList<>();
        creditCardList.add(new CreditCard(1000, null));
        creditCardList.add(new CreditCard(2000, null));
        System.out.println(creditCardList);

 //        List<CreditCard> creditCards = List.of(new CreditCard(1000, null),
//                new CreditCard(2000, null));
//        System.out.println(creditCards);


    }
}
