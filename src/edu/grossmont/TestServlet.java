package edu.grossmont; //all a package is is folders lol

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TestServlet extends HttpServlet {
    //this applies to project 2, not 11/1/22 lab

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        // Getting query string values from user's request
        String sUsername = request.getParameter("username");
        String sPassword = request.getParameter("password");


        PrintWriter out = response.getWriter();

        out.println("servlet working!");
        out.println("username: " + sUsername);
        out.println("password: " + sPassword);

    }


}
