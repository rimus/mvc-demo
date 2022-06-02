package com.epam.gomel.interfaces.impl;

import com.epam.gomel.controllers.Constants;
import com.epam.gomel.interfaces.Loadable;

import java.util.ResourceBundle;

public class PropertiesReader implements Loadable {

    private ResourceBundle rb;

    public PropertiesReader(String fileName) {
        rb = ResourceBundle.getBundle(fileName.trim());
    }

    @Override
    public String[] getNumbers() {
        String[] numbers = rb.getString(Constants.PARAM_NUMBERS).split(Constants.COMMA);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i].trim();
        }
        return numbers;
    }

    @Override
    public String getControl() {
        return rb.getString(Constants.PARAM_CONTROL).trim();
    }
}
