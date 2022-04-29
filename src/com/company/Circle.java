package com.company;

public class Circle {

    String color;

    int radius;
    double lenght;
    double square;

    /**
     *
     * @param color
     * @param radius
     */

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
        this.lenght = 2 * Math.PI * radius;
        this.square = Math.PI * radius * radius;

        System.out.println(color);
        System.out.println(radius);

    }
}
