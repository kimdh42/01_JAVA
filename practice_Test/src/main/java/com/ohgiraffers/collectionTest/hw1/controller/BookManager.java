package com.ohgiraffers.collectionTest.hw1.controller;

import com.ohgiraffers.collectionTest.hw1.comparator.AscBookNo;
import com.ohgiraffers.collectionTest.hw1.comparator.AscBookTitle;
import com.ohgiraffers.collectionTest.hw1.comparator.DescBookNo;
import com.ohgiraffers.collectionTest.hw1.comparator.DescBookTitle;
import com.ohgiraffers.collectionTest.hw1.model.dto.BookDTO;

import java.util.*;

public class BookManager {



    private ArrayList<BookDTO> booklist;

    public BookManager() {
        ArrayList<BookDTO> booklist = new ArrayList<>();
    }

    public void addBook(BookDTO book) {
        booklist.add(book);
    }

    public void deleteBook(int key) {
        if(key >= 0 && key < booklist.size()) {
            booklist.remove(key);
        }
    }

    public void searchBook(String title) {
        for(BookDTO book : booklist) {
            if (book.getTitle().equals(title)); {
                System.out.println(book);
            }
        }
        System.out.println("조회된 도서가 목록에 없습니다.");
    }

    public void displayAll() {
        for(BookDTO book : booklist) {
            System.out.println(book);
        }
    }

    public List<BookDTO> sortedBookList(int type) {
        switch (type) {
            case 1:
                booklist.sort(new AscBookNo());
                break;
            case 2:
                booklist.sort(new DescBookNo());
                break;
            case 3:
                booklist.sort(new AscBookTitle());
                break;
            case 4:
                booklist.sort(new DescBookTitle());
                break;
        }
        return booklist;
    }

    public void printBookList(List<BookDTO> printList) {
        for(BookDTO book : printList)
        System.out.println(book);
    }
}
