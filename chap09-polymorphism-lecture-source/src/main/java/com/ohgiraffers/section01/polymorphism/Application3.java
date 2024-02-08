package com.ohgiraffers.section01.polymorphism;

public class Application3 {
    public static void main(String[] args) {

        Application3 app3 = new Application3();

        Animal animal1 = new Cat();
        Animal animal2 = new Tiger();

        app3.feed(animal1);         //동일한 타입이기 때문에 가능함
        app3.feed(animal2);


        Cat animal3 = new Cat();
        Tiger animal4 = new Tiger();

        app3.feed((Animal)animal3);         //명시적 형변환
        app3.feed((Animal)animal4);

        app3.feed(animal3);                 //묵시적 형변환 (up-casting Cat -> Animal)
        app3.feed(animal4);

        app3.feed(new Cat());
        app3.feed(new Tiger());
    }

    public void feed(Animal animal) {
        animal.eat();

    }

//    public void feed(Cat cat) {                   //다형성이 적용되지 않으면 이렇게 일일이 적어줘야함
//
//    }
//
//    public void feed(Tiger tiger) {
//
//    }
}
