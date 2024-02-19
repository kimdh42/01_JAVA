package com.ohgiraffers.objectTest;

import java.util.Arrays;
import java.util.Scanner;

public class Person {
    Scanner sc = new Scanner(System.in);
    /*
    * 사람의 속성 : 이름(String), 나이(int), 국적(String), 강아지(클래스) --- 캡슐화 */

    private String name;
    private int age;
    private String nationality;
    private Dog myDog;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Dog myDog) {
        this.myDog = myDog;
    }

    /* String[] 로 국적배열 만든 후 조건문 작성*/
    public void setNationality(String nationality) {
        String[] confirmNationality = new String[] {"한국", "일본", "중국", "홍콩", "터키"};
        for(String input : confirmNationality ) {
            if(nationality.equals(input)) {
                this.nationality = input;
            }
        }
        if(this.nationality == null) {
            this.nationality = "한국";
        }
    }

    /* 강아지 이름을 입력받고, 입력받은 이름을 속성으로 강아지 객체 생성하여
    * 이 사람의 강아지로 설정*/
    public void adoptDog() {
        System.out.print("강아지 이름 : ");
        String gaeName = sc.nextLine();
        Dog dog = new Dog(gaeName);
        myDog = dog;
        System.out.println(gaeName);
    }

    /*내 강아지의 재주를 설정 */
    public void teachDog(String[] teachGae) {
        System.out.println("재주를 입력하세요 : ");
        sc.nextLine();
        myDog.setAbility(teachGae);
    }

    public void orderToDog() {
    /*void 메소드 출력
    * String으로 변경하여 출력
    * 출력예시 ) 뽀삐는 앉아!를 할 수 있어요 :) or 뽀삐는 안자!를 배우지 않았어요.
    * boolean으로 변경하여 출력
    * 출력예시 ) 뽀삐는 앉아!를 배웠어요!! or 뽀삐는 안자!를 할 수 없어요. */

        /* void 메소드 출력*/
        myDog.doSomeThingVoid();

        System.out.println();

        /*Dog 메소드를 String으로 변경하여 출력 */
        String gaeingi = myDog.doSomeThingString();
        System.out.println(gaeingi);

        System.out.println();

        /*Dog 메소드를 boolean으로 변경하여 출력 */
        boolean skill = myDog.doSomeThingBoolean();
        if(getMyDog().doSomeThingBoolean()) {
            System.out.println(myDog.getDogName() + " 는 할 수 없어요.");
        }
    }



    public String getNationality() {
        return nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog getMyDog() {
        return myDog;
    }

    public void setMyDog(Dog myDog) {
        this.myDog = myDog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "sc=" + sc +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", myDog=" + myDog +
                '}';
    }
}
