package com.ohgiraffers.teamPractice1.point.view;

import com.ohgiraffers.teamPractice1.point.controller.CircleController;
import com.ohgiraffers.teamPractice1.point.controller.RectangleController;

import java.util.Scanner;

public class PointMenu {

    Scanner sc = new Scanner(System.in);
    CircleController cc = new CircleController();
    RectangleController rc = new RectangleController();

    public void mainMenu() {
        System.out.print("*****메뉴*****");
        System.out.print("1. 원 : ");
        System.out.print("2. 사각형 : ");
        System.out.print("9. 끝내기");
        System.out.print("메뉴 번호 : ");
        int input = sc.nextInt();

        if(input == 1) {
            circleMenu();
        } else if(input == 2 ) {
            rectangleMenu();
        } else if(input == 9) {
            System.out.println("프로그램을 종료합니다.");
            return;
        } else {
            System.out.println("잘못 입력 하였습니다. 번호를 다시 입력해 주세요");
            this.mainMenu();
        }
    }

    public void circleMenu() {
        System.out.println("*****원 메뉴*****");
        System.out.println("1. 원 둘레");
        System.out.println("2. 원 넓이");
        System.out.println("9. 메인으로");
        System.out.print("메뉴 번호 : ");
        int input = sc.nextInt();

        if(input == 1) {
            calcCircum();
        } else if(input == 2) {
            calcCircleArea();
        } else if(input == 9) {
            mainMenu();
        } else {
            System.out.println("잘못 입력 하였습니다. 번호를 다시 입력해 주세요");
            this.circleMenu();
        }
    }

    public void rectangleMenu() {
        System.out.println("*****사각형 메뉴*****");
        System.out.println("1. 사각형 둘레");
        System.out.println("2. 사각형 넓이");
        System.out.println("9. 메인으로");
        System.out.print("메뉴 번호 : ");
        int input = sc.nextInt();

        if(input == 1) {
            calcPerimeter();
        } else if(input == 2) {
            calcRectArea();
        } else if(input == 9) {
            mainMenu();
        } else {
            System.out.println("잘못 입력 하였습니다. 번호를 다시 입력해 주세요");
            this.rectangleMenu();
        }
    }

    /* 원 둘레 */
    public void calcCircum() {
        System.out.print("x 좌표 : ");
        int x = sc.nextInt();
        System.out.print("y 좌표 : ");
        int y = sc.nextInt();
        System.out.print("반지름 : ");
        int radius = sc.nextInt();

        cc.calcCircum(x, y, radius);
    }

    /* 원 넓이 */
    public void calcCircleArea() {
        System.out.print("x 좌표 : ");
        int x = sc.nextInt();
        System.out.print("y 좌표 : ");
        int y = sc.nextInt();
        System.out.print("반지름 : ");
        int radius = sc.nextInt();

        cc.calcArea(x, y, radius);
    }

    /* 사각형 둘레 */
    public void calcPerimeter() {
        System.out.print("x 좌표 : ");
        int x = sc.nextInt();
        System.out.print("y 좌표 : ");
        int y = sc.nextInt();
        System.out.print("높이 : ");
        int height = sc.nextInt();
        System.out.print("너비 : ");
        int width = sc.nextInt();

        rc.calcPerimeter(x, y, height, width);
    }

    /* 사각형 넓이 */
    public void calcRectArea() {
        System.out.print("x 좌표 : ");
        int x = sc.nextInt();
        System.out.print("y 좌표 : ");
        int y = sc.nextInt();
        System.out.print("높이 : ");
        int height = sc.nextInt();
        System.out.print("너비 : ");
        int width = sc.nextInt();

        rc.calcArea(x, y, height, width);
    }
}
