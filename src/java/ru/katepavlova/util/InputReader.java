package ru.katepavlova.util;

import java.util.Scanner;

public class InputReader {
    public static int num1;
    public static int num2;
    public static char operation;
    public static Scanner scanner = new Scanner(System.in);

    public static int getNum1() {
        System.out.println("Enter number 1");
        return num1 = scanner.nextInt();
    }

    public static int getNum2() {
        System.out.println("Enter number 2");
        return num2 = scanner.nextInt();
    }

    public static char getOperation() {
        System.out.println("Enter an operation");
        return operation = scanner.next().charAt(0);
    }

}
