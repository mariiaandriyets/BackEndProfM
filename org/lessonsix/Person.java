package com.proftelran.org.lessonsix;

public class Person {
    private String name;
    //"пусть будет по правильному, плохо мы всегда успеем сделать" @препод

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
