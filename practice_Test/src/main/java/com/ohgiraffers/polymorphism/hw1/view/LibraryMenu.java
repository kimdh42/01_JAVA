package com.ohgiraffers.polymorphism.hw1.view;

import com.ohgiraffers.polymorphism.hw1.controller.LibraryManager;
import com.ohgiraffers.polymorphism.hw1.model.dto.AniBook;
import com.ohgiraffers.polymorphism.hw1.model.dto.Book;
import com.ohgiraffers.polymorphism.hw1.model.dto.CookBook;
import com.ohgiraffers.polymorphism.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager im = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("성별 : ");
        char gender = sc.next().charAt(0);

        Member member = new Member(name, age, gender);
        im.insertMember(member);


        while(true) {
            System.out.println("==========메뉴==========");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램을 종료합니다");

            int num = sc.nextInt();
            sc.nextLine();

            switch(num) {
                case 1 :
                    System.out.println(im.myinfo());
                break;
                case 2 : selectAll();
                break;
                case 3 : searchBook();
                break;
                case 4 : rentBook();
                break;
                case 0 :
                System.out.println("프로그램 종료");
                return;
            }
        }
    }

    public void selectAll() {

        Book[] bList = im.selectAll();
        for(int i = 0; i < bList.length; i++) {
            System.out.println(i + "번도서 : " + bList[i].getTitle() + " " + bList[i].getAuthor() + " " + bList[i].getPublisher()
                                + " " + (bList[i] instanceof CookBook? ((CookBook) bList[i]).isCoupon() : ((AniBook) bList[i]).getAccessAge()));


        }

    }

    public void searchBook() {

        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.next();
        Book[] searchList = im.searchBook(keyword);

        if(searchList == null || searchList.length == 0) {
            System.out.println("검색 결과가 없습니다.");
            return;
        }

        for(Book book : searchList) {
            System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getPublisher());
        }
    }

    public void rentBook() {

        selectAll();

        System.out.print("대여할 도서를 입력하세요 : ");
        int num = sc.nextInt();
        sc.nextLine();

        int result = im.rentBook(num);
        switch(result) {
            case 0 :
                System.out.println("성공적으로 대여되었습니다.");
                break;
            case 1 :
                System.out.println("나이 제한으로 대여 불가능입니다.");
                break;
            case 2 :
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
                break;
        }

    }

    public LibraryManager getIm() {
        return im;
    }

    public void setIm(LibraryManager im) {
        this.im = im;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
