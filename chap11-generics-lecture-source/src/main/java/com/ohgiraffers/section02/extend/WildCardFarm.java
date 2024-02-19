package com.ohgiraffers.section02.extend;

public class WildCardFarm {

    /* 토끼농장에 있는 토끼가 어떤 토끼이던 상관 없다.*/
    public void anyType(RabbitFarm<?> farm) {
        farm.getAnimal().cry();
    }

    /* 토끼농장의 토끼는 Bunny이거나 그 후손 타입으로 만들어진 토끼농장만 매개변수로 사용가능 */
    public void extendsType(RabbitFarm<? extends Bunny> farm) {
        farm.getAnimal().cry();
    }

    /* Bunny이거나 그 부모타입 으로 만들어진 토끼농장만 매개변수로 사용가능 */
    public void superType(RabbitFarm<? super Bunny> farm) {
        farm.getAnimal().cry();
    }
}
