package com.company.Math;

public class Pizzeria {
    public void makePizza() {
        Pizza[] pizzeria = new Pizza[5];
        pizzeria[0] = new Pizza("Te la diamo calda", "", 100, 1);
        pizzeria[1] = new Pizza("Pazzi per la pizza", "", 200, 1);
        pizzeria[2] = new Pizza("Il pizzavendolo", "", 150, 1);
        pizzeria[3] = new Pizza("E che pizza!", "", 140, 1);
        pizzeria[4] = new Pizza("Antica Pizzeria", "", 120, 1);

        for (int i = 0; i < 5; i++) {
            System.out.println(pizzeria[i].name + " " + pizzeria[i].cost);
        }
    }
}