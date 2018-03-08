package com.swk.listenerthree;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BeanServlet
 */
@WebServlet("/BeanServlet")
public class BeanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public BeanServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.实例化JavaBean
		UserBean user=new UserBean();
		user.setId(1);
		user.setName("张三");
		user.setPassword("101000");
		
		//2.将JavaBean绑定到Session
		HttpSession session=request.getSession();
		session.setAttribute("user", user);
		//3.将JavaBean从Session中解绑
		session.removeAttribute("user");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
