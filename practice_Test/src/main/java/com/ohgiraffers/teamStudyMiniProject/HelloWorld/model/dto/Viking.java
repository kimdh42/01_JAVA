package com.ohgiraffers.teamStudyMiniProject.HelloWorld.model.dto;

public class Viking extends PersonDTO{


    public void vikingLimit(PersonDTO person) {
        double heightLimit = 160.0;
        if(heightLimit <= person.getHeight()) {
            System.out.println("탑승 할 수 있습니다.");
        } else {
            System.out.println("회전목마나 타세요");
        }
    }
}
