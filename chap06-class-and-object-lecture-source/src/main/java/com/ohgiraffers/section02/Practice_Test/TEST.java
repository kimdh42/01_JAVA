package com.ohgiraffers.section02.Practice_Test;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {


        int random =(int)(Math.random() * 101) + 1;               //난수
        Scanner sc = new Scanner(System.in);
        int num = 0;                                              //회차


        while(true) {
            System.out.print("정수를 입력하세요 : ");
            int input = sc.nextInt();
            num++;
            if( input > random) {
                System.out.println("입력하신 정수보다 작습니다.");
            } else if( input < random) {
                System.out.println("입력하신 정수보다 큽니다.");
            } else {
                System.out.println("정답 입니다. " + num + "회 만에 맞추셨습니다.");
                break;
            }
        }
    }
}
