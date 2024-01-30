package com.ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {

        /* 매개변수와 리턴값 복합 활용*/

        int first = 20;
        int second = 10;

        Application7 app7 = new Application7();
        System.out.println("더하기 : " + app7.plusTwoNumber(first, second));
        System.out.println("빼기 : " + app7.minusTwoNumber(first, second));
        System.out.println("곱하기 : " + app7.multipleTwoNumber(first, second));
        System.out.println("나누기 : " + app7.divideTwoNumber(first, second));
    }
    public int plusTwoNumber(int first, int second) {
        return first + second;
    }
    public int minusTwoNumber(int first, int second) {
        return first - second;
    }
    public int multipleTwoNumber(int first, int second) {
        return first * second;
    }
    public int divideTwoNumber(int first, int second) {
        return first / second;
    }
}
