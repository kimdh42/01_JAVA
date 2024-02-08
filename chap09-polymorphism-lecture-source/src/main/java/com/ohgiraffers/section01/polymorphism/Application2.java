package com.ohgiraffers.section01.polymorphism;

public class Application2 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Cat();
        animals[1] = new Tiger();
        animals[2] = new Cat();
        animals[3] = new Tiger();
        animals[4] = new Cat();

        for(int i = 0; i < animals.length; i++) {
            animals[i].cry();
        }
        System.out.println();           //한줄띄기

        /*각 클래스별 고유한 메소드를 동작시키게 하기 위해서는
        * down-casting을 명시적으로 해줘야 하는데,
        * ClassCastException을 방지하기 위해서는 instanceof 연산자를 이용해야 한다.*/

        for(int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Cat) {
                ((Cat) animals[i]).jump();
            } else if(animals[i] instanceof Tiger) {
                ((Tiger) animals[i]).bite();
            } else {
                System.out.println("호랑이나 고양이가 아닙니다.");
            }
        }
    }
}
