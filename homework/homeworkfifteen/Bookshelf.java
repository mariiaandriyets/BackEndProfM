package com.proftelran.homework.homeworkfifteen;

import com.proftelran.homework.homeworkten.*;

import java.util.*;

public class Bookshelf {
        public static void main (String[]args){

            com.proftelran.homework.homeworkten.Book bookOne = new Book("Gone with the Wind", "Margaret Mitchell",
                    300, 1936, "Unknown");
            com.proftelran.homework.homeworkten.Book bookTwo = new Book("Martin Eden", "Jack London",
                    399, 1909, "World of literature");
            com.proftelran.homework.homeworkten.Book bookThree = new Book("The Memoirs of Sherlock Holmes", "Arthur Conan Doyle",
                    276, 1894, "Detectives");
            com.proftelran.homework.homeworkten.Book bookFour = new Book("Pride and Prejudice", "Jane Austen",
                    327, 1796, "Love Stories");
            com.proftelran.homework.homeworkten.Book bookFive = new Book("The Picture of Dorian Gray", "Oscar Wilde",
                    187, 1890, "Mystery");
            com.proftelran.homework.homeworkten.Book bookSix = new com.proftelran.homework.homeworkten.Book("Death on the Nile", "Agatha Christie",
                    199, 1937, "Detective House");
            com.proftelran.homework.homeworkten.Book bookSeven = new com.proftelran.homework.homeworkten.Book("The Silence of the Lambs", "Thomas Harris",
                    352, 1988, "Horror");

            List<Book> bookList = Arrays.asList(bookOne, bookTwo, bookThree, bookFour, bookFive, bookSix, bookSeven);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Select a type of sorting: 1 - by name, 2 - by Author, 3 - by number of pages, 4 - by publication date, 5 - by publishing house");
            int function = scanner.nextInt();
            scanner.close();
            switch (function) {
                case 1:
//
                    Comparator<Book> sortBookByName = (o1, o2) -> o1.getName().compareTo(o2.getName());
                    Collections.sort(bookList, sortBookByName);
                    for (int i = 0; i < bookList.size(); i++) {
                        System.out.println(bookList.get(i));
                   }
                        break;

                case 2:
                    Comparator<Book> sortBookByAuthor = (o1, o2) -> o1.getAuthor().compareTo(o2.getAuthor());
                    Collections.sort(bookList, sortBookByAuthor);
                    for (int i = 0; i < bookList.size(); i++) {
                        System.out.println(bookList.get(i));
                    }
                    break;

                case 3:
                    Comparator<Book> sortBookByNumberOfPages = (o1, o2) -> o1.getNumberOfPages()-o2.getNumberOfPages();
                    Collections.sort(bookList, sortBookByNumberOfPages);
                    for (int i = 0; i < bookList.size(); i++) {
                        System.out.println(bookList.get(i));
                    }
                    break;

                case 4:
                    Comparator<Book> sortBookByPublicationDate = (o1, o2) -> o1.getPublicationDate()-o2.getPublicationDate();
                    Collections.sort(bookList, sortBookByPublicationDate);
                    for (int i = 0; i < bookList.size(); i++) {
                        System.out.println(bookList.get(i));
                    }
                    break;

                case 5:
                    Comparator<Book> sortBookByPublishingHouse = (o1, o2) -> o1.getPublishingHouse().compareTo(o2.getPublishingHouse());
                    Collections.sort(bookList, sortBookByPublishingHouse);
                    for (int i = 0; i < bookList.size(); i++) {
                        System.out.println(bookList.get(i));
                    }
                    break;

                default:
                    System.out.println("No such option");
            }
        }
    }

