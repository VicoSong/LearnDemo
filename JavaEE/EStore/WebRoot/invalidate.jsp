<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 销毁Session
	session.invalidate();

	// 重定向到主页
	response.sendRedirect(request.getContextPath()+"/login.jsp");
%>