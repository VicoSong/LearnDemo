package com.swk.helloajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Descript :测试ajax
 * @author Vico
 *
 */
public class HelloAjax extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("text/html");
	System.out.print("(get方式)Hello Ajax!!!");
	PrintWriter out = response.getWriter();
	out.println("(get方式)Hello Ajax!!!");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
	response.setContentType("text/html;charset=utf-8");
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	
	System.out.print("(post方式)Hello Ajax!!!"+"\t用户名是："+username+"   密码是："+password);
	PrintWriter out = response.getWriter();
	out.println("(post方式)Hello Ajax!!!"+"\t用户名是："+username+"   密码是："+password);
	
    }

}
