package com.company;

import com.company.Math.CircleTwo;
import com.company.Math.Pizza;
import com.company.Math.Pizzeria;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("green", 2);
        CircleTwo circleTwo = new CircleTwo( 3);
        Pizzeria pizzeria = new Pizzeria();
        pizzeria.makePizza();
    }
}
