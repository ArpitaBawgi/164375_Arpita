package com.arpita.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/login")
public class LoginForm extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String user=request.getParameter("name");
		String pass=request.getParameter("pass");
		if(user.equals("arp")&&pass.equals("a1234")){
			
		
			pw.print("valid");
			
			String gender=request.getParameter("gen");
			 pw.println(gender);
			 String hobbie1=request.getParameter("h1");
			 String hobbie2=request.getParameter("h2");
			 String hobbie3=request.getParameter("h3");

			 pw.println(hobbie1);
			 pw.println(hobbie2);
			 pw.println(hobbie3);
			 String city=request.getParameter("city");
			pw.println(city);
			
		}
		else
			pw.print(" not valid");
		
	}
	}

	


