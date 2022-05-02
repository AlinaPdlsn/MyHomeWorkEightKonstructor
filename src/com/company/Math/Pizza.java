package com.company.Math;

import com.company.Circle;

public class Pizza extends CircleTwo {
    double cost;
    String name;
    String composition;

    public Pizza(String name, String composition, double cost, double radius) {
        super(radius);
        this.name = name;
        this.composition = composition;
        this.cost = cost;

        System.out.println(radius);
    }

}
