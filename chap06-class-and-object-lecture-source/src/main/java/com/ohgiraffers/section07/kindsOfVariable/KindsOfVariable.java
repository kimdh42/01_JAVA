package com.ohgiraffers.section07.kindsOfVariable;

public class KindsOfVariable {      //클래스영역의 시작

    /*
    * 클래스 영역에 작성하는 변수를 필드라고 한다.
    * 필드 == 전역변수(클래스 전역에서 사용할 수 있는 변수) == 멤버변수(클래스가 가지는 멤버라는 의미)
    * */

    /*non-static field를 인스턴스변수라고 한다.(인스턴스 생성 시점에 사용 가능한 변수라는 의미)*/
    private int globalNum;      //전역변수
    /*static field를 정적필드(클래스변수)라고 한다. 클래스 영역에 생성되는 변수라는 의미이다.)*/
    private static int staticNum;       //전역변수

    public void testMethod(int num) {       //메소드영역의 시작
                          //매개변수
        /*
        * 메소드의 괄호 안에 선언하는 변수를 매개변수라고 한다.
        * 메소드 영역에서 작성되는 변수를 지역변수라고 한다.
        * 매개변수도 일종의 지역변수로 생각하면 된다.*/
        int localNum;       //지역변수(메소드 안에서 작성되는변수)

        System.out.println(num);        //매개변수는 호출 시 값이 넘어와서 반영되기 때문에 초기화가 필요없다.

//        System.out.println(localNum);   //지역변수는 선언 외에 다시 사용(호출)하기 위해서는 반드시 초기화가 필요하다.
        System.out.println(globalNum);  //전역변수는 클래스 전역에서 사용 가능하다.
        System.out.println(staticNum);  //전역변수는 클래스 전역에서 사용 가능하다.
    }       //메소드 영역의 끝

    public void testMethod2() {
//        System.out.println(localNum);       //지역변수는 해당 지역(블럭 내)에서만 사용 가능하다.
        System.out.println(globalNum);      //전역변수는 다른 메소드에서도 사용 가능하다.
        System.out.println(staticNum);      //전역변수는 다른 메소드에서도 사용 가능하다.
    }
}       //클래스 영역의 끝
