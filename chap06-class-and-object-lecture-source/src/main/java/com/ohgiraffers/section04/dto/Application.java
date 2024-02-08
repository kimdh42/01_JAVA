package com.ohgiraffers.section04.dto;

public class Application {
    public static void main(String[] args) {

        /* [생성자를 이용한 초기화]
        *  장점 : setter 메소드를 여러번 호출해서 사용하지 않고 단 한번의 호출로 인스턴스를 생성 및 초기화 할 수 있다.
        *  단점 : 필드를 초기화할 매개변수의 갯수를 경우의 수 별로 모두 만들어둬야 한다.
        *        호출 시 인자가 많이지는 경우 어떠한 값이 어떤 필드를 의미하는지 한눈으로 보기 힘들다.
        *
        * [설정자를 이용한 초기화]
        * 장점 : 필드를 초기화하는 각각의 값들이 어떤 필드를 초기화하는지 명확하게 볼 수 있다.
        * 단점 : 하나의 인스턴스를 생성할 때 한번의 호출로 끝나지 않는다.
        * */

        /*생성자를 이용한 초기화*/
        UserDTO user1 = new UserDTO("ohfiraffers", "ohgiraffers", "ohgiraffers", new java.util.Date());

        System.out.println(user1.getInfomation());

        /* 기본 생성자와 설정자를 이용한 초기화*/
        UserDTO user2 = new UserDTO();
        user2.setId("ohgiraffers");
        user2.setPwd("ohgiraffers");
        user2.setName("ohgiraffers");
        user2.setEnrollDate(new java.util.Date());

        System.out.println(user2.getInfomation());

    }
}
