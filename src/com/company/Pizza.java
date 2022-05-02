package com.company;

import com.company.Circle;

public class Pizza extends Circle{
    double cost;
    String name;
    String composition;

    public Pizza(String name, String composition, double cost, int radius) {
        super("green", radius);
        this.name = name;
        this.composition = composition;
        this.cost = cost;

        System.out.println(radius);
    }

}
