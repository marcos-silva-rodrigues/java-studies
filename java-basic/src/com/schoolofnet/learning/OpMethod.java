package com.schoolofnet.learning;

import java.util.Scanner;

public class OpMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number 1: ");
        Double numberOne = scanner.nextDouble();

        System.out.println("Number 2: ");
        Double numberTwo = scanner.nextDouble();

        System.out.println("Operation: ");
        scanner.nextLine();
        String op = scanner.nextLine();
        Double result = null;

        if (op.equals("+")) {
            result = sum(numberOne, numberTwo);
        } else if (op.equals("-")) {
            result = sub(numberOne, numberTwo);
        } else if (op.equals("*")) {
            result = mul(numberOne, numberTwo);
        } else if (op.equals("/")) {
            result = div(numberOne, numberTwo);
        } else {
            System.out.println("Could not find operations");
        }
        System.out.println(result);
    }

    public static Double sum(Double num1, Double num2) {
        return num1 + num2;
    }

    public static Double sub(Double num1, Double num2) {
        return num1 - num2;
    }

    public static Double mul(Double num1, Double num2) {
        return num1 * num2;
    }

    public static Double div(Double num1, Double num2) {
        return num1 / num2;
    }
}
