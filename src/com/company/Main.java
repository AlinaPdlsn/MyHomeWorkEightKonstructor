package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle("green", 2);
        CircleTwo circleTwo = new CircleTwo( 3);
        Pizzeria pizzeria = new Pizzeria();
        pizzeria.makePizza();
    }
}