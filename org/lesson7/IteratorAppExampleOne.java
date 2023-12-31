package com.proftelran.org.lesson7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//каждая структура данных, класс который имплементирует интерфес Collection
// имеет свою собственную реализацию обьекта Iterator

public class IteratorAppExampleOne {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        for (int i = 0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.print(next + " ");
        }
        //-> A -> B -> C -> D -> E
        // каждый вызов метода next сдвигает курсор вправо

        System.out.println();
         Iterator<String> iteratorNew = list.iterator();
        System.out.println(iteratorNew.next());
        System.out.println(iteratorNew.next());
        System.out.println(iteratorNew.next());
    }
}
