package com.ohgiraffers.section01.extend;

public class FireCar extends Car{
                     //원래 클래스명 뒤에 (extends 클래스명)을 적으면 FireCar 클래스가 Car 클래스 상속받는다.

    public FireCar() {
        super();        //부모의 기본생성자를 호출하는 구문
        System.out.println("FireCar클래스 기본생성자 호출됨");
    }

    /*
    * @Override 어노테니션
    * 오버라이딩 성립 요건을 체크하여 성립되지 않는 경우 컴파일 에러를 발생시킨다.
    * 오버라이딩 하는 메소드는 기본적으로 부모 메소드 선언 내용을 그대로 작성해야 한다.
    * */

    @Override
    public void soundHorn() {
        if(isRunning()) {
            System.out.println("빠아아아아아앙~~~빠아아아앙!!!!!!!");
        } else {
            System.out.println("소방차가 앞으로 갈 수 없습니다~ 비키세요 비켜~~");
        }
    }
    /* 물 뿌리는 기능 추가 */
    public void sprayWater() {
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다 ==============>>>>>>");
    }
}


