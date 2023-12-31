package com.proftelran.homework.homework16.searchengine;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Product {

    private int id;
    private String name;

    // color - > Red
    // flavour -> apple
    private Map<Color, Flavour> stringProperties;
    private Map<String, Integer> integerProperties;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Map<String, Integer> getIntegerProperties() {
        return integerProperties;
    }

    public Map<Color, Flavour> getStringProperties() {
        return stringProperties;
    }

    public void addStringProperties(Color color, Flavour flavour) {
        if (this.stringProperties == null) {
            this.stringProperties = new HashMap<>();
        }
        this.stringProperties.put(color, flavour);
    }

    public void addIntegerProperties(String weight, Integer value) {
        if (this.integerProperties == null) {
            this.integerProperties = new HashMap<>();
        }
        this.integerProperties.put(weight, value);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stringProperties=" + stringProperties +
                ", integerProperties=" + integerProperties +
                '}';
    }
}


