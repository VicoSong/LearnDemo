package com.swk.servlet;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FunctionJump extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public FunctionJump() {
        super();
    }

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url=request.getParameter("url");
		//request.getRequestDispatcher(url).forward(request, response);
		request.getRequestDispatcher("/"+url).forward(request,response);
		/*response.sendRedirect(request.getContextPath()+"/"+url);*/
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	
}
