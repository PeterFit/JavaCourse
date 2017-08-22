package com.epam.main.java.se01.task1;

public class Division {
    public static void main(String[] args) {
        try {
            // Necessary to use IF to check "Division by 0"
            if (Double.parseDouble(args[1]) == 0) {
                throw new IllegalArgumentException();
            }
            
            double result = Double.parseDouble(args[0]) / Double.parseDouble(args[1]);
            System.out.println(args[0] + " / " + args[1] + " = " + result);
        } catch (NumberFormatException exc) {
            System.out.println("Error: Only numbers are allowed.");
        } catch (IllegalArgumentException exc) {
            System.out.println("Error: Division by 0");
        }
    }
}