package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Validation {

    public double inputNumber() {
        Scanner sc = new Scanner(System.in);
        double a;
        while (true) {
            System.out.println("Enter number: ");
            try {
                a = Double.parseDouble(sc.next());
                break;
            } catch (NumberFormatException ex) {
                sc.nextLine();
                System.out.println("Invalid Input !!!");
            }
        }
        return a;
    }

    public void checkNumber(ArrayList<Double> list) {
        System.out.println("Number is odd: ");
        for (double a1 : list) {
            if (a1 % 2 != 0) {
                System.out.println(a1 + " ");
            }
        }

        System.out.println("Number is even: ");
        for (double a2 : list) {
            if (a2 % 2 == 0) {
                System.out.println(a2 + " ");
            }
        }

        System.out.println("Number is square: ");
        for (double a3 : list) {
            double number = Math.sqrt(a3);
            if (number == (int) number) {
                System.out.println(a3 + " ");
            }
        }
    }

}
