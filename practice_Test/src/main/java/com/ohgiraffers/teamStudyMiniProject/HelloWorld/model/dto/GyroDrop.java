package com.ohgiraffers.teamStudyMiniProject.HelloWorld.model.dto;

import com.ohgiraffers.teamStudyMiniProject.HelloWorld.controller.HelloWorldManager;
import com.ohgiraffers.teamStudyMiniProject.HelloWorld.veiw.HelloWorldMenu;

public class GyroDrop extends PersonDTO{


    public void gyroDropLimit(PersonDTO person) {
        double heightLimit = 170.0;

        if(heightLimit <= person.getHeight()) {
            System.out.println("탑승 할 수 있습니다.");
        } else {
            System.out.println("회전목마나 타세요");
        }
    }
}
