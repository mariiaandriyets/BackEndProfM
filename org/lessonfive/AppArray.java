package com.proftelran.org.lessonfive;

public class AppArray {
    public static void main(String[] args) {
        int [] arrayThree = {1,2,3,4,5};
        int [] arrayTwo = {1,2,3,4,5};
        if (arrayThree == arrayTwo) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
 // сравнивая через двойное равенство ссылочный тип данных мы сравниваем только ссылки
        String one = "One";
        String two = "One";
        if (one == two) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        // в ситуации выше будет равно ибо ссылка будет одна

        String three = new String("One");
        String four = new String("One");
        if (one == three) {
            System.out.println("Yes");
        }
        else if (three == four){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }

}
