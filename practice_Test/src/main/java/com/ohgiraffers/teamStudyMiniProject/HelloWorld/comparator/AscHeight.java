package com.ohgiraffers.teamStudyMiniProject.HelloWorld.comparator;

import com.ohgiraffers.teamStudyMiniProject.HelloWorld.model.dto.PersonDTO;

import java.util.Comparator;

public class AscHeight implements Comparator<PersonDTO> {

    @Override
    public int compare(PersonDTO o1, PersonDTO o2) {
        int result = 0;

        if(o1.getHeight() > o2.getHeight()) {
            result = 1;
        } else if(o1.getHeight() < o2.getHeight()) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }
}
