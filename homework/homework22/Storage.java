package com.proftelran.homework.homework22;

import java.util.HashMap;
import java.util.Map;

public class Storage<T> {
    private Map <T, Integer> map;

    public void addElement(T element, Integer count) {
        if (this.map == null) {
            this.map = new HashMap<>();
        }
        this.map.put(element, count);
    }

    public Map<T, Integer> getElements() {
        if (this.map == null) {
            this.map = new HashMap<>();
        }
       return this.map;
    }
}
