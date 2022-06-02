package com.epam.gomel.controllers;

import com.epam.gomel.interfaces.Loadable;
import com.epam.gomel.interfaces.impl.PropertiesReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StartController extends HttpServlet {

    @Override
    public void init() throws ServletException {
        String fileName = getServletConfig().getInitParameter(Constants.FILENAME);
        Loadable dataSource = new PropertiesReader(fileName);
        String[] numbers = dataSource.getNumbers();
        String control = dataSource.getControl();
        getServletContext().setAttribute(Constants.PARAM_NUMBERS, numbers);
        getServletContext().setAttribute(Constants.PARAM_CONTROL, control);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher(Constants.JSP_START).forward(req, resp);
    }
}
