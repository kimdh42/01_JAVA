package com.ohgiraffers.teamStudyMiniProject.HelloWorld.controller;

import com.ohgiraffers.teamStudyMiniProject.HelloWorld.comparator.AscHeight;
import com.ohgiraffers.teamStudyMiniProject.HelloWorld.model.dto.PersonDTO;
import com.ohgiraffers.teamStudyMiniProject.HelloWorld.veiw.HelloWorldMenu;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;

public class HelloWorldManager {

    PersonDTO personDTO = new PersonDTO();


    private ArrayList<PersonDTO> personList = new ArrayList<>();
    private PersonDTO pDTO = null;

    public void insertPerson (PersonDTO pDTO) {
        personList.add(pDTO);
    }

    public PersonDTO personInfo() {
        return pDTO;
    }

    public void allPrint() {

        Collections.sort(personList, new AscHeight());

        for(PersonDTO person : personList) {
            System.out.println(person);
        }
    }

    public PersonDTO selectPerson(String name) {

        for (PersonDTO person : personList) {
                if (person.getName().equals(name)) {
                    System.out.println(person);
                    return person;
                }
        }
        return null;

    }


    public void goHomePerson(PersonDTO pson1){
        personList.remove(pson1);
    }
}
