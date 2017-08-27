package com.epam.main.java.se01.task2;

import java.io.IOException;
import java.util.Scanner;

/*Dialog calculator with output in pseudographics*/
public class CalculatorDemo {
    public static void main(String[] args) throws IOException {
        String action;

        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        //Show menu until action is selected
        do {
            calculator.showMenu();
            action = sc.nextLine();
        } while (!calculator.isValidAction(action));

        printResult(calculator.doAction(action));
    }

    //Print result in pseudographics
    private static void printResult(Result result) {
        System.out.println(result.getFirstStr());
        System.out.println(result.getSecondStr());
        System.out.println(result.getThirdStr());
        System.out.println(result.getFourthStr());
        System.out.println(result.getFifthStr());
    }
}