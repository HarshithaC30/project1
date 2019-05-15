package com.domain.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstDemo
 */
@WebServlet(description = "My First Project", urlPatterns = { "/FirstDemoPath" })
public class FirstDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello World");
//		PrintWriter writer = response.getWriter();
//		writer.println("<h1>Welcome</h1>");
		response.getWriter().print("Hello!!!!!");
	}

}
