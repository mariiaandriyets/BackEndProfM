package com.proftelran.org.lesson9;

public class Man {
    private String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
