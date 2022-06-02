package com.epam.gomel.beans;

public class ResultExecutor {

    public static double getResult(String[] numbers, Operation operation) {
        operation.setInit();
        for (String number : numbers) {
            double value = Double.parseDouble(number);
            operation.setNext(value);
        }
        return operation.getResult();
    }
}
