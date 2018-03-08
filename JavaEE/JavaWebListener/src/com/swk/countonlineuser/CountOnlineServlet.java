package com.swk.countonlineuser;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 该Servlet用于在客户端显示在线人数
 */
@WebServlet("/CountOnlineServlet")
public class CountOnlineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountOnlineServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		session.setAttribute("张无忌", "明教");
		//在客户端显示在线人数
		//1.拿到ServletContext对象
		ServletContext context=getServletContext();
				
		//2.从ServletContext中获取统计的在线人数
		int sum=(Integer)context.getAttribute("sum");
		//3.将用户人数响应到客户端页面中
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("当前在线人数："+sum);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
