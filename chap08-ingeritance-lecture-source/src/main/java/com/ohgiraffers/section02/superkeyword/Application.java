package com.ohgiraffers.section02.superkeyword;

public class Application {
    public static void main(String[] args) {




        /*[super]
         * 자식클래스를 이용해서 객체를 생성할 때 부모 생성자를 호출하여 부모클래스의 인스턴스도 함께 생성된다.
         * 이때 생성한 부모의 인스턴스 주소를 보관하는 래퍼런스 변수로
         * 자식클래스 내의 모듣ㄴ 생성자와 메소드 내에서 선언하지 않고 쓸 수 있다.
         *
         * [super()]
         * 부모생성자를 호출하는 구문으로 인자와 매개변수의 타입, 갯수, 순서가 일치하는 부모의 생성자를 호출한다.
         * this()가 해당 클래스 내의 다른 생성자를 호출하는 구문이라면,
         * super()는 부모클래스가 가지는 private 생성자르르 제외한 나머지 생성자를 호출함*/

        Product product1 = new Product();
            System.out.println(product1.getInfomation());

        Product product2 = new Product("S-01234", "삼성", "갤럭시Z폴드", 2398000, new java.util.Date());
            System.out.println(product2.getInfomation());

        Computer computer1 = new Computer();
            System.out.println(computer1.getInfomation());

        Computer computer2 = new Computer("퀄컴 스냅드래곤", 512,  12, "안드로이드");
            System.out.println(computer2.getInfomation());

            Computer computer3 = new Computer("S-01234", "삼성", "갤럭시Z폴드", 2398000, new java.util.Date(),
                    "퀄컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println(computer3.getInfomation());

    }
}
