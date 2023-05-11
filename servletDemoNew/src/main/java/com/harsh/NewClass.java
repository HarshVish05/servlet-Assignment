package com.harsh;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NewClass extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		String fname = (String) req.getAttribute("fname");
		String lname = (String) req.getAttribute("lname");
		String email = (String) req.getAttribute("email");
		String phone = (String) req.getAttribute("phonenumber");
		
		PrintWriter p = res.getWriter();
		
		p.println(fname+"\n"+lname+"\n"+email+"\n"+phone);
	}
}
