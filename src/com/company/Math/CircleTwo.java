package com.company.Math;

public class CircleTwo {

    double radius;
    double lenght;
    double square;

    /**
     *
     * @param radius
     */
    public CircleTwo(double radius) {
        this.radius = radius;
        this.lenght = 2 * Math.PI * radius;
        this.square = Math.PI * radius * radius;

        System.out.println(radius);
        System.out.println(lenght);
        System.out.println(square);
    }
}
