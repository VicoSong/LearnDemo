<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	//HttpSession mySession =request.getSession();
	//mySession.invalidate();
	
	request.setAttribute("name", "张三");
	request.removeAttribute("name");
	
%>
