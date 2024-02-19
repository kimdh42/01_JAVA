package com.ohgiraffers.collectionTest.hw1.comparator;

import com.ohgiraffers.collectionTest.hw1.model.dto.BookDTO;

import java.util.Comparator;

public class DescBookTitle implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o2.getTitle().compareTo(o1.getTitle());
    }
}
