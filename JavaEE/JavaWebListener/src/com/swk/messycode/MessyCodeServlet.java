package com.swk.messycode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MessyCodeServlet extends HttpServlet{

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("user");
		String password=request.getParameter("password");
		System.out.println(user+":"+password);
		response.getWriter().println("Get方式的中文乱码问题被解决了");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("user");
		String password=request.getParameter("password");
		System.out.println(user+":"+password);
		response.getWriter().println("post方式的中文乱码问题被解决了");
	}
	
}
