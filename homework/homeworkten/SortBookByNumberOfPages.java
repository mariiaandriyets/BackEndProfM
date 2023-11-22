package com.proftelran.homework.homeworkten;

import java.util.Comparator;

public class SortBookByNumberOfPages implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getNumberOfPages() - o2.getNumberOfPages();
    }
}
