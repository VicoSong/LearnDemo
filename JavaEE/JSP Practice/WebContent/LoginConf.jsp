<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>µÇÂ¼ÅÐ¶Ï</title>
</head>
<body>
	<center>
		<%
			String userName=request.getParameter("username");
			String userPassword=request.getParameter("userpassword");
		%>
		<%
			if("James".equals(userName)&&"1234".equals(userPassword))
				{
		%>
		<jsp:forward page="LoginSucess.jsp"/>
		<%
				}
			else
			{
		%>
			<jsp:forward page="LoginFailure.jsp"/>
		<%
			}
		%>	
		
	</center>
</body>
</html>