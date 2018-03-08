package com.swk.autologin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 该Servlert主要用于处理自动登录逻辑
 * Servlet implementation class AutoLoginServlet
 */

public class AutoLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutoLoginServlet() {
        super();
        
    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//拿到用户名和密码
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		//对拿到的用户名和密码进行是否为空判断
		if(username==null||"".equals(username)||password==null||"".equals(password))
		{
			//说明用户名或密码为空
			request.setAttribute("error_msg", "用户名或密码不能为空");
			request.getRequestDispatcher("/autologin.jsp").forward(request, response);			
		}else if(username.equals("admin")&&password.equals("admin"))
		{
			//获取自动登录的值并进行判断
			String autologin=request.getParameter("autologin");
			if("on".equals(autologin))
			{
				Cookie cookie=new Cookie("user",username+"#"+password);
				cookie.setMaxAge(60*60*24*7);
				cookie.setPath("/");
				response.addCookie(cookie);
			}
					
			request.getSession().setAttribute("username", username);
			/*request.getRequestDispatcher("/autologinindex.jsp").forward(request, response);*/
			response.sendRedirect("/JavaWebListener/autologinindex.jsp");
		}else {
			{
				response.sendRedirect("/JavaWebListener/autologin.jsp");
			}
		}
	}

}
