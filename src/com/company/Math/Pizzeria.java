package com.company.Math;

public class Pizzeria {
    public static void main() {
        Pizza[] pizzeria = new Pizza[5];
        pizzeria[0] = new Pizza("Te la diamo calda", "", 0, 1);
        pizzeria[1] = new Pizza("Pazzi per la pizza", "", 0, 1);
        pizzeria[2] = new Pizza("Il pizzavendolo", "", 0, 1);
        pizzeria[3] = new Pizza("E che pizza!", "", 0, 1);
        pizzeria[4] = new Pizza("Antica Pizzeria", "", 0, 1);

        for (int i = 0; i < 5; i++) {
            System.out.println(pizzeria[i]);
        }
    }
}