package com.proftelran.org.lessonten;

import java.util.Objects;

public class Cat implements Comparable<Cat>{
   private String name;
   private int age;


    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
         public boolean equals(Object obj) {
           //1. check that tro objects link to one object
           if(this == obj) {
             return true;
       }
             //2. check that obj is not null
             if (obj == null) {
                 return false;
             }
             //3. check that this and obj it is the same class
             if (!(obj instanceof Cat)) {
               return false;
             }

     // convert variable to class type
             Cat cat = (Cat) obj;
             // 4. compare by fields
             return Objects.equals(this.name, cat.name) && this.age == cat.age;
         }




    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return this.name.compareTo(o.name);
        //сортировка по одному полю
    }
}
