package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass{

    /* 메소드 이름 변경 에러*/
//    @Override
//    public void method2(int num) {}

    /* 메소드 리턴타입 변경 에러*/
//    @Override
//    public int method(int num) { return 0;}

    /*매개변수 갯수, 타입변경 에러*/
//    @Override
//    public void method(int num, String num) {}

    @Override
    public void method(int num) {}

    /*private 메소드는 오버라이딩 불가*/
//    @Override
//    private void privateMethod() {}

    /*final 메소드 오버라이딩 불가*/
//    @Override
//    public final void finalMethod() {}

    /*부모 메소드의 접근제한자와 같거나 더 넓은 범위로 오버라이딩 가능*/
//    @Override
//    void protectedMethod() {}                   //더 좁은 범위로 불가능

//    @Override
//    protected void protectedMethod() {}          //같은 범위 가능

    @Override
    public void protectedMethod() {}         //더 넓은 범위 가능
}
