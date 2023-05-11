 package com.harsh;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletDemo extends HttpServlet {
	/*
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int a = Integer.parseInt(req.getParameter("n1"));
		int b = Integer.parseInt(req.getParameter("n2"));
		
		int sum = a+b;
		
		PrintWriter p = res.getWriter();
		p.println("result is "+sum);
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int a = Integer.parseInt(req.getParameter("n1"));
		int b = Integer.parseInt(req.getParameter("n2"));
		
		int sum = a+b;
		
		PrintWriter p = res.getWriter();
		p.println("result is "+sum);
	}
	*/
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String a = (req.getParameter("fname"));
		String b = (req.getParameter("lname"));	
		String c = (req.getParameter("email"));
		String d = (req.getParameter("phonenumber"));
		
		req.setAttribute("fname", a);
		req.setAttribute("lname", b);
		req.setAttribute("email", c);
		req.setAttribute("phonenumber", d);
		
		
		RequestDispatcher rd = req.getRequestDispatcher("nc");
		rd.forward(req, res);
		
		RequestDispatcher rdi = req.getRequestDispatcher("lc");
		rdi.forward(req, res);
		
//		PrintWriter p = res.getWriter();
//		p.println("result is "+sum);
	}
	
	
}
