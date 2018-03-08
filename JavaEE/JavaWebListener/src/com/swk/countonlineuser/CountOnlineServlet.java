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
 * ��Servlet�����ڿͻ�����ʾ��������
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
		session.setAttribute("���޼�", "����");
		//�ڿͻ�����ʾ��������
		//1.�õ�ServletContext����
		ServletContext context=getServletContext();
				
		//2.��ServletContext�л�ȡͳ�Ƶ���������
		int sum=(Integer)context.getAttribute("sum");
		//3.���û�������Ӧ���ͻ���ҳ����
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("��ǰ����������"+sum);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
