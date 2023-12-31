package com.proftelran.org.lesson12;

import java.util.HashMap;
import java.util.Map;

public class TestArrayHashMap {
    public static void main(String[] args) {
        int [] arr = {1,7,4,3,4,4,8,7};
        int k = 3;

        Map<Integer, Integer> map = new HashMap<>();
        for (int element : arr) {
            if(map.containsKey(element)) {
                int value = map.get(element);
                map.put(element, value + 1);
            } else {
                map.put(element, 1);
            }
        }
        map.forEach((key,value)-> {
            System.out.println("Key = " + key + " value = " + value);
        });

        // {1,7,4,3,4,8,7}
        for (int i = 0; i<arr.length; i++){
            int current = arr[i];
            Integer value = map.get(current);
            if(value == k) {
                System.out.println("First element " + current + " contains " + k + " times");
                break;
            }


        }
    }
}
