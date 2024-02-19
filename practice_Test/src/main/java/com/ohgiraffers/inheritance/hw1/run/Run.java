package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.Employee;
import com.ohgiraffers.hw1.model.dto.Person;
import com.ohgiraffers.hw1.model.dto.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Student[] st = new Student[3];

        st[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        st[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        st[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        for(Student student : st) {
            System.out.println(student.stInformation());
        }

        System.out.println();


        Employee[] employee = new Employee[10];

        Scanner sc = new Scanner(System.in);

        int count = 0;

        while(true) {
            System.out.print("이름을 입력하세요 : ");
            String name = sc.next();

            System.out.print("나이를 입력하세요 : ");
            int age = sc.nextInt();

            System.out.print("키를 입력하세요 : ");
            double height = sc.nextDouble();

            System.out.print("몸무게를 입력하세요 : ");
            double weight =sc.nextDouble();

            System.out.print("급여를 입력하세요 : ");
            int salay = sc.nextInt();

            System.out.print("부서를 입력하세요 : ");
            String dept = sc.next();

            employee[count] = new Employee(name, age, height, weight, salay, dept);
            count++;

            System.out.print("Y를 누르면 계속 추가됩니다 : ");
            char input = sc.next().toUpperCase().charAt(0);

            if( input == 'N'){
                break;
            }
        }
        for (int i = 0; i < count; i++){
            System.out.println(employee[i].emInformation());
        }
    }
}
