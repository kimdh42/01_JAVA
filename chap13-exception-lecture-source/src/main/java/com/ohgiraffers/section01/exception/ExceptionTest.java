package com.ohgiraffers.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws Exception {

        System.out.println("가지고 계신 돈은" + money + "원 입니다.");

        if(money >= price) {
            System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
        } else {                                      //오류시 else문 출력

            throw new Exception();
        }
        System.out.println("즐거운 쇼핑 하세요~");       //오류 발생시 출력 X
    }
}
