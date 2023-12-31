package com.proftelran.org.lesson2;

//класс-родитель, супер класс

public class Cat {

    //переменные - свойства и характеристики
    private int age;

    private String color;

    private int weight;

    public Cat(int age) {
        this.age = age;
    }

    public void voice() {
        System.out.println("Meow!");
    }


    // методы - поведение
    public int getAge() {
        return age;
    }




    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
