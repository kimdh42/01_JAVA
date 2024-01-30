package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        /* 스캐너 next 메소드들은 입력한 내용을 버퍼로부터 토큰단위로 분리해서 읽어온다.
        * 그래서 크게 두 가지 사항을 주의해야 한다.
        * 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값을 입력 받을 때
        * 2. 정수, 실수, 논리값 입력 후 next()로 문자열 입력받을 때
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        String str1 = sc.next();            //공백이나 개행문자 전까지를 읽어온다.
        System.out.println("str1 : " + str1);

        sc.nextLine();

        System.out.print("숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();            //정수 값을 읽어온다.
        System.out.println("mun1 : " + num1);

        /* 정수, 실수 논리값 입력 후 nextLine()로 문자열 입력받을 때*/
        System.out.print("다시 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("num2 : " + num2);           // \n 개행문자가 남아있게된다.

        System.out.print("공백이 있는 문자열을 하나 입력해 주세요 : ");

        sc.nextLine();                               // 남아있던 개행문자(\n)을 읽는다.

        String str2 = sc.nextLine();
        System.out.println("str2 : " + str2);

    }
}
