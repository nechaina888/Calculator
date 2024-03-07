package ru.katepavlova.service;

public class ResultWriter {
    public static void writeResult(int num1, int num2, int result, char operation){
        System.out.println("результ: " + num1 + " " + operation + " " + num2 + " = " + result);
    }
}
