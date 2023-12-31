package com.proftelran.org.lesson1;

public class Dog {

    //lowerCamelCase
    private String breed;

   private int age;

   private String color;

   private int weight;

    public Dog() {
        System.out.println("Hello from construct without params");
    }

    public Dog (String breed, String color) {
        System.out.println("Hello from construct with params");
        this.breed = breed;
        this.color = color;
    }

    public Dog(String breed, int age, String color, int weight) {
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public void setColor (String color) {
       this.color = color;
   }

   public String getColor() {
       return color;
   }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
