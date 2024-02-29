package com.ohgiraffers.teamPractice1.point.controller;

import com.ohgiraffers.teamPractice1.point.model.vo.Rectangle;

public class RectangleController {

    Rectangle r = new Rectangle();

    /* 사각형 넓이 */
    public String calcArea(int x, int y, int height, int width) {
        r.setX(x);
        r.setY(y);
        r.setHeight(height);
        r.setWidth(width);

        return "둘레 : " + r.getHeight() * r.getWidth();
    }

    /* 사각형 둘레 */
    public String calcPerimeter(int x, int y, int height, int width) {
        r.setX(x);
        r.setY(y);
        r.setHeight(height);
        r.setWidth(width);

        return "넓이 : " + (r.getHeight() + r.getWidth()) * 2;
    }
}
