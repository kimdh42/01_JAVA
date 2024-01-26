package com.ohgiraffers.section03.constant;

import java.sql.SQLOutput;

public class Application1 {
    public static void main(String[] args) {

        /* 필기. 상수란??
        * 변수가 메로리에 변경될 값을 저장하기 위한 공간을 나타낸다면, 상수는 이와 상반되는 개념이다.
        * 변하지 않는 값을(항상 고정된 값을) 저장해두기 위한 메로리상의 공간을 상수라고 한다.
        *
        * 필기. 상수의 사용 목적
        *  변경되지 않는 고정된 값을 저장할 목적으로 사용한다.
        *  초기화 이후 값 대입 시 컴파일 에러를 발생시켜 값이 수정되지 못하도록 한다.
        *  예) 수학 공식에 사용되는 수치 등*

        * 필기. 사용방법
        *  1. 상수를 선언한다. ( 변수 선언과 유사하지만 final 키워드를 사용함)
        *  2. 값을 초기화 한다. ( 초기화 이후에는 값 변경 불가능함)
        *  3. 필횽한 위치에 상수를 호출해서 사용한다.
        * */

        final int AGE;

        AGE = 20;
//        AGE = 30;     // 한번 초기화 한 이후 값을 재 대입하는 것은 불가능하다.

        System.out.println("AGE의 값 : " + AGE);

        System.out.println("AGE의 2배 : " + (AGE * 2));

        int sum = AGE;          //대입 연사자의 오른 편에는 기술 가능함
//        int AGE = AGE + 10;   //대입 연산자의 왼쪽 편에는 기술 불가능함
    }
}
