package org.example.calc;
import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.System.*;
public class Calculator {
    public static void main(String[] args) {

        int jobSalary =  70000;
        int job2Salary = 90000;

        System.out.println("The higher paying salary is: $" + Math.max(jobSalary, job2Salary));

        int truckPrice = 85000;
        int carPrice  = 27500;

        System.out.println("The lower priced vehicle value is: $" + Math.min(truckPrice, carPrice));

        out.println("The area of the circle is: " + 3.141592653 * pow(7.25, 2));

        double num1 = 5.0;
        out.println("The square root of the number 5 is: " + sqrt(num1));

        // the distance formula  d = √ (x2 - x1)2 + (y2 - y1)2
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 85;
        out.println("The distance between points (5,10) and (85,50) is: " );

        out.println("What is your name? ");
        //first ask for the name to be polite
        Scanner consoleInput = new Scanner(System.in);
        String name = consoleInput.nextLine();

        out.println("Enter and integer: ");
        int number1 = consoleInput.nextInt();
        out.println("First: " + number1);

        out.println("Good to be working with you," + name);

    }
}
