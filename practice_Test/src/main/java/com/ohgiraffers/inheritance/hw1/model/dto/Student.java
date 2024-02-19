package com.ohgiraffers.inheritance.hw1.model.dto;

public class Student extends Person{

    private int grade;
    private  String major;

    public Student() {
        super();
    }

    public Student(String name, int age, double height, double weight, int grade, String major) {
        super(age, weight, height);
        this.name = name;
        this.grade = grade;
        this.major = major;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String stInformation() {
        return "이름: " + getName() + " 나이: " + getAge() + " 키: " + getHeight() + " 몸무게: "
                + getWeight() + " 학년: " + grade + " 전공: " + major;
    }
}
