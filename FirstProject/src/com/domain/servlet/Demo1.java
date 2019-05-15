package com.domain.servlet;
    
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet(description = "Demo servlet" , urlPatterns = {"/Demo1path"},
		//initParams= {@WebInitParam(name="defaultUser", value="jspservlet")}
//)
public class Demo1 extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String firstName = request.getParameter("fname");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(firstName!= " " && firstName != null) {
			session.setAttribute("saveUserName", firstName);
			context.setAttribute("saveUserName", firstName);
		}
		out.println("Hello "+firstName);
		out.println("Request parameter has : "+firstName);
		out.println("Session parameter has :  "+(String)session.getAttribute("saveUserName"));
		out.println("Context parameter has :  "+(String)context.getAttribute("saveUserName"));
		out.println("Init parameter has default username as "+getServletConfig().getInitParameter("defaultUser"));
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String profession = request.getParameter("prof");
		//String location = request.getParameter("location");
		String[] location = request.getParameterValues("location");
		out.println("Welcome "+firstName+" "+lastName);
		out.println("Your Profession is : "+profession);
		out.println("Your Location is : "+location.length+" places");
		for (int i = 0; i < location.length; i++) {
			out.println(location[i]);
		}

		
	}

}
