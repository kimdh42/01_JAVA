package com.ohgiraffers.class_object_test01;

public class Application {
    public static void main(String[] args) {

        BookVO bookVO1 = new BookVO();
        System.out.println(bookVO1.getInfomation());

        BookVO bookVO2 = new BookVO("자바의정석", "도우출판", "남궁성");
        System.out.println(bookVO2.getInfomation());

        BookVO bookVO3 = new BookVO("홍길동전", "활빈당", "허균", 500000, 0.5);
        System.out.println(bookVO3.getInfomation());
    }
}
