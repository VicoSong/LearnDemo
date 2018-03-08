package com.swk.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.swk.bean.User;
import com.swk.service.UserService;
import com.swk.service.impl.UserServiceImpl;

/**
 * Description:该servlet主要用于实现用户登录功能
 * @author Vico
 *
 */
public class LoginServlet extends HttpServlet {

    public LoginServlet() {
	super();
    }

   
    public void destroy() {
	super.destroy(); 
    }

    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	doPost(request, response);
    }

    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	//1.将表单数据封装到bean中
	User user=new User();
	try {
	    BeanUtils.populate(user, request.getParameterMap());
	    
	    //2.验证用户登录信息
	    UserService service=new UserServiceImpl();
	    User newUser=service.findUserByNickName(user);
	    if(newUser==null)
	    {
		//用户信息不存在
		request.setAttribute("error_msg", "用户名或密码不正确，请重新输入");
		request.getRequestDispatcher("/login.jsp").forward(request, response);
		return ;
	    }else{
		//用户信息正确，登录成功
		
		//记住用户信息
		String remeber=request.getParameter("remeber");
		if("on".equals(remeber))
		{
		    //需要记住用户名
		    Cookie cookie=new Cookie("user", user.getNickname()+"#"+user.getPassword());
		    cookie.setMaxAge(60*60*24*7);
		    cookie.setPath("/");
		    response.addCookie(cookie);
		}
		
		request.getSession().setAttribute("user", newUser);
		response.sendRedirect("index.jsp");
		
	    }
	    
	} catch (Exception e) {
	   
	    e.printStackTrace();
	} 

    }

    /**
     * Initialization of the servlet. <br>
     *
     * @throws ServletException if an error occurs
     */
    public void init() throws ServletException {
	// Put your code here
    }

}
