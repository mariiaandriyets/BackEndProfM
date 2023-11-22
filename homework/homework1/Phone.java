package com.proftelran.homework.homework1;

public class Phone {
    private int number;
    private String model;
    private int weight;
    private String name;

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight='" + weight + '\'' +
                '}';


    }

    public void receiveCall (String name) {
        this.name = name;
        System.out.println(name + " is calling");

    }

    public void getNumber (int number) {
        this.number = number;
        System.out.println("Number: " + number );
    }

}
