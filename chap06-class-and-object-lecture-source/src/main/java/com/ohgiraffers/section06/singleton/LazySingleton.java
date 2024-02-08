package com.ohgiraffers.section06.singleton;

public class LazySingleton {

    /*클래스가 초기화되는 시점에 필드를 선언해두고 null로 초기화된다.*/

    private static LazySingleton lazy;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if(lazy ==null) {
            lazy = new LazySingleton();
        }
        return  lazy;
    }
}
