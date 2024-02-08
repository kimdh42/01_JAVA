package com.ohgiraffers.class_object_test02;

public class StudentVO {

    public int grade;
    public  int classroom;
    public String name;
    public double height;
    public char gender;


    public StudentVO() {}

    public StudentVO(int grade, int classroom, String name, double height, char gender) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.height = height;
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom =classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void printinformation() {
        System.out.println("학년 : " + grade);
        System.out.println("반 : " + classroom);
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height);
        System.out.println("성별 : " + gender);
    }
}
