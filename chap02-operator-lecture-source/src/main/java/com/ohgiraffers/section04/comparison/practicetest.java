package com.ohgiraffers.section04.comparison;

public class practicetest {
    public static void main(String[] args) {

        System.out.println("=========실습문제 1===========\n" +
                "정수형 변수 2개를 선언하여, 각 20과 30으로 초기화 한 후,\n" +
                "두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 다음과 같이 출력하세요.");

        int num1 = 20;
        int num2 = 30;

        System.out.println("더하기 결과 : " + (num1 + num2));
        System.out.println("빼기 결과 : " + (num1 - num2));
        System.out.println("곱하기 결과 : " + (num1 * num2));
        System.out.println("나누기한 몫 : " + (num1 / num2));
        System.out.println("나누기한 나머지 : " + (num1 % num2));

        System.out.println("========실습문제 2=========\n" +
                "사각형의 넓이와 둘레를 구하여 출력합니다.너비 12.5 높이 36.4를 변수에 저장하고,\n" +
                "넓이와 둘레를 계산한 뒤 변수에 담아 아래와 같이 출력하세요.");

        double width = 12.5;
        double height = 36.4;

        System.out.println("면적 : " + (width * height));
        System.out.println("둘레 : " + ((width + height) * 2));

        System.out.println("========실습문제 3=========\n" +
                "문자형 변수를 하나 선언하고 'a'를 대입한 후, 문자 'a'가 가지는 유니코드값을 출력하세요.");

        char ch = 'a';

        System.out.println("문자 a의 unicode : " + (int)ch);

        System.out.println("========실습문제 4========\n" +
                "국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤,\n" +
                "총점과 평균을 정수 형태로 출력하세요.");

        double k = 80.5;
        double m = 50.6;
        double e = 70.8;

        System.out.println("총점 : " + (int)(k + m + e));
        System.out.println("평균 : " + (int)((k + m + e)/3));


    }
}
