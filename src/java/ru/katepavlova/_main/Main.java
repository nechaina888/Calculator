package ru.katepavlova._main;

import ru.katepavlova.service.ResultWriter;
import ru.katepavlova.util.Calculator;
import ru.katepavlova.util.InputReader;

public class Main {
    public static void main(String[] args) {
        int num1 = InputReader.getNum1();
        int num2 = InputReader.getNum2();
        int result;
        char operation = InputReader.getOperation();
        if (operation == '+'){
            result = Calculator.summ(num1, num2);
        } else if (operation == '-') {
            result = Calculator.substract(num1, num2);
        } else {result = Calculator.multiply(num1, num2);}
        ResultWriter.writeResult(num1, num2, result, operation);
    }
}
