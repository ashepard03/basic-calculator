package org.example.calc;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Tell user to input two numbers
        System.out.println("Please input two numbers to complete a math operation");

        //need two input floats from comsole
        Scanner consoleInput = new Scanner(System.in);
        System.out.print("Input the first number: ");
        float num1 = consoleInput.nextFloat();
        System.out.println("Number 1: " + num1);

        System.out.print("Input the second number: ");
        float num2 = consoleInput.nextFloat();
        System.out.println("Number 2: " + num2);

        boolean badInput = false;

        do {
            // ask user what math operation they would like complete with numbers
            System.out.print("Would you like to add, subtract, multiply or divide? ");
            String input = consoleInput.next();

            // take the users choice of add, subtract, multiply or divide and print the solution
            if (input.equalsIgnoreCase("add")) {
                System.out.println("The solution is: " + (num1 + num2));
                badInput = false;
            } else if (input.equalsIgnoreCase("subtract")) {
                System.out.println("The solution is: " + (num1 - num2));
                badInput = false;
            } else if (input.equalsIgnoreCase("multiply")) {
                System.out.println("The solution is: " + (num1 * num2));
                badInput = false;
            } else if (input.equalsIgnoreCase("divide")) {
                System.out.println("The solution is: " + (num1 / num2));
                badInput = false;
            } else {
                System.out.println("I didn't understand that....");
                badInput = true;
            }
        } while (badInput);
    }
}
