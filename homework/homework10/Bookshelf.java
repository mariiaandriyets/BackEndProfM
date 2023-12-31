package com.proftelran.homework.homework10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bookshelf {
    public static void main(String[] args) {

        Book bookOne = new Book("Gone with the Wind","Margaret Mitchell",
                300, 1936, "Unknown");
        Book bookTwo = new Book("Martin Eden", "Jack London",
                399, 1909,"World of literature");
        Book bookThree = new Book("The Memoirs of Sherlock Holmes", "Arthur Conan Doyle",
                276, 1894, "Detectives");
        Book bookFour = new Book("Pride and Prejudice", "Jane Austen",
                327, 1796,"Love Stories");
        Book bookFive = new Book("The Picture of Dorian Gray", "Oscar Wilde",
                187, 1890,"Mystery");
        Book bookSix = new Book("Death on the Nile", "Agatha Christie",
                199, 1937,"Detective House");
        Book bookSeven = new Book("The Silence of the Lambs", "Thomas Harris",
                352, 1988, "Horror");

        List<Book> bookList = Arrays.asList(bookOne, bookTwo, bookThree, bookFour, bookFive,bookSix, bookSeven);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a type of sorting: 1 - by name, 2 - by Author, 3 - by number of pages, 4 - by publication date, 5 - by publishing house");
        int function = scanner.nextInt();
        scanner.close();
        switch (function) {
            case 1 :
                Collections.sort(bookList, new SortBookByName());
                for (int i = 0; i<bookList.size(); i++) {
                    System.out.println(bookList.get(i));
                }
                break;

            case 2:
                Collections.sort(bookList, new SortBookByAuthor());
                for (int i = 0; i<bookList.size(); i++) {
                    System.out.println(bookList.get(i));
                }
                break;

            case 3:
                Collections.sort(bookList, new SortBookByNumberOfPages());
                for (int i = 0; i<bookList.size(); i++) {
                    System.out.println(bookList.get(i));
                }
                break;

            case 4:
                Collections.sort(bookList, new SortBookByPublicationDate());
                for (int i = 0; i<bookList.size(); i++) {
                    System.out.println(bookList.get(i));
                }
                break;

            case 5:
                Collections.sort(bookList, new SortBookByPublishingHouse());
                for (int i = 0; i<bookList.size(); i++) {
                    System.out.println(bookList.get(i));
                }
                break;

            default:
                System.out.println("No such option");
        }
    }
}
