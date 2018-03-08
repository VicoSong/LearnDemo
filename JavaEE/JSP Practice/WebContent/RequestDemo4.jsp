<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>使用request对象获得参数的所有参数值</title>
</head>
<body>
	<%--通过request对象的getParameterValues获得参数的所有参数值 --%>
	<%
		String[] strArr=request.getParameterValues("sport");
		out.println("喜欢的运动：");
		for(String str:strArr)
		{
			out.println(str);
		}
	%>
</body>
</html>