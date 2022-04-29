package com.company.Math;

import com.company.Circle;

public class Pizza {
    double cost;
    String name;
    String composition;
    CircleTwo basis;

    /**
     *
     * @param name
     * @param composition
     * @param cost
     * @param diameter
     */
    public Pizza(String name, String composition, double cost, double diameter){
        this.name = name;
        this.composition = composition;
        this.cost = cost;
        double radius = diameter / 2;
        this.basis = new CircleTwo(radius);
    }

}
