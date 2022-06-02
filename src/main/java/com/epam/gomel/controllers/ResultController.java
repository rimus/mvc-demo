package com.epam.gomel.controllers;

import com.epam.gomel.beans.Operation;
import com.epam.gomel.beans.ResultExecutor;
import com.epam.gomel.utils.NumberUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResultController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String control = (String) getServletConfig().getServletContext().getAttribute(Constants.PARAM_CONTROL);
        String[] numbers = req.getParameterValues(Constants.PARAM_FLAG);
        numbers = NumberUtils.getCheckedNumbers(numbers, control);
        Operation operation = Operation.valueOf(req.getParameter(Constants.PARAM_OPERATION));
        if (NumberUtils.isNumbersAreOk(numbers) && numbers.length > 1) {
            double result = ResultExecutor.getResult(numbers, operation);
            req.setAttribute(Constants.PARAM_OPERATION, operation);
            req.setAttribute(Constants.PARAM_NUMBERS, numbers);
            req.setAttribute(Constants.PARAM_RESULT, result);
            getServletContext().getRequestDispatcher(Constants.JSP_RESULT).forward(req, resp);
        } else {
            resp.sendRedirect(Constants.START);
        }
    }
}
