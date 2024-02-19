package com.ohgiraffers.objectTest;

import java.util.Random;

public class Dog {

    /* 강아지 속성 : 이름(String), 재주(String)[]*/

    public String dogName;

    public String[] ability;

    /* 강아지의 정보가 출력되는 조회 메소드 이름과 재주가 출력되도록 하기!!
    * (재주는 배열이기 때문에 for문 사용)
    * Array.toString() */
    public void learnAbility(String[] ability) {}            // setAbility 랑 같음.

    public void print() {
        System.out.println(this.dogName);
        for(String s : ability) {               //{앉아, 빵! 기다려}
            System.out.println(s);
        }
    }

    /* Dog의 반환타입인 void인 메소드 호출*/
    public void doSomeThingVoid() {
        /* swich문 사용 작성 */

        for(String gaeingi : ability) {
            switch(gaeingi) {
                case "앉아" :
                    System.out.println(dogName + "가 앉습니다.");
                    break;
                case "빵!" :
                    System.out.println(dogName + "가 쓰러집니다.");
                    break;
                case "기다려!" :
                    System.out.println(dogName + "이 기다립니다.");
                    break;
                default :
                    System.out.println("아직 못배운 재주에요");
            }
            break;
        }
    }

    public String doSomeThingString() {
        Random random = new Random();
        int gaeingi = random.nextInt(ability.length);
        return ability[gaeingi];
    }

    public boolean doSomeThingBoolean() {
        Random random = new Random();
        int skill = random.nextInt(ability.length);
        return true;
    }




    public Dog(String dogName) {
        this.dogName = dogName;
    }

    public String getDogName() {
        return dogName;
    }

    public String[] getAbility() {
        return ability;
    }

    public void setAbility(String[] ability) {
        this.ability = ability;
    }
}
