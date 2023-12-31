package com.proftelran.homework.homework12.taskone;

import java.util.HashMap;

public class HashMapHomeworkApp {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = countSymbolsInString("AAJSnbosadjnajdnck");
        map.forEach((key, value)-> {
            System.out.println("Key = " + key + " value = " + value);
        });
    }

    private static  HashMap<Character, Integer> countSymbolsInString(String string) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i<string.length(); i++) {
            char element = string.charAt(i);
            if (map.containsKey(element)) {
                Integer value = map.get(element);
                map.put(element, value + 1);
            } else {
                map.put(element, 1);
            }
        }
        return map;
    }
}
