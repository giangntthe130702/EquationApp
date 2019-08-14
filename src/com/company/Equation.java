package com.company;

import java.util.ArrayList;

public class Equation {
    Validation v = new Validation();
    public void calculateEquation(double a, double b, ArrayList<Double> list) {
        double result = 0;
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            result = (result - b) / a;
            System.out.print("X: ");
            System.out.println(result);
            list.add(result);
            v.checkNumber(list);
        }
    }
}
