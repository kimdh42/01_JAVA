package com.ohgiraffers.section02.userexception;

public class Application1 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
//            et.checkEnoughMoney(50000, 30000);            //가지고 있는 돈보다 상품가격이 비쌀때(NotEnoughMoneyException 반환)
//            et.checkEnoughMoney(-50000, 50000);           //상품 가격이 음수일때(PriceNegativeException 반환)
//            et.checkEnoughMoney(50000, -60000);           //자기고있는 돈이 음수일때(MoneyNegativeException 반환)
            et.checkEnoughMoney(30000,50000);
        } catch (Exception e) {
            e.printStackTrace();
            //printStackTrace() 자바에서 예외가 발생했을때 스택 호출(어떤사항에서 예외가 발생했는지 알려줌)
        }
    }
}
