package com.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


import com.google.gson.Gson;

public class CommissionEmployeeController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        CommissionEmployee employee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);
        PrintWriter out = resp.getWriter();
        String a = req.getParameter("a");
        String message = "salam be " +a ;
        out.println("<h1>" + message + "</h1>");
//        PrintWriter out = resp.getWriter();
//        out.print(employee);
//        String message = "salam be ";
//        out.println("<h1>" + message + "</h1>");
    }

}
