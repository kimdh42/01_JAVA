package com.ohgiraffers.section03.dto;

public class Application {
    public static void main(String[] args) {

        /*
        * [ DTO ]
        * 캡슐화 원칙에는 일부 어긋나긴 하지만, 다른 목적을 가진 클래스와 객체를 추상화하는 기법
        * 행위 위주가 아닌 데이터를 하나로 뭉치기 위한 객체(Data Transfer Object)의 경우이다.
        * 캡슐화의 원칙을 준수하여 모든 필드를 privata로 설정해 직접 접근을 막고,
        * 각 필드값을 변경하거나 반환하는 메소드를 세트로 미리 작성한다.
        * private 필드와 필드값을 수정하는 설정자(setter), 필드에 접근하는 접근자(getter)들로 구성된다.
        * 주로 계층간 데이터를 주고 받을 목적으로 사용한다.
        * */

        MemberDTO member = new MemberDTO();

        member.setNumber(1);
        member.setName("홍길동");
        member.setAge(20);
        member.setGender('남');
        member.setHeight(180.5);
        member.setWeight(80.6);
        member.setActivated(true);

        System.out.println("회원 번호 : " + member.getNumber());
        System.out.println("회원 명 : " + member.getName());
        System.out.println("회원 나이 : " + member.getAge());
        System.out.println("회원 성별 : " + member.getGender());
        System.out.println("회원 키 : " + member.getHeight());
        System.out.println("회원 몸무게 : " + member.getWeight());
        System.out.println("회원 활성화상태 : " + member.isActivated());

    }
}
