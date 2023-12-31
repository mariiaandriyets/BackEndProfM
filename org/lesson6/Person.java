package com.proftelran.org.lesson6;

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
