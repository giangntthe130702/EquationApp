package com.company;

import java.util.ArrayList;

import static java.lang.StrictMath.sqrt;

public class QuadraticEquation {
    Validation v = new Validation();
    Equation e = new Equation();

    public void quadraticEquation(double a, double b, double c, ArrayList<Double> list) {
        double x1, x2;
        if (a == 0) {
            e.calculateEquation(b, c, list);
            return;
        }

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("The equation has no solution");
        } else if (delta == 0) {
            x1 = x2 = (double) -b / 2 * a;
            System.out.println("X1: " + x1 + " X2: " + x2);
            list.add(x1);
            list.add(x2);
            v.checkNumber(list);
        } else {
            x1 = (double) ((-b) - sqrt(delta)) / (2 * a);
            x2 = (double) ((-b) + sqrt(delta)) / (2 * a);
            System.out.println("X1: " + x1 + " X2: " + x2);
            list.add(x1);
            list.add(x2);
            v.checkNumber(list);
        }
    }
}
