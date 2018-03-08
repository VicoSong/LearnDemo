package com.swk.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.swk.bean.User;
import com.swk.jdbc.JdbcUtils;
import com.swk.utils.C3p0Utiles;




/**
 * This Servlet is used to deal with login service
 * 
 */

public class AuthorityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AuthorityServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		User user=new User();
		try {
			/*BeanUtils.populate(user,request.getParameterMap());
			QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
			String selectSql="select username,password,role from demo.user where username=? and password=?";
			User newUser=runner.query(selectSql,new BeanHandler<User>(User.class),user.getUsername(),user.getPassword());
			*/
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			
			String selectSql="select username,password,role from demo.user where username=? and password=?";
			Connection conn=JdbcUtils.getConnection();
			PreparedStatement pstmt=conn.prepareStatement(selectSql);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			ResultSet rs=pstmt.executeQuery();
			List<User> userList=new ArrayList<User>(); 
			while(rs.next())
			{
				User resultUser=new User();
				resultUser.setUsername(rs.getString("username"));
				resultUser.setPassword(rs.getString("password"));
				resultUser.setRole(rs.getString("role"));
				userList.add(resultUser);
				
			}
			
			if(userList.size()==0)
			{
				//login fail
				request.setAttribute("error_message","你的用户名或密码不正确");
				request.getRequestDispatcher("/JSP/login.jsp").forward(request, response);;
			}else{
				//login success
				user=userList.get(0);
				request.getSession().setAttribute("user", user);
				
				response.sendRedirect("/PermissionControl/index.jsp");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
	}

}
