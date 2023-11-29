package com.proftelran.homework.homeworkten;

public class Book{
    private String name;
    private String author;
    private int numberOfPages;
    private int publicationDate;
    private String publishingHouse;

    public Book(String name, String author, int numberOfPages, int publicationDate, String publishingHouse) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.publicationDate = publicationDate;
        this.publishingHouse = publishingHouse;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", numberOfPages=" + numberOfPages +
                ", publicationDate=" + publicationDate +
                ", publishingHouse=" + publishingHouse +
                '}';
    }
}
