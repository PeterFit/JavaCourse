package com.epam.main.java.se01.task1;

public class Sum {
    public static void main(String[] args) {
        try {
            double result = Double.parseDouble(args[0]) + Double.parseDouble(args[1]);
            System.out.println(args[0] + " + " + args[1] + " = " + result);
        } catch (NumberFormatException exc) {
            System.out.println("Error: Only numbers are allowed.");
        }
    }
}
