package com.epam.main.java.task02;

import java.util.Scanner;

public class Calculator {
    //Show menu method
    void showMenu() {
        System.out.println("Select an action:");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        System.out.println("q - quit");
    }

    //Do the selected action
    Result doAction(String action) {

        //End the program if selected 'q'
        if (action.equals("q")) {
            System.out.println("Exit.");
            System.exit(0);
        }

        String stringValue;
        double arg1, arg2;
        Scanner sc = new Scanner(System.in);

        //Initialization of the first argument
        do {
            System.out.println("Enter first number:");
            stringValue = sc.nextLine().trim();
        } while (!isValidInput(stringValue));
        arg1 = Double.parseDouble(stringValue);

        //Initialization of the second argument
        do {
            System.out.println("Enter second number:");
            stringValue = sc.nextLine().trim();
        } while (!isValidInput(stringValue) || !isValidDivision(action, stringValue));
        arg2 = Double.parseDouble(stringValue);

        //Choosing the selected action 
        switch (action) {
            case "+":
                return new Result(arg1 + arg2);
            case "-":
                return new Result(arg1 - arg2);
            case "*":
                return new Result(arg1 * arg2);
            case "/":
                return new Result(arg1 / arg2);
            default:
                throw new ArithmeticException();
        }
    }

    //Check for valid action chosen
    public boolean isValidAction(String ch) {
        return ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/") || ch.equals("q");
    }

    //Check for valid input arguments
    private boolean isValidInput(String str) {
        if (!str.matches("((-|\\+)?[0-9]+(\\.[0-9]+)?)+")) {
            System.out.println("Wrong input!");
            return false;
        }
        return true;
    }

    //"Division by 0" checkout
    private boolean isValidDivision(String action, String arg) {
        if (action.equals("/") && Double.parseDouble(arg) == 0) {
            System.out.println("Can not divide by zero!");
            return false;
        }
        return true;
    }
}
