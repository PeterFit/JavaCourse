package com.epam.main.java.task01;

public class Sum {
    public static void main(String[] args) {
        try {
            // Number of parameters checkout
            if (args.length != 2) {
                throw new IllegalArgumentException("Error: Only 2 parameters are allowed.");
            }

            // Parsing parameters into double
            double first = Double.parseDouble(args[0]);
            double second = Double.parseDouble(args[1]);

            // Print result
            System.out.print(args[0] + " + " + args[1] + " = ");
            System.out.println(first + second);
        } catch (NumberFormatException exc) {
            System.out.println("Error: Only numbers are allowed.");
        } catch (IllegalArgumentException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
