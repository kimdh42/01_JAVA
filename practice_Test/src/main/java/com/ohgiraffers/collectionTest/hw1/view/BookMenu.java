package com.ohgiraffers.collectionTest.hw1.view;

import com.ohgiraffers.collectionTest.hw1.controller.BookManager;
import com.ohgiraffers.collectionTest.hw1.model.dto.BookDTO;

import java.util.List;
import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);

    BookManager bm = new BookManager();

    public BookMenu() {}

    public void mainMenu() {
        System.out.println("*****도서관리 프로그램*****");
        System.out.println("1. 새 도서 추가");
        System.out.println("2. 도서정보 정렬 후 출력");
        System.out.println("3. 도서 삭제");
        System.out.println("4. 도서 검색출력");
        System.out.println("5. 전체 출력");
        System.out.println("6. 끝내기");

        int input = sc.nextInt();

        switch (input) {
            case 1 :
                BookDTO newBook = inputBook();
                bm.addBook(newBook);
                break;
            case 2:
                List<BookDTO> sortedBook = selectSortedBook();
                bm.printBookList(sortedBook);
                break;
            case 3:
                int bookNoToDelete = inputBookNo();
                bm.deleteBook(bookNoToDelete);
            case 4:
                String bookTitleToSearch = inputBookTitle();
                bm.searchBook(bookTitleToSearch);
            case 5:
                bm.displayAll();
            case 6:
                mainMenu();
        }
    }

    public BookDTO inputBook() {
        System.out.print("도서 제목 : ");
        String title = sc.next();
        System.out.print("도서 장르 (1. 인문 / 2. 자연과학 / 3. 의료 / 4. 기타) : ");
        int category = sc.nextInt();
        System.out.print("도서 저자 : ");
        String author = sc.next();
        return new BookDTO(category,title,author);
    }

    public int inputBookNo() {
        System.out.print("도서 번호 : ");
        return sc.nextInt();
    }

    public String inputBookTitle() {
        System.out.print("도서 제목 : ");
        return sc.nextLine();
    }

    public List<BookDTO> selectSortedBook() {
        System.out.println("도서 정렬방식을 정수로 입력받아서 선택");
        System.out.println("1. 도서번호(ISBN)으로 오름차순 정렬");
        System.out.println("2. 도서번호(ISBN)으로 내림차순 정렬");
        System.out.println("3. 책 제목으로 오름차순 정렬");
        System.out.println("4. 책 제목으로 내림차순 정렬");
        int type = sc.nextInt();

        return bm.sortedBookList(type);
    }




}
