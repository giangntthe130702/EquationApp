package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.StrictMath.nextAfter;
import static java.lang.StrictMath.sqrt;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Validation v = new Validation();
        Equation e = new Equation();
        QuadraticEquation q = new QuadraticEquation();

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        int choice = 0;
        while (true) {
            System.out.println("1. Calculate Superative Equation");
            System.out.println("2. Calculate Quadratic Equation");
            System.out.println("3. Exit");

            while (true) {
                try {
                    System.out.println("Choose one operator: ");
                    choice = Integer.parseInt(sc.next());
                } catch (NumberFormatException ex) {
                    System.out.println("Must be a number !!!");
                }


                if (choice == 1) {
                    System.out.println("====== Calculate Superative Equation ======");
                    list.clear();
                    double a, b;
                    a = v.inputNumber();
                    b = v.inputNumber();

                    list.add(a);
                    list.add(b);

                    e.calculateEquation(a, b, list);
                }

                if (choice == 2) {
                    System.out.println("====== Calculate Quadratic Equation ======");
                    list.clear();
                    double a, b, c;
                    a = v.inputNumber();
                    b = v.inputNumber();
                    c = v.inputNumber();

                    list.add(a);
                    list.add(b);
                    list.add(c);

                    q.quadraticEquation(a, b, c, list);
                }

                if (choice == 3) {
                    break;
                }
            }
        }
    }
}
