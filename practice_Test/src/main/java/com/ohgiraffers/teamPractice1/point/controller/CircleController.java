package com.ohgiraffers.teamPractice1.point.controller;

import com.ohgiraffers.teamPractice1.point.model.vo.Circle;

public class CircleController {

    Circle c = new Circle();

    /* 원 넓이 */
    public String calcArea(int x, int y, int radius) {
        c.setX(x);
        c.setY(y);
        c.setRadius(radius);
        return "넓이 : " + (double)c.getRadius() * (double)c.getRadius() * 3.14;
    }

    /* 원 둘레 */
    public String calcCircum(int x, int y, int radius) {
        c.setX(x);
        c.setY(y);
        c.setRadius(radius);
        return "둘레 : " + ((double)c.getRadius() * 2 * 3.14);
    }
}
