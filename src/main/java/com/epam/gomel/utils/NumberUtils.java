package com.epam.gomel.utils;

import com.epam.gomel.controllers.Constants;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    public static boolean isNumbersAreOk(String[] numbers) {
        try {
            for (String number : numbers) {
                Double.parseDouble(number);
            }
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }

    public static String[] getCheckedNumbers(String[] values, String control) {
        String[] checkedNumbers = values;
        if (control.equals(Constants.PARAM_TEXT)) {
            List<String> checkedValues = new ArrayList<>();
            for (int i = 1; i < values.length; i++) {
                if (!values[i].equals(Constants.PARAM_ON) && values[i -1].equals(Constants.PARAM_ON)) {
                    checkedValues.add(values[i]);
                }
            }
            checkedNumbers = checkedValues.toArray(new String[0]);
        }
        return checkedNumbers;
    }
}
