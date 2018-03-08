package com.swk.validateajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Description:用来验证用户信息
 * @author Vico
 *
 */
public class ValidateAjax extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
	response.setContentType("text/html;charset=utf-8");
	PrintWriter out=response.getWriter();
	String username=request.getParameter("username");
	if (username.equalsIgnoreCase("admin")) {
	    out.print("1");
	    System.out.print("结果为1");
	}else {
	    out.print("0");
	    System.out.print("结果为0");
	}
    }
    

}
