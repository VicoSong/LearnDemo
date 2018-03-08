package com.swk.autologin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��Servlert��Ҫ���ڴ����Զ���¼�߼�
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
		//�õ��û���������
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		//���õ����û�������������Ƿ�Ϊ���ж�
		if(username==null||"".equals(username)||password==null||"".equals(password))
		{
			//˵���û���������Ϊ��
			request.setAttribute("error_msg", "�û��������벻��Ϊ��");
			request.getRequestDispatcher("/autologin.jsp").forward(request, response);			
		}else if(username.equals("admin")&&password.equals("admin"))
		{
			//��ȡ�Զ���¼��ֵ�������ж�
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
