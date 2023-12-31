package com.proftelran.org.lesson12;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // key  value
        // hello -> 5
        // world -> 15
        // again -> 3
        // hi -> 10
        // next -> 15

        map.put("hello", 5);
        map.put("world", 15);
        map.put("again", 30);
        map.put("hi", 10);
        map.put("next", 15);
        //дубликаты ключей недопустимы

        printMap(map);
        map.put("again", 2);
        System.out.println();
        printMap(map);
        System.out.println();
        printMapVersionTwo(map);

        // получить значение по ключу
        Integer integer = map.get("world");
        System.out.println(integer);

        // "hello" -> hashCode() -> (int, length) - hash -> index in table
        // -> Node -> Node <String, Integer> hello, 5 (if empty in cell)
        // -> iterate Node -> equals "hello" -> Node<String, Integer>

        //get "hello" -> hashCode() -> (int, length) - hash -> index in table
        //Node<String, Integer> node -> node.key equals ("hello") -> value
    }

    private static void printMapVersionTwo(Map<String, Integer> map) {
        map.forEach((key, value) -> {
            System.out.println("Pair : key = " + key + " , value = " + value);
        });

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
        }
    }


    private static void printMap(Map<String, Integer> map) {
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Pair : key = " + key + " , value = " + value);
        }
    }
}
