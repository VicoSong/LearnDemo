package com.swk.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import com.swk.bean.User;
import com.swk.service.UserService;
import com.swk.service.impl.UserServiceImpl;

/**
 * Description:当前Servlet用于完成用户注册功能
 * @author Vico
 *
 */
public class RegisterServlet extends HttpServlet {
   
    public RegisterServlet() {
	super();
    }

    
    public void init() throws ServletException {
	// Put your code here
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
		doPost(request, response);
    }

   
    public void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	
	try {
	    	//1.接收表单中的所有内容
		User user=new User();
		BeanUtils.populate(user, request.getParameterMap());
		
		//2.判断两次输入的密码是否一致
		if(!user.getPassword().equals(user.getRepassword()))
		{
		    request.setAttribute("error_msg", "两次输入密码不一致，请重新输入！");
		    request.getRequestDispatcher("/regist.jsp").forward(request, response);
		    return ;
		}
		
		//2.一次验证码验证功能
		HttpSession session=request.getSession();
		String checkcode=(String) session.getAttribute("key");
		if(!checkcode.equals(user.getCheckcode()))  //验证码验证不通过
		{
		    request.setAttribute("error_msg", "验证码输入错误请重新输入！");
		    request.getRequestDispatcher("/regist.jsp").forward(request, response);
		    return ;
		}
		//一次验证通过,继续往下走
		//3.判断email地址是否存在
		UserService service=new UserServiceImpl();
		User newUser=service.findUser(user);
		if(newUser!=null)
		{
		    //说明email地址存在
		    request.setAttribute("error_msg", "您输入的邮箱地址已经存在，请重新输入！");
		    request.getRequestDispatcher("/regist.jsp").forward(request, response);
		    return ;
		}
		//email地址不存在
		
		//4.完成用户注册功能
		boolean flag=service.addUser(user);
		if(flag==true)
		{
		    //表示注册成功
		    request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		
		
		
	} catch (IllegalAccessException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (InvocationTargetException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	
    }

  
    
    /**
     * Destruction of the servlet. <br>
     */
    public void destroy() {
	super.destroy(); 
    }

}
