package com.proftelran.homework.homework10;

import java.util.Comparator;

public class SortBookByPublishingHouse implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPublishingHouse().compareTo(o2.getPublishingHouse());
    }
}
