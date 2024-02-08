package com.ohgiraffers.class_object_test02;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        StudentVO studentVO = new StudentVO();

        Scanner sc = new Scanner(System.in);

        System.out.print("학년 : ");
        studentVO.setGrade(sc.nextInt());

        System.out.print("반 : ");
        studentVO.setClassroom(sc.nextInt());

        System.out.print("이름 : ");
        studentVO.setName(sc.next());

        System.out.print("키 : ");
        studentVO.setHeight(sc.nextDouble());

        System.out.print("성별 : ");
        studentVO.setGender(sc.next().charAt(0));

        studentVO.printinformation();
    }
}
