package com.ohgiraffers.section08.initblock;

public class Product {

    /*필드를 초기화 하지 않으면 JVM이 정한 기본값으로 객체 생성*/
//    private String name;
//    private int price;
//    private static String brand;

    /*명시적 초기화*/
    private String name = "라떼";
    private int price = 5000;
    private static String brand = "스타복스";

    /*초기화블럭으로 필드 초기화*/
    {
        name = "아메리카노";
        price = 4000;
        brand = "할리스";
        System.out.println("인스턴스 초기화 블럭 동작함");
    }

    static  {
        /*static 초기화 블럭에서는 non-static 필드를 초기화하지 못한다.
        * 정적 초기화 블럭은 클래스 로드 시에 동작한다.
        * 따라서 정적 초기화 블럭의 동작 시점에는 인스턴스가 아무것도 존재할 수 없기 때문에,
        * 존재하지 않는 인스턴스변수에 초기화 하는 것은 시기상으로 불가능하다.
        * */
//        name = "미숫가루";
//        price = 4500;
        brand = "탐앤탐스";
        System.out.println("정적 초기화 블럭 동작함");
    }

    public Product() {
        System.out.println("기본 생성자 호출됨");
    }

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 있는 생성자 호출됨");
    }

    public String getInfomation() {
        return "Product [name = " + this.name + ", price + " + this.price + ", brand = " + Product.brand + "]";

    }


}
