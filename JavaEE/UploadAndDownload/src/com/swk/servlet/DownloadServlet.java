package com.swk.servlet;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.misc.BASE64Encoder;

/**
 * Servlet implementation class DownloadServlet
 */
@WebServlet("/DownloadServlet")
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String filename="";
		//获取客户端请求头中的User-Agent
		String userAgent=request.getHeader("User-Agent");
		if(userAgent.contains("MSIE"))
		{
			//IE浏览器
			filename=URLEncoder.encode(filename,"utf-8");
			filename=filename.replace("+", "");			
		}else
		{
			//说明是其他浏览器
			BASE64Encoder base64Encoder=new BASE64Encoder();
			filename="?utf-8?b?"+base64Encoder.encode(filename.getBytes("utf-8"))+"?=";
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
