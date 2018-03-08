package com.swk.uploaddownload.servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
@WebServlet(urlPatterns={"/UploadServlet"})
    @MultipartConfig(
    	maxFileSize=1024*1024*3,     //设置上传文件的单个大小
    	maxRequestSize=1024*1024*10, //设置上传文件的
    	fileSizeThreshold=1024*1024*3,//设置缓存区的大小
    	location="/WEB-INF/temp"        //设置文件上传的临时目录
    	)
public class UploadServlet extends HttpServlet {

    public UploadServlet() {
	super();
    }

    public void init() throws ServletException {
 	
     }

  
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	doPost(request, response);
	
    }

    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	
	//解决中文乱码
	request.setCharacterEncoding("utf-8");
	
	/*
	 * 通过request对象的getParameter(String name)方法，可以获得上传文件的普通项
	 * 	*name参数指定客户单页面上传文件域的name属性值
	 * */
	String fileText=request.getParameter("filetext");
	/*
	 *获取Part接口的实例对象
	 *	*通过request对象的getPart(String name)方法，可以获取Part接口的实例对象
	 *	*name属性：指定客户端页面上传文件域的name属性值。
	 *通过Part接口的实例对象获取有关文件上传项的名称、文件输入流。
	 *	*Part接口提供的write(filename)方法：
	 *	*将接收到的文件输入流，写入指定的服务器端的目录中
	 *	*参数filename:指定保存文件的绝对路径。
	 *Part接口提供getName()方法：
	 *	*获取的是上传文件域的name属性值，并不是文件上传的真实名称
	 *	*servlet 3.0 获取不到上传文件的名称，这是servlet 3.0的一个诟病
	 *
	 * */
	Part part=request.getPart("upload");
	
	/*String filename=part.getName();
	System.out.print(filename);*/
	
	//获取上传文件的真实名称
	String header=part.getHeader("Content_Disposition");
	int index=header.lastIndexOf("filename=\"")+10;
	String filename=header.substring(index,header.length()-1);
	
	InputStream inputStream=part.getInputStream();
	String realpath=getServletContext().getRealPath("/WEB-INF/uploadfiles");
	
	part.write(realpath+"/" +filename);
    }
    
    public void destroy() {
  	super.destroy(); 
      }

  
}
